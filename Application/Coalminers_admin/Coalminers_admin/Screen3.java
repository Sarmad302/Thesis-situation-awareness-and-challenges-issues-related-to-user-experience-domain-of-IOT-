package appinventor.ai_saeediqbal0078.Coalminers_admin;

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
import com.google.appinventor.components.runtime.PhoneCall;
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
    static final PairWithPosition Lit100 = PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, LList.Empty, "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 749834), "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 749829);
    static final PairWithPosition Lit101 = PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, LList.Empty, "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 749998), "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 749993);
    static final PairWithPosition Lit102 = PairWithPosition.make(Lit9, PairWithPosition.make(Lit9, LList.Empty, "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 750346), "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 750338);
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("TaifunNotification1").readResolve());
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("Send").readResolve());
    static final IntNum Lit105 = IntNum.make(5);
    static final PairWithPosition Lit106;
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("FirebaseDB1$GotValue").readResolve());
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("GotValue").readResolve());
    static final FString Lit109 = new FString("com.puravidaapps.TaifunNotification");
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final FString Lit110 = new FString("com.puravidaapps.TaifunNotification");
    static final FString Lit111 = new FString("com.google.appinventor.components.runtime.PhoneCall");
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("PhoneNumber").readResolve());
    static final FString Lit113 = new FString("com.google.appinventor.components.runtime.PhoneCall");
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final SimpleSymbol Lit120 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit122 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit124 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit125 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit126 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit127 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit128 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final IntNum Lit13 = IntNum.make(3);
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve());
    static final IntNum Lit15 = IntNum.make(2);
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit17;
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("Theme").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final FString Lit24 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit25 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final FString Lit26 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("TextBox1").readResolve());
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$BPMLimit").readResolve());
    static final IntNum Lit30;
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("FontItalic").readResolve());
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("Hint").readResolve());
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit36 = IntNum.make(1);
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit38;
    static final FString Lit39 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit4 = ((SimpleSymbol) new SimpleSymbol("g$BPM").readResolve());
    static final FString Lit40 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("TableArrangement1").readResolve());
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("Rows").readResolve());
    static final FString Lit43 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("Temp3").readResolve());
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("Column").readResolve());
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("Row").readResolve());
    static final IntNum Lit48 = IntNum.make(0);
    static final FString Lit49 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("g$Location").readResolve());
    static final FString Lit50 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("humid3").readResolve());
    static final FString Lit52 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("smoke3").readResolve());
    static final FString Lit55 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit59 = IntNum.make(-2);
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("g$smoke").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit62 = IntNum.make(-1050);
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit64 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("Image2").readResolve());
    static final IntNum Lit66 = IntNum.make(-1050);
    static final FString Lit67 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit68 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("Image3").readResolve());
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("AccentColor").readResolve());
    static final IntNum Lit70 = IntNum.make(-1050);
    static final FString Lit71 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit72 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit73 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit74;
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit76 = IntNum.make(18);
    static final IntNum Lit77;
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("PhoneCall1").readResolve());
    static final IntNum Lit8;
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("MakePhoneCall").readResolve());
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("FirebaseDB1").readResolve());
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("DefaultURL").readResolve());
    static final SimpleSymbol Lit86 = ((SimpleSymbol) new SimpleSymbol("DeveloperBucket").readResolve());
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("FirebaseToken").readResolve());
    static final SimpleSymbol Lit88 = ((SimpleSymbol) new SimpleSymbol("FirebaseURL").readResolve());
    static final SimpleSymbol Lit89 = ((SimpleSymbol) new SimpleSymbol("ProjectBucket").readResolve());
    static final SimpleSymbol Lit9;
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("GetValue").readResolve());
    static final PairWithPosition Lit92 = PairWithPosition.make(Lit17, PairWithPosition.make(Lit128, LList.Empty, "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 741472), "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 741466);
    static final PairWithPosition Lit93 = PairWithPosition.make(Lit17, PairWithPosition.make(Lit128, LList.Empty, "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 741570), "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 741564);
    static final PairWithPosition Lit94 = PairWithPosition.make(Lit17, PairWithPosition.make(Lit128, LList.Empty, "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 741673), "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 741667);
    static final SimpleSymbol Lit95 = ((SimpleSymbol) new SimpleSymbol("FirebaseDB1$DataChanged").readResolve());
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("DataChanged").readResolve());
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("$tag").readResolve());
    static final PairWithPosition Lit98 = PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, LList.Empty, "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 749670), "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 749665);
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("$value").readResolve());
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
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public FirebaseDB FirebaseDB1;
    public final ModuleMethod FirebaseDB1$DataChanged;
    public final ModuleMethod FirebaseDB1$GotValue;
    public Image Image1;
    public Image Image2;
    public Image Image3;
    public PhoneCall PhoneCall1;
    public TableArrangement TableArrangement1;
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
        Lit106 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(simpleSymbol2, PairWithPosition.make(Lit17, PairWithPosition.make(Lit17, LList.Empty, "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 750519), "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 750514), "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 750509), "/tmp/1704354738509_0.9324737107460097-0/youngandroidproject/../src/appinventor/ai_saeediqbal0078/Coalminers_admin/Screen3.yail", 750501);
        int[] iArr = new int[2];
        iArr[0] = -16776961;
        Lit77 = IntNum.make(iArr);
        int[] iArr2 = new int[2];
        iArr2[0] = -256;
        Lit74 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit38 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -65536;
        Lit30 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -16776961;
        Lit8 = IntNum.make(iArr5);
    }

    public Screen3() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit114, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit115, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit116, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit117, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit118, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit119, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit120, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit121, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit122, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit123, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit124, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit125, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit126, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit127, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, (Object) null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime3331458695655746479.scm:634");
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
        this.Button1$Click = new ModuleMethod(frame2, 45, Lit81, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 46, (Object) null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 47, (Object) null, 0);
        this.FirebaseDB1$DataChanged = new ModuleMethod(frame2, 48, Lit95, 8194);
        this.FirebaseDB1$GotValue = new ModuleMethod(frame2, 49, Lit107, 8194);
        lambda$Fn29 = new ModuleMethod(frame2, 50, (Object) null, 0);
        lambda$Fn30 = new ModuleMethod(frame2, 51, (Object) null, 0);
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
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "fade", Lit17);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "unspecified", Lit17);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.FALSE, Lit11);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "Fixed", Lit17);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "AppTheme.Light", Lit17);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "Worker 1", Lit17), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn6));
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit24, Lit25, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit0, Lit26, Lit25, lambda$Fn8);
                }
                this.TextBox1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit25, Lit27, Lit28, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit25, Lit39, Lit28, lambda$Fn10);
                }
                this.TableArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit40, Lit41, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit0, Lit43, Lit41, lambda$Fn12);
                }
                this.Temp3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit44, Lit45, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit41, Lit49, Lit45, lambda$Fn14);
                }
                this.humid3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit50, Lit51, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit41, Lit52, Lit51, lambda$Fn16);
                }
                this.smoke3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit53, Lit54, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit41, Lit55, Lit54, lambda$Fn18);
                }
                this.Image1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit56, Lit57, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit41, Lit63, Lit57, lambda$Fn20);
                }
                this.Image2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit64, Lit65, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit41, Lit67, Lit65, lambda$Fn22);
                }
                this.Image3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit68, Lit69, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit41, Lit71, Lit69, lambda$Fn24);
                }
                this.Button1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit72, Lit73, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit0, Lit78, Lit73, lambda$Fn26);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit81, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit81, this.Button1$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit73, Lit82);
                }
                this.FirebaseDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit83, Lit84, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit0, Lit90, Lit84, lambda$Fn28);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit95, this.FirebaseDB1$DataChanged);
                } else {
                    addToFormEnvironment(Lit95, this.FirebaseDB1$DataChanged);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "FirebaseDB1", "DataChanged");
                } else {
                    addToEvents(Lit84, Lit96);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit107, this.FirebaseDB1$GotValue);
                } else {
                    addToFormEnvironment(Lit107, this.FirebaseDB1$GotValue);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "FirebaseDB1", "GotValue");
                } else {
                    addToEvents(Lit84, Lit108);
                }
                this.TaifunNotification1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit109, Lit103, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit110, Lit103, Boolean.FALSE);
                }
                this.PhoneCall1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit111, Lit79, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit0, Lit113, Lit79, lambda$Fn30);
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
        runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "fade", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "unspecified", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.FALSE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "Fixed", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "AppTheme.Light", Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit23, "Worker 1", Lit17);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit25, Lit12, Lit13, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit14, Lit15, Lit9);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit25, Lit12, Lit13, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit25, Lit14, Lit15, Lit9);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Lit30, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit31, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit32, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit33, "Hint for TextBox1", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit34, "Data ", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit35, Lit36, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit28, Lit37, Lit38, Lit9);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Lit30, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit31, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit32, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit33, "Hint for TextBox1", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit34, "Data ", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit35, Lit36, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit28, Lit37, Lit38, Lit9);
    }

    static Object lambda12() {
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit42, Lit13, Lit9);
    }

    static Object lambda13() {
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit42, Lit13, Lit9);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit46, Lit36, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit33, "95", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit47, Lit48, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit35, Lit36, Lit9);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit46, Lit36, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit33, "95", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit47, Lit48, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit35, Lit36, Lit9);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit46, Lit36, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit33, Component.TYPEFACE_SANSSERIF, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit47, Lit36, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit35, Lit36, Lit9);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit46, Lit36, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit33, Component.TYPEFACE_SANSSERIF, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit47, Lit36, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit35, Lit36, Lit9);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit46, Lit36, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit33, "Nil", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit47, Lit15, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit35, Lit36, Lit9);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit46, Lit36, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit33, "Nil", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit47, Lit15, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit35, Lit36, Lit9);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit57, Lit46, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit58, Lit59, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit60, "heartrate.png", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit47, Lit48, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit57, Lit61, Lit62, Lit9);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit57, Lit46, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit58, Lit59, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit60, "heartrate.png", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit57, Lit47, Lit48, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit57, Lit61, Lit62, Lit9);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit46, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit58, Lit59, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit60, "location.png", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit47, Lit36, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit61, Lit66, Lit9);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit46, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit58, Lit59, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit60, "location.png", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit47, Lit36, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit61, Lit66, Lit9);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit69, Lit46, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit58, Lit59, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit60, "smoek.png", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit47, Lit15, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit69, Lit61, Lit70, Lit9);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit69, Lit46, Lit48, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit58, Lit59, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit60, "smoek.png", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit47, Lit15, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit69, Lit61, Lit70, Lit9);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit73, Lit29, Lit74, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit31, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit32, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit75, Lit76, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit34, "Emergency ", Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit73, Lit37, Lit77, Lit9);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit73, Lit29, Lit74, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit31, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit32, Boolean.TRUE, Lit11);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit75, Lit76, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit73, Lit34, "Emergency ", Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit73, Lit37, Lit77, Lit9);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit79, Lit80, LList.Empty, LList.Empty);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit84, Lit85, "https://dazzling-fire-7140.firebaseio.com/", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit84, Lit86, "saeediqbal0078@gmail:com/", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit84, Lit87, "NIoKXWTcHiCHeka7jIkOF8lwB661iUcwQItfGU1c", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit84, Lit88, "https://cmwhms-default-rtdb.firebaseio.com/", Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit84, Lit89, "Coalminers_admin", Lit17);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit84, Lit85, "https://dazzling-fire-7140.firebaseio.com/", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit84, Lit86, "saeediqbal0078@gmail:com/", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit84, Lit87, "NIoKXWTcHiCHeka7jIkOF8lwB661iUcwQItfGU1c", Lit17);
        runtime.setAndCoerceProperty$Ex(Lit84, Lit88, "https://cmwhms-default-rtdb.firebaseio.com/", Lit17);
        return runtime.setAndCoerceProperty$Ex(Lit84, Lit89, "Coalminers_admin", Lit17);
    }

    public Object FirebaseDB1$DataChanged(Object $tag, Object $value) {
        runtime.sanitizeComponentData($tag);
        runtime.sanitizeComponentData($value);
        runtime.setThisForm();
        runtime.callComponentMethod(Lit84, Lit91, LList.list2("/Location", Component.TYPEFACE_DEFAULT), Lit92);
        runtime.callComponentMethod(Lit84, Lit91, LList.list2("/Heart Rate", Component.TYPEFACE_DEFAULT), Lit93);
        return runtime.callComponentMethod(Lit84, Lit91, LList.list2("/Smoke Detection", Component.TYPEFACE_DEFAULT), Lit94);
    }

    public Object FirebaseDB1$GotValue(Object $tag, Object $value) {
        Object obj;
        Object $tag2 = runtime.sanitizeComponentData($tag);
        Object $value2 = runtime.sanitizeComponentData($value);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($tag2 instanceof Package) {
            obj = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit97), " is not bound in the current context"), "Unbound Variable");
        } else {
            obj = $tag2;
        }
        if (runtime.callYailPrimitive(moduleMethod, LList.list2(obj, "/Location"), Lit98, "=") != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit5, $value2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit99), " is not bound in the current context"), "Unbound Variable") : $value2);
        }
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2($tag2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit97), " is not bound in the current context"), "Unbound Variable") : $tag2, "/Heart Rate"), Lit100, "=") != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit4, $value2 instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit99), " is not bound in the current context"), "Unbound Variable") : $value2);
        }
        ModuleMethod moduleMethod2 = runtime.yail$Mnequal$Qu;
        if ($tag2 instanceof Package) {
            $tag2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit97), " is not bound in the current context"), "Unbound Variable");
        }
        if (runtime.callYailPrimitive(moduleMethod2, LList.list2($tag2, "/Smoke Detection"), Lit101, "=") != Boolean.FALSE) {
            SimpleSymbol simpleSymbol = Lit6;
            if ($value2 instanceof Package) {
                $value2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit99), " is not bound in the current context"), "Unbound Variable");
            }
            runtime.addGlobalVarToCurrentFormEnvironment(simpleSymbol, $value2);
        }
        runtime.setAndCoerceProperty$Ex(Lit45, Lit34, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St), Lit17);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit34, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St), Lit17);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit34, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit6, runtime.$Stthe$Mnnull$Mnvalue$St), Lit17);
        return runtime.callYailPrimitive(Scheme.numGrt, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit102, ">") != Boolean.FALSE ? runtime.callComponentMethod(Lit103, Lit104, LList.list4(Lit105, "High Heart Rate", "Check Heart Rate", "Check Heart Rate"), Lit106) : Values.empty;
    }

    static Object lambda30() {
        return runtime.setAndCoerceProperty$Ex(Lit79, Lit112, "911", Lit17);
    }

    static Object lambda31() {
        return runtime.setAndCoerceProperty$Ex(Lit79, Lit112, "911", Lit17);
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
                case 48:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 49:
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
                case 48:
                    return this.$main.FirebaseDB1$DataChanged(obj, obj2);
                case 49:
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
                case 45:
                    return this.$main.Button1$Click();
                case 46:
                    return Screen3.lambda28();
                case 47:
                    return Screen3.lambda29();
                case 50:
                    return Screen3.lambda30();
                case 51:
                    return Screen3.lambda31();
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
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
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
