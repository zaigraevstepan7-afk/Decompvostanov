/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NGK
 */
package KDFzREm;

import KDFzREm.NGK;
import KDFzREm.Ro;
import KDFzREm.Rq;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="SeeInvisible", y=UR.VISUAL, N=Uz.WORLD)
public class TG
extends UM {
    private static String[] u;
    private static short[] i;
    private static float[] R;
    public Object[] L;
    private static boolean[] M;
    private static /* synthetic */ String l10lnr;
    private static /* synthetic */ int[] lOsqO;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight((n ^ 0x7866E308) + 1, 21) ^ 0xF664B8A7, 6), 10), 19);
    }

    private static void P() {
        R = new float[]{0.5f, 0.1f, 1.0f, 0.1f, 255.0f};
    }

    private static void T() {
        M = new boolean[]{false, true};
    }

    public TG() {
        TG.lO0kkIqO("leewvx", 27225317, -1603359720, -1603359715, -1603359714, 27225317, (TG)this);
        CallSite callSite = TG.lO0kkIqO("wkig", 27225323, -1603359725, -1603359724, -1603359723, 27225323, (lY)this, (String)((Object)TG.lO0kkIqO("dftt", 27225313, -1603359720, -1603359713, -1603359728, 27225313)[0]), (float)TG.lO0kkIqO("wkig", 27225313, -1603359720, -1603359727, -1603359726, 27225313)[0], (float)TG.lO0kkIqO("wkig", 27225313, -1603359720, -1603359727, -1603359726, 27225313)[1], (float)TG.lO0kkIqO("ettq", 27225313, -1603359720, -1603359727, -1603359726, 27225313)[2], (float)TG.lO0kkIqO("ettq", 27225313, -1603359720, -1603359727, -1603359726, 27225313)[3]);
        TG.lO0kkIqO("fyhw", 27225319, -1603359720, -1603359719, -1603359718, 27225319, (TG)this)[TG.lO0kkIqO("lgfny", 27225313, -1603359720, -1603359722, -1603359721, 27225313)[0]] = callSite;
    }

    static {
        TG.ntfClinit();
    }

    private static void b() {
        u = new String[]{"opacity"};
    }

    private static void s() {
        i = new short[]{0, 255, 0};
    }

    private void m() {
        if (TG.lO0kkIqO("dftt", 27225319, -1603359720, -1603359719, -1603359718, 27225319, (TG)this) == null) {
            TG.lO0kkIqO("leewvx", 27225318, -1603359720, -1603359719, -1603359718, 27225318, (TG)this, (Object[])new Object[TG.lO0kkIqO("lgfny", 27225313, -1603359720, -1603359717, -1603359716, 27225313)[1]]);
            CallSite callSite = TG.lO0kkIqO("fapqckho", 27225319, -1603359720, -1603359719, -1603359718, 27225319, (TG)this);
        }
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(-Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(n, 9), 3), 30) ^ 0x70BD51F7, 31), 5);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight((-n ^ 0xD7B68B39) + 1, 18);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{28, -97, 79, 66, 41, -4, -10, -104, 2, -91, 101, 69, 102, 47, 65, -81};
        int n = 0;
        int n2 = 232;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 129;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(-Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 26), 5), 11), 18);
    }

    @uF
    public void N(Ro ro) {
        TG.lO0kkIqO("leewvx", 27225317, -1603359720, -1603359715, -1603359714, 1981172024, (TG)this);
        TG.lO0kkIqO("uafi", 27225317, -1603359744, -1603359730, -1603359743, 1981172024, (Ro)ro, (int)TG.lO0kkIqO("uafi", 27225323, -1603359731, -1603359730, -1603359729, 1981172024, (int)TG.lO0kkIqO("wkig", 27225313, -1603359720, -1603359722, -1603359721, -1082697160)[1], (int)(TG.lO0kkIqO("leewvx", 27225313, -1603359720, -1603359727, -1603359726, -354188245)[4] * TG.lO0kkIqO("zcxx", 27225317, -1603359734, -1603359733, -1603359732, 1981172024, (Float)((Float)((Object)TG.lO0kkIqO("uafi", 27225317, -1603359736, -1603359722, -1603359735, 1981172024, (lQ)((lQ)((Object)TG.lO0kkIqO("vthkg", 27225319, -1603359720, -1603359719, -1603359718, -530588265, (TG)this)[TG.lO0kkIqO("leewvx", 27225313, -1603359720, -1603359722, -1603359721, -415701543)[2]])))))))));
    }

    @uF
    public void N(Rq rq) {
        if (TG.lO0kkIqO("xkfcvmef", 27225317, -1603359742, -1603359724, -1603359741, 1981172024, (Rq)rq) instanceof NGK) {
            return;
        }
        TG.lO0kkIqO("huom", 27225317, -1603359742, -1603359724, -1603359740, 1981172024, (Rq)rq, (boolean)TG.lO0kkIqO("zkidh", 27225313, -1603359720, -1603359717, -1603359716, -1918918423)[0]);
    }

    private static /* synthetic */ CallSite lO0kkIqO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = lOsqO[n2 ^ 0xA06EAC18];
        int n7 = n6 >>> 16;
        String string2 = TG.ll0lslrn(l10lnr.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xA06EAC18);
        n6 = lOsqO[n3 ^ 0xA06EAC18];
        int n8 = n6 >>> 16;
        String string3 = TG.ll0lslrn(l10lnr.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xA06EAC18);
        n6 = lOsqO[n4 ^ 0xA06EAC18];
        int n9 = n6 >>> 16;
        String string4 = TG.ll0lslrn(l10lnr.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xA06EAC18);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x19F6C53) + -178;
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

    private static /* synthetic */ void lOOIj(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[29];
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
        l10lnr = stringBuilder.toString();
        lOsqO = nArray;
    }

    private static /* synthetic */ CallSite IIsItkn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = lOsqO[n2 ^ 0xA06EAC18];
        int n8 = n7 >>> 16;
        String string2 = TG.ll0lslrn(l10lnr.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xA06EAC18);
        n7 = lOsqO[n3 ^ 0xA06EAC18];
        int n9 = n7 >>> 16;
        String string3 = TG.ll0lslrn(l10lnr.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xA06EAC18);
        n7 = lOsqO[n4 ^ 0xA06EAC18];
        int n10 = n7 >>> 16;
        String string4 = TG.ll0lslrn(l10lnr.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xA06EAC18);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x19F6C53) + -178;
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

    private static /* synthetic */ CallSite I1rnllj(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = lOsqO[n2 ^ 0xA06EAC18];
        int n7 = n6 >>> 16;
        String string2 = TG.ll0lslrn(l10lnr.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xA06EAC18);
        n6 = lOsqO[n3 ^ 0xA06EAC18];
        int n8 = n6 >>> 16;
        String string3 = TG.ll0lslrn(l10lnr.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xA06EAC18);
        n6 = lOsqO[n4 ^ 0xA06EAC18];
        int n9 = n6 >>> 16;
        String string4 = TG.ll0lslrn(l10lnr.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xA06EAC18);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x19F6C53) + -178;
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

    private static /* synthetic */ String ll0lslrn(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-126, 47, -111, -78, 67, -66, 4, -101, -123, 48, 2, -88, -54, 88, 126, 117};
        byte[] byArray3 = new byte[]{-59, 43, 75, -80, -79, 89, 92, -84, 2, 83, -118, 104, -58, 117, 78, 105};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        l10lnr = "\u00ae%\u0080)R\u0093\u0081 \u00a3am\u00db)\u00c7\u009a\u001d&9\u0087D\u00de\u0095\u00b9\u0018\u00f2w(\u008fzI\u00ffk\u0084\u00a9\u0002\u00f3u\u0000\u00a6ao\u00ecg\u00c7\u008e\u0016q6^`E\u0085jz\u00ccg\u0084\u0097\u0012/q\u00e7i\u00d6\u009a-\u000f\u00bd;\u0004\u00e9%\u00e0LP\u00fe@\u00d1\u00a96,9\u009aI\u008f/ \u0082D]\u00c0T\u00ee\u0096\\-O\u00f3j\u00de\u0091q\r\u00e6lz\u00d4a\u0084\u00a8\u00073\u007f\u00a6A\u008f\u00b6A*\u008f)W\u00f1B\u00ed\u0081!\u0004{\u00e7J\u00e5\u00cb\u0002E\u008fg*~\u00db\u00cb(\u008fzI\u00ffk\u0084\u0097\u0018R(\u008fzI\u00ffk\u0084\u0097\"K(\u008fzI\u00ffk\u0084\u009f%\u00a8E\u0085K_\u00fc|\u00f9\u00be\u001enX\u00aam\u008fm\u0085E\u009f\u00d4\u00186\u00e0LP\u00fe@\u00d1\u00a96,9\u009aW\u008fR(\u008fzI\u00ffk\u0084\u00af4\u00b0\r\u00bfa4\u00d6g\u00c5\u009c\\\u0007z\u00a7G\u00c0\u00ac \u00a3am\u00db)\u00c7\u009a\u001d&9\u009bR\u00c6\u0099\u0099\u000b\u00f2\u00a7?\u00bc(\u008fzI\u00ffk\u0084\u00a9\u001c";
        lOsqO = new int[]{13434890, 4521985, 393235, 0x300001, 0x2E0002, 12124161, 12189699, 2293761, 15073299, 327681, 0x880002, 9175050, 9043969, 0x550030, 9109505, 16318466, 9830410, 3211284, 14090255, 2359306, 8716291, 0xA0000A, 12386305, 5, 16449546, 4587535, 1638410, 0xAA000F, 12451855};
        TG.s();
        TG.P();
        TG.T();
        TG.b();
    }
}
