package appinventor.ai_saeediqbal0078.Coalminers;

import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.FirebaseDB;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.TableArrangement;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.StopBlocksExecution;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import com.puravidaapps.TaifunNotification;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen3.yail */
public class Screen3 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen3").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("ActionBar").readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("DataChanged").readResolve());
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("$tag").readResolve());
    static final PairWithPosition Lit102 = PairWithPosition.make(Lit129, PairWithPosition.make(Lit129, LList.Empty, "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 798822), "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 798817);
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("$value").readResolve());
    static final PairWithPosition Lit104 = PairWithPosition.make(Lit129, PairWithPosition.make(Lit129, LList.Empty, "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 798986), "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 798981);
    static final PairWithPosition Lit105 = PairWithPosition.make(Lit129, PairWithPosition.make(Lit129, LList.Empty, "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 799150), "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 799145);
    static final PairWithPosition Lit106 = PairWithPosition.make(Lit9, PairWithPosition.make(Lit9, LList.Empty, "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 799498), "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 799490);
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("TaifunNotification1").readResolve());
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("Send").readResolve());
    static final IntNum Lit109 = IntNum.make(5);
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final PairWithPosition Lit110;
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("FirebaseDB1$GotValue").readResolve());
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("GotValue").readResolve());
    static final FString Lit113 = new FString("com.puravidaapps.TaifunNotification");
    static final FString Lit114 = new FString("com.puravidaapps.TaifunNotification");
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final SimpleSymbol Lit120 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit122 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit124 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit126 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit127 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit128 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit129 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final IntNum Lit13 = IntNum.make(3);
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit15 = IntNum.make(2);
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit17;
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("Scrollable").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("Theme").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final FString Lit25 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit26 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit28 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("TextBox1").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$BPMLimit").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final IntNum Lit31;
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("FontItalic").readResolve());
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("Hint").readResolve());
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit37 = IntNum.make(1);
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit39 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol("g$BPM").readResolve());
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("TableArrangement1").readResolve());
    static final FString Lit41 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final FString Lit42 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("Temp3").readResolve());
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("Column").readResolve());
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit46 = IntNum.make(-1010);
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("Row").readResolve());
    static final IntNum Lit48 = IntNum.make(0);
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("g$Location").readResolve());
    static final IntNum Lit50 = IntNum.make(-1040);
    static final FString Lit51 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit52 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit53 = ((SimpleSymbol) new SimpleSymbol("humid3").readResolve());
    static final IntNum Lit54 = IntNum.make(-1010);
    static final IntNum Lit55 = IntNum.make(-1040);
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit57 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final IntNum Lit59 = IntNum.make(-2);
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("g$smoke").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final IntNum Lit61 = IntNum.make(-1050);
    static final FString Lit62 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("Image2").readResolve());
    static final IntNum Lit65 = IntNum.make(-1050);
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit67 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("TableArrangement2").readResolve());
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("smoke3").readResolve());
    static final IntNum Lit72 = IntNum.make(-1010);
    static final IntNum Lit73 = IntNum.make(-1040);
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit75 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("Image3").readResolve());
    static final IntNum Lit77 = IntNum.make(-1050);
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit79 = new FString("com.google.appinventor.components.runtime.Button");
    static final IntNum Lit8;
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit81;
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit83 = IntNum.make(18);
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit85;
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit87 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    static final SimpleSymbol Lit88 = ((SimpleSymbol) new SimpleSymbol("FirebaseDB1").readResolve());
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("DefaultURL").readResolve());
    static final SimpleSymbol Lit9;
    static final SimpleSymbol Lit90 = ((SimpleSymbol) new SimpleSymbol("DeveloperBucket").readResolve());
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("FirebaseToken").readResolve());
    static final SimpleSymbol Lit92 = ((SimpleSymbol) new SimpleSymbol("FirebaseURL").readResolve());
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("ProjectBucket").readResolve());
    static final FString Lit94 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("GetValue").readResolve());
    static final PairWithPosition Lit96 = PairWithPosition.make(Lit17, PairWithPosition.make(Lit129, LList.Empty, "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 790624), "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 790618);
    static final PairWithPosition Lit97 = PairWithPosition.make(Lit17, PairWithPosition.make(Lit129, LList.Empty, "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 790722), "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 790716);
    static final PairWithPosition Lit98 = PairWithPosition.make(Lit17, PairWithPosition.make(Lit129, LList.Empty, "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 790825), "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 790819);
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("FirebaseDB1$DataChanged").readResolve());
    public static Screen3 Screen3;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public FirebaseDB FirebaseDB1;
    public final ModuleMethod FirebaseDB1$DataChanged;
    public final ModuleMethod FirebaseDB1$GotValue;
    public Image Image1;
    public Image Image2;
    public Image Image3;
    public TableArrangement TableArrangement1;
    public TableArrangement TableArrangement2;
    public TaifunNotification TaifunNotification1;
    public TextBox Temp3;
    public TextBox TextBox1;
    public VerticalArrangement VerticalArrangement1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public TextBox humid3;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;
    public TextBox smoke3;

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit9 = simpleSymbol;
        SimpleSymbol simpleSymbol2 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit17 = simpleSymbol2;
        Lit110 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(simpleSymbol2, PairWithPosition.make(Lit17, PairWithPosition.make(Lit17, LList.Empty, "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 799671), "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 799666), "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 799661), "/tmp/1704646147819_0.49453817869129957-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers/Screen3.yail", 799653);
        int[] iArr = new int[2];
        iArr[0] = -16776961;
        Lit85 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -256;
        Lit81 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -65536;
        Lit31 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -16776961;
        Lit8 = IntNum.make(iArr4);
    }

    public Screen3() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit115, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit116, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit117, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit118, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit119, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit120, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit121, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit122, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit123, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit124, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit125, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit126, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit127, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit128, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime1744599516757694090.scm:634");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, (Object) null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, (Object) null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 22, (Object) null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 23, (Object) null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 24, (Object) null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 25, (Object) null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 26, (Object) null, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 27, (Object) null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 28, (Object) null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 29, (Object) null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 30, (Object) null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 31, (Object) null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 32, (Object) null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 33, (Object) null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 34, (Object) null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 35, (Object) null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 36, (Object) null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 37, (Object) null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 38, (Object) null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 39, (Object) null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 40, (Object) null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 41, (Object) null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 42, (Object) null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 43, (Object) null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 44, (Object) null, 0);
        this.FirebaseDB1$DataChanged = new ModuleMethod(frame2, 45, Lit99, 8194);
        this.FirebaseDB1$GotValue = new ModuleMethod(frame2, 46, Lit111, 8194);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        String obj;
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Screen3 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find2).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, "130"), $result);
                } else {
                    addToGlobalVars(Lit3, lambda$Fn2);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit4, Component.TYPEFACE_DEFAULT), $result);
                } else {
                    addToGlobalVars(Lit4, lambda$Fn3);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit5, Component.TYPEFACE_DEFAULT), $result);
                } else {
                    addToGlobalVars(Lit5, lambda$Fn4);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit6, Component.TYPEFACE_DEFAULT), $result);
                } else {
                    addToGlobalVars(Lit6, lambda$Fn5);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit7, Lit8, Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Boolean.TRUE, Lit11);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Lit13, Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "firebase", Lit17);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "unspecified", Lit17);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.TRUE, Lit11);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.FALSE, Lit11);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "Fixed", Lit17);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "AppTheme.Light", Lit17);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "Screen3", Lit17);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.FALSE, Lit11), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn6));
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit25, Lit26, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit0, Lit27, Lit26, lambda$Fn8);
                }
                this.TextBox1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit26, Lit28, Lit29, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit26, Lit38, Lit29, lambda$Fn10);
                }
                this.TableArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit39, Lit40, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit41, Lit40, Boolean.FALSE);
                }
                this.Temp3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit40, Lit42, Lit43, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit40, Lit51, Lit43, lambda$Fn12);
                }
                this.humid3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit40, Lit52, Lit53, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit40, Lit56, Lit53, lambda$Fn14);
                }
                this.Image1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit40, Lit57, Lit58, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit40, Lit62, Lit58, lambda$Fn16);
                }
                this.Image2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit40, Lit63, Lit64, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit40, Lit66, Lit64, lambda$Fn18);
                }
                this.TableArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit67, Lit68, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit69, Lit68, Boolean.FALSE);
                }
                this.smoke3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit68, Lit70, Lit71, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit68, Lit74, Lit71, lambda$Fn20);
                }
                this.Image3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit68, Lit75, Lit76, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit68, Lit78, Lit76, lambda$Fn22);
                }
                this.Button1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit79, Lit80, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit0, Lit86, Lit80, lambda$Fn24);
                }
                this.FirebaseDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit87, Lit88, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit0, Lit94, Lit88, lambda$Fn26);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit99, this.FirebaseDB1$DataChanged);
                } else {
                    addToFormEnvironment(Lit99, this.FirebaseDB1$DataChanged);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "FirebaseDB1", "DataChanged");
                } else {
                    addToEvents(Lit88, Lit100);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit111, this.FirebaseDB1$GotValue);
                } else {
                    addToFormEnvironment(Lit111, this.FirebaseDB1$GotValue);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "FirebaseDB1", "GotValue");
                } else {
                    addToEvents(Lit88, Lit112);
                }
                this.TaifunNotification1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit113, Lit107, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit114, Lit107, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find2);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static String lambda3() {
        return "130";
    }

    static String lambda4() {
        return Component.TYPEFACE_DEFAULT;
    }

    static String lambda5() {
        return Component.TYPEFACE_DEFAULT;
    }

    static String lambda6() {
        return Component.TYPEFACE_DEFAULT;
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit7, Lit8, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Lit13, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit16, "firebase", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "unspecified", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.FALSE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "Fixed", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "AppTheme.Light", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "Screen3", Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.FALSE, Lit11);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit26, Lit12, Lit13, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit26, Lit14, Lit15, Lit9);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit26, Lit12, Lit13, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit26, Lit14, Lit15, Lit9);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Lit31, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit32, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit33, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit34, "Hint for TextBox1", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit35, "Data ", Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit36, Lit37, Lit9);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Lit31, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit32, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit33, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit34, "Hint for TextBox1", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit35, "Data ", Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit36, Lit37, Lit9);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit43, Lit44, Lit37, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit43, Lit45, Lit46, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit43, Lit34, "Hint for TextBox2", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit43, Lit47, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit43, Lit36, Lit37, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit43, Lit49, Lit50, Lit9);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit43, Lit44, Lit37, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit43, Lit45, Lit46, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit43, Lit34, "Hint for TextBox2", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit43, Lit47, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit43, Lit36, Lit37, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit43, Lit49, Lit50, Lit9);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit53, Lit44, Lit37, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit45, Lit54, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit34, "Hint for TextBox3", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit47, Lit37, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit36, Lit37, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit53, Lit49, Lit55, Lit9);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit53, Lit44, Lit37, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit45, Lit54, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit34, "Hint for TextBox3", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit47, Lit37, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit36, Lit37, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit53, Lit49, Lit55, Lit9);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit58, Lit44, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit45, Lit59, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit60, "heartrate.png", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit47, Lit48, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit58, Lit49, Lit61, Lit9);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit58, Lit44, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit45, Lit59, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit60, "heartrate.png", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit47, Lit48, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit58, Lit49, Lit61, Lit9);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit64, Lit44, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit45, Lit59, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit60, "location.png", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit47, Lit37, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit64, Lit49, Lit65, Lit9);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit64, Lit44, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit45, Lit59, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit60, "location.png", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit47, Lit37, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit64, Lit49, Lit65, Lit9);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit44, Lit37, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit45, Lit72, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit34, "Hint for TextBox4", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit47, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit36, Lit37, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit49, Lit73, Lit9);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit44, Lit37, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit45, Lit72, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit34, "Hint for TextBox4", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit47, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit36, Lit37, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit49, Lit73, Lit9);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit76, Lit44, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit45, Lit59, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit60, "smoek.png", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit47, Lit48, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit49, Lit77, Lit9);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit76, Lit44, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit45, Lit59, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit60, "smoek.png", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit47, Lit48, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit49, Lit77, Lit9);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit30, Lit81, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit32, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit33, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit82, Lit83, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit35, "Emergency", Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit84, Lit85, Lit9);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit30, Lit81, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit32, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit33, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit82, Lit83, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit35, "Emergency", Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit84, Lit85, Lit9);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit88, Lit89, "https://dazzling-fire-7140.firebaseio.com/", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit88, Lit90, "saeediqbal0078@gmail:com/", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit88, Lit91, "NIoKXWTcHiCHeka7jIkOF8lwB661iUcwQItfGU1c", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit88, Lit92, "https://cmwhms-default-rtdb.firebaseio.com/", Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit88, Lit93, "Coalminers_admin", Lit17);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit88, Lit89, "https://dazzling-fire-7140.firebaseio.com/", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit88, Lit90, "saeediqbal0078@gmail:com/", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit88, Lit91, "NIoKXWTcHiCHeka7jIkOF8lwB661iUcwQItfGU1c", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit88, Lit92, "https://cmwhms-default-rtdb.firebaseio.com/", Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit88, Lit93, "Coalminers_admin", Lit17);
    }

    public Object FirebaseDB1$DataChanged(Object $tag, Object $value) {
        runtime.sanitizeComponentData($tag);
        runtime.sanitizeComponentData($value);
        runtime.setThisForm();
        runtime.callComponentMethod(Lit88, Lit95, LList.list2("/Location", Component.TYPEFACE_DEFAULT), Lit96);
        runtime.callComponentMethod(Lit88, Lit95, LList.list2("/Heart Rate", Component.TYPEFACE_DEFAULT), Lit97);
        return runtime.callComponentMethod(Lit88, Lit95, LList.list2("/Smoke Detection", Component.TYPEFACE_DEFAULT), Lit98);
    }

    public Object FirebaseDB1$GotValue(Object $tag, Object $value) {
        Object obj;
        Object $tag2 = runtime.sanitizeComponentData($tag);
        Object $value2 = runtime.sanitizeComponentData($value);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($tag2 instanceof Package) {
            obj = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit101), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj = $tag2;
        }
        if (runtime.callYailPrimitive(moduleMethod, LList.list2(obj, "/Location"), Lit102, "=") != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit5, $value2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit103), " is not bound in the current context"), "Unbound Variable") : $value2);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($tag2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit101), " is not bound in the current context"), "Unbound Variable") : $tag2, "/Heart Rate"), Lit104, "=") != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit4, $value2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit103), " is not bound in the current context"), "Unbound Variable") : $value2);
        }
        ModuleMethod moduleMethod2 = runtime.yail$Mnequal$Qu;
        if ($tag2 instanceof Package) {
            $tag2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit101), " is not bound in the current context"), "Unbound Variable");
        }
        if (runtime.callYailPrimitive(moduleMethod2, LList.list2($tag2, "/Smoke Detection"), Lit105, "=") != Boolean.FALSE) {
            SimpleSymbol simpleSymbol = Lit6;
            if ($value2 instanceof Package) {
                $value2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit103), " is not bound in the current context"), "Unbound Variable");
            }
            runtime.addGlobalVarToCurrentFormEnvironment(simpleSymbol, $value2);
        }
        runtime.setAndCoerceProperty$Ex(Lit43, Lit35, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St), Lit17);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit35, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St), Lit17);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit35, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit6, runtime.$Stthe$Mnnull$Mnvalue$St), Lit17);
        return runtime.callYailPrimitive(Scheme.numGrt, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit106, ">") != Boolean.FALSE ? runtime.callComponentMethod(Lit107, Lit108, LList.list4(Lit109, "High Heart Rate", "Check Heart Rate", "Check Heart Rate"), Lit110) : Values.empty;
    }

    /* compiled from: Screen3.yail */
    public class frame extends ModuleBody {
        Screen3 $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Screen3)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 14:
                    if (!(obj instanceof Screen3)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 45:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 46:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 15:
                    if (!(obj instanceof Screen3)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof Screen3)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 3:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "is-bound-in-form-environment", 1, obj);
                    }
                case 12:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 13:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 14:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            boolean z = true;
            switch (moduleMethod.selector) {
                case 10:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 16:
                    Screen3 screen3 = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    screen3.dispatchGenericEvent(component, str, z, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 4:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 8:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 9:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 11:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
                case 45:
                    return this.$main.FirebaseDB1$DataChanged(obj, obj2);
                case 46:
                    return this.$main.FirebaseDB1$GotValue(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Screen3.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Screen3.lambda3();
                case 21:
                    return Screen3.lambda4();
                case 22:
                    return Screen3.lambda5();
                case 23:
                    return Screen3.lambda6();
                case 24:
                    return Screen3.lambda7();
                case 25:
                    return Screen3.lambda8();
                case 26:
                    return Screen3.lambda9();
                case 27:
                    return Screen3.lambda10();
                case 28:
                    return Screen3.lambda11();
                case 29:
                    return Screen3.lambda12();
                case 30:
                    return Screen3.lambda13();
                case 31:
                    return Screen3.lambda14();
                case 32:
                    return Screen3.lambda15();
                case 33:
                    return Screen3.lambda16();
                case 34:
                    return Screen3.lambda17();
                case 35:
                    return Screen3.lambda18();
                case 36:
                    return Screen3.lambda19();
                case 37:
                    return Screen3.lambda20();
                case 38:
                    return Screen3.lambda21();
                case 39:
                    return Screen3.lambda22();
                case 40:
                    return Screen3.lambda23();
                case 41:
                    return Screen3.lambda24();
                case 42:
                    return Screen3.lambda25();
                case 43:
                    return Screen3.lambda26();
                case 44:
                    return Screen3.lambda27();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(false);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (StopBlocksExecution e) {
                return false;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        Boolean bool;
        boolean x = true;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                apply.apply2(handler, lists.cons(componentObject, lists.cons(bool, LList.makeList(args, 0))));
            } catch (StopBlocksExecution e) {
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this != componentObject) {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Object reverse;
        Object obj;
        Object reverse2;
        Object obj2;
        Object obj3;
        Object var;
        Object component$Mnname;
        Object obj4;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen3 = this;
        addToFormEnvironment(Lit0, this);
        Object obj5 = this.events$Mnto$Mnregister;
        while (obj5 != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj5;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj6 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj6, apply12 == null ? null : apply12.toString());
                obj5 = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj5);
            }
        }
        try {
            LList components = lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            reverse = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse != LList.Empty) {
                Pair arg02 = (Pair) reverse;
                misc.force(arg02.getCar());
                reverse = arg02.getCdr();
            }
            obj = components;
            while (obj != LList.Empty) {
                Pair arg03 = (Pair) obj;
                Object component$Mninfo = arg03.getCar();
                component$Mnname = lists.caddr.apply1(component$Mninfo);
                lists.cadddr.apply1(component$Mninfo);
                Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
                SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                obj = arg03.getCdr();
            }
            reverse2 = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse2 != LList.Empty) {
                Pair arg04 = (Pair) reverse2;
                Object var$Mnval = arg04.getCar();
                var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                reverse2 = arg04.getCdr();
            }
            LList component$Mndescriptors = components;
            obj2 = component$Mndescriptors;
            while (obj2 != LList.Empty) {
                Pair arg05 = (Pair) obj2;
                Object component$Mninfo2 = arg05.getCar();
                lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                obj2 = arg05.getCdr();
            }
            obj3 = component$Mndescriptors;
            while (obj3 != LList.Empty) {
                Pair arg06 = (Pair) obj3;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = lists.caddr.apply1(component$Mninfo3);
                lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                obj3 = arg06.getCdr();
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "arg0", -2, obj3);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "arg0", -2, obj2);
        } catch (ClassCastException e4) {
            throw new WrongType(e4, "add-to-global-var-environment", 0, var);
        } catch (ClassCastException e5) {
            throw new WrongType(e5, "arg0", -2, reverse2);
        } catch (ClassCastException e6) {
            throw new WrongType(e6, "add-to-form-environment", 0, component$Mnname);
        } catch (ClassCastException e7) {
            throw new WrongType(e7, "lookup-in-form-environment", 0, obj4);
        } catch (ClassCastException e8) {
            throw new WrongType(e8, "arg0", -2, obj);
        } catch (ClassCastException e9) {
            throw new WrongType(e9, "arg0", -2, reverse);
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        LList lList = symbols;
        while (lList != LList.Empty) {
            try {
                Pair arg0 = (Pair) lList;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    lList = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, lList);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, apply2);
        }
    }

    static Object lambda2() {
        return null;
    }
}
