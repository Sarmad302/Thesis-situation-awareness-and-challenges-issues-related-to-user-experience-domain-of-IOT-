

#include <ESP8266Firebase.h>
#include <ESP8266WiFi.h>


// Set these to run example.
#define FIREBASE_HOST "https://console.firebase.google.com/u/0/project/cmwhms/database/cmwhms-default-rtdb/data/~2F"
#define FIREBASE_AUTH "NIoKXWTcHiCHeka7jIkOF8lwB661iUcwQItfGU1c"
#define WIFI_SSID "wifi"
#define WIFI_PASSWORD "password"


int recordmilsec=2000;
int rec=2100;
int pulse_data[2100];
float pulse_SMA[2000];
//int x = 0;

float val=0;
const int location_one=4; //D2;
const int location_two=5; //D1
int location=0;
const int smoke_pin=15; //D8;
int smoke_error=0;
//const int pulse_sensor=A0;

//float avg_pulse_val=0;
float curr_val=0;
int alarm_pin=0;//D3;
//float sum_sma=0;
float avg=0;
float BPM=0;
const int BPM_upper_limit=130;
const int BPM_low_limit=60;
//const int led_pin = 2;



#define _SSID "HUAWEI-zj3b"          // Your WiFi SSID
#define _PASSWORD "NfpQE4Z4"      // Your WiFi Password
#define REFERENCE_URL "https://cmwhms-default-rtdb.firebaseio.com/"  // Your Firebase project reference url

Firebase firebase(REFERENCE_URL);

void setup() {
  Serial.begin(115200);
  pinMode(LED_BUILTIN, OUTPUT);
  digitalWrite(LED_BUILTIN, LOW);
  WiFi.mode(WIFI_STA);
  WiFi.disconnect();
  delay(1000);

  // Connect to WiFi
  Serial.println();
  Serial.println();
  Serial.print("Connecting to: ");
  Serial.println(_SSID);
  WiFi.begin(_SSID, _PASSWORD);

  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print("-");
  }

  Serial.println("");
  Serial.println("WiFi Connected");

  // Print the IP address
  Serial.print("IP Address: ");
  Serial.print("http://");
  Serial.print(WiFi.localIP());
  Serial.println("/");
  digitalWrite(LED_BUILTIN, HIGH);

firebase.pushInt("Location", 1);
firebase.pushFloat("Heart Rate", 10.1);
firebase.pushInt("Smoke Detection", 1);



  // initialize the serial communication:

pinMode(location_one, INPUT); // Setup for leads off detection LO +
pinMode(location_two, INPUT); // Setup for leads off detection LO -
pinMode(smoke_pin,INPUT);
pinMode(alarm_pin,OUTPUT);
digitalWrite(alarm_pin,LOW);
//pinMode(led_pin,OUTPUT);
//digitalWrite(led_pin,LOW);
 




}

void loop() 
{
  





//avg_pulse_val=0;
//curr_val=0;
//Serial.println("start");

//digitalWrite(led,HIGH);
for (int i = 0 ; i <= rec; i += 1)
{

    pulse_data[i]=analogRead(A0);//curr_val/100;
    delay(1);
}



for(int i=0;i<=recordmilsec;i+=1)
{curr_val=0;
  for(int k=i;k<=i+100;k+=1)
  {curr_val=curr_val+pulse_data[k];}
  pulse_SMA[i]=curr_val/100;
  }

avg=0;
for (int j = 0 ; j <= recordmilsec; j += 1)
{avg=avg+(pulse_SMA[j]);
}
avg=avg/recordmilsec;


//sum_sma=0;
BPM=0;

int j=0;
  while(1)
  {
    if(pulse_SMA[j]-avg<0)
     {break;}
    j++;
  }

  while(1)
  {
    if(pulse_SMA[j]-avg>0)
     {break;}
     j++;
  }

    while(1)
  {
    if(pulse_SMA[j]-avg<0)
     {break;}
     BPM++;
    j++;
  }

    while(1)
  {
    if(pulse_SMA[j]-avg>0)
     {break;}
     BPM++;
    j++;}





  //Serial.println((pulse_SMA[j]-844)*1000);
  //Serial.println(pulse_data[j]);
    //pulse_data[i]=analogRead(A0);//curr_val/100;
    //delay(1);



if(digitalRead(location_one)==1)
{
  location=1;
  }
else if(digitalRead(location_two)==1)
{
  location=2;
  }

else
{
  location=0;}


BPM=60000/BPM;
//BPM=(BPM*(60000/recordmilsec));
smoke_error= (digitalRead(smoke_pin)-1)*(-1);

if(smoke_error==1||BPM>=BPM_upper_limit||BPM<=BPM_low_limit)
{digitalWrite(alarm_pin,HIGH);}

else
{digitalWrite(alarm_pin,LOW);}


// Serial.print("BPM : ");
//Serial.println(BPM);
// Serial.print("         Location : ");
//Serial.println(location);
// Serial.print("         smoke : ");
//Serial.println(smoke_error);
// Serial.println();
  ///////////////////////////////////////////////////////////////////////////////////

//x = x+1;
firebase.setInt("Location", location);
firebase.setFloat("Heart Rate", BPM);
firebase.setInt("Smoke Detection", smoke_error);


//Serial.println(x);
Serial.println("data pushed to firebase");


}