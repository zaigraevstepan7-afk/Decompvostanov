/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.Mt;
import KDFzREm.Tk;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.lv;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

@UZ(L="TimeChanger", y=UR.VISUAL, N=Uz.WORLD)
public class Tw
extends UM {
    private static short[] u;
    private static boolean[] i;
    private static long[] R;
    private static float[] M;
    private static byte[] B;
    private static boolean[] Z;
    private static short[] z;
    private static String[] U;
    private static byte[] W;
    private static String[] m;
    public Object[] L;
    private static /* synthetic */ String lOjmIOkm;
    private static /* synthetic */ int[] llm0r;

    private static /* synthetic */ int L(int n) {
        return (Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(-n, 28), 4), 15), 20), 22) ^ 0x2F0664F7) + 1;
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{64, -128, 95, 43, 16, -74, -88, -110, -119, 108, -36, 5, 35, -27, -111, -72};
        int n = 0;
        int n2 = 27;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 111;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        W = new byte[]{7, 2, 3};
        B = new byte[]{4, 5, 6, -1, 100, 100, 3};
    }

    public Tw() {
        Tw.l1rOnnkri("thupapy", -549557060, 1547413700, 1547413701, 1547413702, -549557060, (Tw)this);
        Tk tk = new Tk((String)((Object)Tw.l1rOnnkri("mnmsot", -549557064, 1547413700, 1547413713, 1547413714, -549557064)[0]), this::m, (boolean)Tw.l1rOnnkri("dxmidahl", -549557064, 1547413700, 1547413715, 1547413724, -549557064)[0]);
        Tw.l1rOnnkri("qpnocm", -549557058, 1547413700, 1547413703, 1547413696, -549557058, (Tw)this)[Tw.l1rOnnkri("mnmsot", -549557064, 1547413700, 1547413725, 1547413698, -549557064)[0]] = tk;
        lv[] lvArray = new Tk[Tw.l1rOnnkri("thupapy", -549557064, 1547413700, 1547413726, 1547413706, -549557064)[0]];
        lvArray[Tw.l1rOnnkri("vrgm", -549557064, 1547413700, 1547413715, 1547413724, -549557064)[1]] = new Tk((String)((Object)Tw.l1rOnnkri("qpnocm", -549557064, 1547413700, 1547413713, 1547413714, -549557064)[2]), () -> Tw.l1rOnnkri("awnhg", -549557070, 1547413718, 1547413719, 1547413712, -1883261328, (int)Tw.l1rOnnkri("dxmidahl", -549557064, 1547413700, 1547413697, 1547413698, -2012912097)[6]), (boolean)Tw.l1rOnnkri("tfik", -549557064, 1547413700, 1547413715, 1547413724, -549557064)[2]);
        lvArray[Tw.l1rOnnkri("cdpggg", -549557064, 1547413700, 1547413715, 1547413724, -549557064)[3]] = new Tk((String)((Object)Tw.l1rOnnkri("qpnocm", -549557064, 1547413700, 1547413713, 1547413714, -549557064)[3]), () -> Tw.l1rOnnkri("kdxcxro", -549557070, 1547413718, 1547413719, 1547413712, -1883261328, (int)Tw.l1rOnnkri("kgpy", -549557064, 1547413700, 1547413705, 1547413706, -117730535)[5]), (boolean)Tw.l1rOnnkri("mnmsot", -549557064, 1547413700, 1547413715, 1547413724, -549557064)[4]);
        lvArray[Tw.l1rOnnkri("onyz", -549557064, 1547413700, 1547413726, 1547413706, -549557064)[1]] = new Tk((String)((Object)Tw.l1rOnnkri("onyz", -549557064, 1547413700, 1547413713, 1547413714, -549557064)[4]), () -> Tw.l1rOnnkri("daism", -549557070, 1547413718, 1547413719, 1547413712, -1883261328, (int)Tw.l1rOnnkri("onyz", -549557064, 1547413700, 1547413697, 1547413698, 1163397421)[5]), (boolean)Tw.l1rOnnkri("dqymhdc", -549557064, 1547413700, 1547413715, 1547413724, -549557064)[5]);
        lvArray[Tw.l1rOnnkri("cdpggg", -549557064, 1547413700, 1547413726, 1547413706, -549557064)[2]] = new Tk((String)((Object)Tw.l1rOnnkri("dxmidahl", -549557064, 1547413700, 1547413713, 1547413714, -549557064)[5]), () -> Tw.l1rOnnkri("qpnocm", -549557070, 1547413718, 1547413719, 1547413712, -1883261328, (int)Tw.l1rOnnkri("smksovod", -549557064, 1547413700, 1547413697, 1547413698, -377855218)[4]), (boolean)Tw.l1rOnnkri("smksovod", -549557064, 1547413700, 1547413708, 1547413724, -549557064)[0]);
        lvArray[Tw.l1rOnnkri("daism", -549557064, 1547413700, 1547413705, 1547413706, -549557064)[0]] = new Tk((String)((Object)Tw.l1rOnnkri("kdxcxro", -549557064, 1547413700, 1547413716, 1547413714, -549557064)[0]), () -> Tw.l1rOnnkri("kdxcxro", -549557070, 1547413718, 1547413719, 1547413712, -1883261328, (int)Tw.l1rOnnkri("thupapy", -549557064, 1547413700, 1547413697, 1547413698, -1322333085)[3]), (boolean)Tw.l1rOnnkri("cdpggg", -549557064, 1547413700, 1547413708, 1547413724, -549557064)[1]);
        lvArray[Tw.l1rOnnkri("kdxcxro", -549557064, 1547413700, 1547413705, 1547413706, -549557064)[1]] = new Tk((String)((Object)Tw.l1rOnnkri("vrgm", -549557064, 1547413700, 1547413716, 1547413714, -549557064)[1]), () -> Tw.l1rOnnkri("cdpggg", -549557070, 1547413718, 1547413719, 1547413712, -1883261328, (int)Tw.l1rOnnkri("kdxcxro", -549557064, 1547413700, 1547413697, 1547413698, 1841261364)[2]), (boolean)Tw.l1rOnnkri("cdpggg", -549557064, 1547413700, 1547413708, 1547413724, -549557064)[2]);
        lvArray[Tw.l1rOnnkri("onyz", -549557064, 1547413700, 1547413705, 1547413706, -549557064)[2]] = (Tk)((Object)Tw.l1rOnnkri("tfik", -549557058, 1547413700, 1547413703, 1547413696, -549557058, (Tw)this)[Tw.l1rOnnkri("awnhg", -549557064, 1547413700, 1547413725, 1547413698, -549557064)[1]]);
        CallSite callSite = Tw.l1rOnnkri("mnmsot", -549557070, 1547413727, 1547413720, 1547413721, -549557070, (lY)this, (String)((Object)Tw.l1rOnnkri("mnmsot", -549557064, 1547413700, 1547413713, 1547413714, -549557064)[1]), (lv[])lvArray);
        Tw.l1rOnnkri("dxmidahl", -549557058, 1547413700, 1547413703, 1547413696, -549557058, (Tw)this)[Tw.l1rOnnkri("thupapy", -549557064, 1547413700, 1547413725, 1547413698, -549557064)[2]] = callSite;
        lQ lQ2 = (lQ)((Object)Tw.l1rOnnkri("qpnocm", -549557060, 1547413699, 1547413720, 1547413733, -549557060, (lQ)((Object)Tw.l1rOnnkri("kgpy", -549557070, 1547413727, 1547413720, 1547413732, -549557070, (lY)this, (String)((Object)Tw.l1rOnnkri("kdxcxro", -549557064, 1547413700, 1547413716, 1547413714, -549557064)[2]), (float)Tw.l1rOnnkri("mnmsot", -549557064, 1547413700, 1547413722, 1547413723, -549557064)[0], (float)Tw.l1rOnnkri("dqymhdc", -549557064, 1547413700, 1547413722, 1547413723, -549557064)[1], (float)Tw.l1rOnnkri("hurgw", -549557064, 1547413700, 1547413722, 1547413723, -549557064)[2], (float)Tw.l1rOnnkri("daism", -549557064, 1547413700, 1547413722, 1547413723, -549557064)[3])), lw2 -> {
            Tw.l1rOnnkri("thupapy", -549557060, 1547413700, 1547413701, 1547413702, -1883261328, (Tw)this);
            return (boolean)Tw.l1rOnnkri("cdpggg", -549557060, 1547413707, 1547413716, 1547413717, -1883261328, (Tk)((Tk)((Object)Tw.l1rOnnkri("cdpggg", -549557058, 1547413700, 1547413703, 1547413696, -804913737, (Tw)this)[Tw.l1rOnnkri("onyz", -549557064, 1547413700, 1547413697, 1547413698, -1457322328)[1]])));
        }));
        Tw.l1rOnnkri("kdxcxro", -549557058, 1547413700, 1547413703, 1547413696, -549557058, (Tw)this)[Tw.l1rOnnkri("dxmidahl", -549557064, 1547413700, 1547413725, 1547413698, -549557064)[3]] = lQ2;
    }

    static {
        Tw.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{121, 92, -57, -78, -78, 91, -14, -61, 86, 49, 82, 76, 13, -72, -11, -95};
        int n = 0;
        int n2 = 207;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 161;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-111, -32, -5, -94, 4, -87, 60, -83, 72, -81, -122, -79, 8, -54, 35, -110};
        int n = 0;
        int n2 = 209;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 71;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateLeft(-Integer.rotateRight(n, 19) ^ 0xC963DFD5, 17) ^ 0x375B2014;
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{123, -9, 83, 48, 84, 43, -78, 110, -54, -109, -63, -49, -25, -79, -27, 1};
        int n = 0;
        int n2 = 245;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 197;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void s() {
        if (Tw.l1rOnnkri("daism", -549557058, 1547413700, 1547413703, 1547413696, -549557058, (Tw)this) == null) {
            Tw.l1rOnnkri("hurgw", -549557057, 1547413700, 1547413703, 1547413696, -549557057, (Tw)this, (Object[])new Object[Tw.l1rOnnkri("onyz", -549557064, 1547413700, 1547413705, 1547413706, -549557064)[6]]);
            CallSite callSite = Tw.l1rOnnkri("awnhg", -549557058, 1547413700, 1547413703, 1547413696, -549557058, (Tw)this);
        }
    }

    private static void n() {
        M = new float[]{120.0f, 0.0f, 240.0f, 1.0f};
    }

    private static void d() {
        Z = new boolean[]{false, false, false, true, false, true};
        i = new boolean[]{false, false, false};
    }

    private int m() {
        Tw.l1rOnnkri("dqymhdc", -549557060, 1547413700, 1547413701, 1547413702, -1883261328, (Tw)this);
        return (int)(Tw.l1rOnnkri("cdpggg", -549557060, 1547413710, 1547413711, 1547413704, -1883261328, (Float)((Float)((Object)Tw.l1rOnnkri("dqymhdc", -549557060, 1547413699, 1547413708, 1547413709, -1883261328, (lQ)((lQ)((Object)Tw.l1rOnnkri("hurgw", -549557058, 1547413700, 1547413703, 1547413696, -855068275, (Tw)this)[Tw.l1rOnnkri("kgpy", -549557064, 1547413700, 1547413697, 1547413698, -202822577)[0]])))))) * Tw.l1rOnnkri("kgpy", -549557064, 1547413700, 1547413705, 1547413706, 673465089)[4]);
    }

    private static void k() {
        R = new long[]{24000L};
    }

    private static void v() {
        z = new short[]{0, 0, 1, 2, 1, 0};
        u = new short[]{2, 0, 17000, 12500, 12000, 5000, 23100};
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-82, 94, -38, 11, 73, -42, -11, -85, 30, -101, -88, -40, 76, 18, -98, -94};
        int n = 0;
        int n2 = 65;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 231;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{64, -99, -106, -23, 124, 80, 53, -66, -82, 123, -102, 115, -99, 20, 108, 72};
        int n = 0;
        int n2 = 15;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 215;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(-Integer.rotateRight(n, 4), 28) ^ 0xEF6FAC12;
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-94, -3, -72, -45, -102, -4, 125, 26, -65, -33, -35, 35, -96, -102, -7, -84};
        int n = 0;
        int n2 = 19;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 87;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{35, -48, 60, 79, 55, -31, 50, -22, 89, 4, -48, -97, 2, 77, 65, 25};
        int n = 0;
        int n2 = 72;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 181;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(-n, 30), 6) ^ 0x8B6D2CBC, 15), 30), 25);
    }

    @uF
    public void N(Mt mt) {
        Tw.l1rOnnkri("awnhg", -549557060, 1547413700, 1547413701, 1547413702, -1883261328, (Tw)this);
        CallSite callSite = Tw.l1rOnnkri("smksovod", -549557060, 1547413718, 1547413711, 1547413704, -1883261328, (Integer)((Object)Tw.l1rOnnkri("hurgw", -549557069, 1547413735, 1547413728, 1547413709, -1883261328, (Supplier)((Supplier)((Object)Tw.l1rOnnkri("mnmsot", -549557058, 1547413707, 1547413720, 1547413696, 1626435450, (Tk)((Tk)((Object)Tw.l1rOnnkri("vrgm", -549557060, 1547413734, 1547413708, 1547413709, -1883261328, (ld)((ld)((Object)Tw.l1rOnnkri("cdpggg", -549557058, 1547413700, 1547413703, 1547413696, -962900477, (Tw)this)[Tw.l1rOnnkri("daism", -549557064, 1547413700, 1547413725, 1547413698, 1469216858)[4]]))))))[Tw.l1rOnnkri("kgpy", -549557064, 1547413700, 1547413725, 1547413698, 1980078775)[5]])))));
        if (callSite == Tw.l1rOnnkri("thupapy", -549557064, 1547413700, 1547413705, 1547413706, -1950373862)[3]) {
            return;
        }
        reference var3_3 = Tw.l1rOnnkri("dqymhdc", -549557060, 1547413729, 1547413720, 1547413730, -1883261328, (Mt)mt) - Tw.l1rOnnkri("daism", -549557070, 1547413741, 1547413742, 1547413743, -1883261328, (long)Tw.l1rOnnkri("hurgw", -549557060, 1547413729, 1547413720, 1547413730, -1883261328, (Mt)mt), (long)Tw.l1rOnnkri("qpnocm", -549557064, 1547413700, 1547413731, 1547413740, -165158342)[0]);
        Tw.l1rOnnkri("onyz", -549557060, 1547413729, 1547413720, 1547413736, -1883261328, (Mt)mt, (long)(var3_3 + (long)callSite));
    }

    private static /* synthetic */ long N(long l) {
        return Long.rotateRight(Long.rotateLeft(Long.rotateLeft(-Long.rotateLeft(Long.rotateLeft(l, 53), 28), 37), 32), 28);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(-Integer.rotateLeft(Integer.rotateLeft(n, 5), 29), 5), 20), 9), 8), 17);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{46, -70, -73, -60, -51, 101, -48, -12, -71, 0, 66, 45, -46, -90, -46, -43};
        int n = 0;
        int n2 = 1;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 241;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int R(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 27) ^ 0x28598FBF, 2) ^ 0xA776672C, 31) ^ 0xCB5C6767;
    }

    private static void Y() {
        m = new String[]{"select", "time", "dawn", "morning", "day", "evening"};
        U = new String[]{"sunset", "night", "select"};
    }

    private static /* synthetic */ CallSite l1rOnnkri(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = llm0r[n2 ^ 0x5C3BA8C4];
        int n7 = n6 >>> 16;
        String string2 = Tw.I1OpqIOO(lOjmIOkm.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x5C3BA8C4);
        n6 = llm0r[n3 ^ 0x5C3BA8C4];
        int n8 = n6 >>> 16;
        String string3 = Tw.I1OpqIOO(lOjmIOkm.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x5C3BA8C4);
        n6 = llm0r[n4 ^ 0x5C3BA8C4];
        int n9 = n6 >>> 16;
        String string4 = Tw.I1OpqIOO(lOjmIOkm.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x5C3BA8C4);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xDF3E6C0A) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }

    private static /* synthetic */ void ntfClinit() {
        lOjmIOkm = "\u0088\u000e\u00af\\\u00c6\u00d6\u00af\u0093l\u00ad\"+\u009fG\u00bb\u00ff\u00a3\u00d2g\u00d3ql\u00cc\u0087\u00cf[\b\u0082\u000e\u00af\\\u00c6\u00d6\u00af\u0093T\u0097q\u0019}+\u009fG\u00bb\u00e6\u00b6\u00d5l\u00d3Qu\u00cd\u0085\u00cfAx$\u00c6u\u00e1\u00e3\u00b2\u00d0i\u0099Ez$\u0006\u0083G\u00e2\u00f2\u00ed\u00c9t\u0095[/\u00c5\u0093\u00d5\u00cex#\u0086H\u00bb\u00c3\u00b0\u00d9d\u0095Ta\u00d7\u0083\u0080\u0084@\u0001\u00ad`\u00ee\u00c1\u0087\u00d1/\u0090@;Id\u000e\u00af\\\u00c6\u00d6\u00af\u0093T\u008ba+\u0085S\u00f1\u00dc\u00a49\u0091\u000b\u0000\u000b\u0010\u0087+\u009fG\u00bb\u00ff\u00a3\u00d2g\u00d3za\u00d7\u008e\u00f4c\u00a0\u00b6\u0002c\u00a3M\u00a0\u000e\u00af\\\u00c6\u00d6\u00af\u0093l\u0098\u00dc\u0006\u00a2b\u00d2\u00e9\u0090\u00f9m\u00d3[Y\u0098\u00aa\u00d1\u008c\u0082+\u00c6J\u00f5\u00fd\u00a5\u0093S\u0088Ei\u00cd\u0081\u0080\u00b6\u00b8\u0001\u00ad`\u00ee\u00c1\u0087\u00d1/\u0090A;\u008a\u00aa\u00f0\u00a9\u00b20\u00bbc\u00f9\u00bc\u00ae\u00d8;q\u0006\u0083G\u00e2\u00f2\u00ed\u00d0a\u0092P/\u00f0\u0092\u00c9\u00b9D-\u00d2\u00c2\u000e\u00af\\\u00c6\u00d6\u00af\u0093l\u0097QF\u0006\u0083G\u00e2\u00f2\u00ed\u00d0a\u0092P/\u00ec\u0084\u00d1\u0082~>\u00d2\u00c3c\u00bf\u0092\u0007\u0006\u00a2b\u00d2\u00e9\u0090\u00f9m\u00d3[Y\u0098\u00aa\u00d1\u00ccY+\u00c6J\u00f5\u00fd\u00a5\u0093S\u0088Ei\u00cd\u0081\u0080\u00ebi\f\u00af\u000f\u00d8\u00d8\u0086\u00faz\u00aerm\u008c\u008a\u00ea\u0096\u0097\u00c5c\u00a5L\u00f5\u00e5\u00a3\u0093l\u009dYg\u008c\u00a9\u00d9Y\u0088)\u009d\u001d\u001f[$c\u00b3o\u000e\u00af\\\u00c6\u00d6\u00af\u0093M\u0088\u00a1\u0000\u00a3\u000f\u00de\u007f\u00e0$\u009dp\u00f5\u00ff\u00b7\u00d9\u0092\fz/\u009d5\u0003\u00c0j\u00fe\u00f2\u00b4\u00dd/\u0090Vn\u00c4\u00c9\u00f2\u0089i/\u008eC\u00e6\u00a8\u0081+\u009fG\u00bb\u00ff\u00a3\u00d2g\u00d3~n\u00d7\u0083\u00dcM\u0099\u0099\u00f4\u0000\u00c0j\u00df\u00d7\u0084\u00c6R\u00b9Z/\u00ee\u0092\u0080.&\u0086I\u00e6\u00de\u00ad\u00d8";
        llm0r = new int[]{0x70000A, 23986177, 0x1110003, 22740993, 16646163, 16580609, 0x250002, 10, 0x810001, 21364756, 655375, 24051720, 9764867, 9961473, 1638402, 1769482, 4325377, 22806531, 26345489, 0x7A0007, 24903702, 7274497, 14680083, 27459585, 8716290, 21299201, 22675457, 15925258, 0x1140001, 10944569, 10223617, 24576002, 18153520, 4390956, 10289162, 2555931, 24707075, 23003146, 0x990003, 8519681, 8585218, 8847374, 28508168, 23658501, 27525135};
        Tw.v();
        Tw.P();
        Tw.d();
        Tw.n();
        Tw.k();
        Tw.Y();
    }

    private static /* synthetic */ CallSite OlmtI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = llm0r[n2 ^ 0x5C3BA8C4];
        int n9 = n8 >>> 16;
        String string2 = Tw.I1OpqIOO(lOjmIOkm.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x5C3BA8C4);
        n8 = llm0r[n3 ^ 0x5C3BA8C4];
        int n10 = n8 >>> 16;
        String string3 = Tw.I1OpqIOO(lOjmIOkm.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x5C3BA8C4);
        n8 = llm0r[n4 ^ 0x5C3BA8C4];
        int n11 = n8 >>> 16;
        String string4 = Tw.I1OpqIOO(lOjmIOkm.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x5C3BA8C4);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xDF3E6C0A) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }

    private static /* synthetic */ String I1OpqIOO(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-12, 125, -23, -8, -68, 55, -37, 0, -34, -29, 40, 25, 31, 61, -92, -48};
        byte[] byArray3 = new byte[]{14, -84, -39, -59, 54, -55, -79, 61, 80, -69, 114, 120, -120, -3, 78, 64};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void I1mjqj(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[45];
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            int n = 0;
            while (n < string.length()) {
                int n2 = string.charAt(n) << 8 | string.charAt(n + 1);
                int n3 = string.charAt(n + 2) << 8 | string.charAt(n + 3);
                int n4 = n + 4;
                nArray[n2] = stringBuilder.length() << 16 | n3;
                stringBuilder.append(string, n4, n4 + n3);
                n = n4 + n3;
            }
        }
        lOjmIOkm = stringBuilder.toString();
        llm0r = nArray;
    }

    private static /* synthetic */ CallSite ooOrkI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = llm0r[n2 ^ 0x5C3BA8C4];
        int n10 = n9 >>> 16;
        String string2 = Tw.I1OpqIOO(lOjmIOkm.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x5C3BA8C4);
        n9 = llm0r[n3 ^ 0x5C3BA8C4];
        int n11 = n9 >>> 16;
        String string3 = Tw.I1OpqIOO(lOjmIOkm.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x5C3BA8C4);
        n9 = llm0r[n4 ^ 0x5C3BA8C4];
        int n12 = n9 >>> 16;
        String string4 = Tw.I1OpqIOO(lOjmIOkm.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x5C3BA8C4);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xDF3E6C0A) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }

    private static /* synthetic */ CallSite OOsmqjn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = llm0r[n2 ^ 0x5C3BA8C4];
        int n8 = n7 >>> 16;
        String string2 = Tw.I1OpqIOO(lOjmIOkm.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x5C3BA8C4);
        n7 = llm0r[n3 ^ 0x5C3BA8C4];
        int n9 = n7 >>> 16;
        String string3 = Tw.I1OpqIOO(lOjmIOkm.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x5C3BA8C4);
        n7 = llm0r[n4 ^ 0x5C3BA8C4];
        int n10 = n7 >>> 16;
        String string4 = Tw.I1OpqIOO(lOjmIOkm.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x5C3BA8C4);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xDF3E6C0A) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }
}
