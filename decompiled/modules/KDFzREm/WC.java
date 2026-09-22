/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.Rs;
import KDFzREm.Ry;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.WD;
import KDFzREm.WS;
import KDFzREm.Wx;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.lv;
import KDFzREm.uF;
import KDFzREm.uY;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.List;

@UZ(L="AutoJoin", y=UR.PLAYER, N=Uz.AUTO)
public class WC
extends UM {
    private static String[] u;
    private static boolean[] i;
    private static byte[] R;
    private static short[] M;
    public Object[] L;
    private static /* synthetic */ String I1jmk;
    private static /* synthetic */ int[] l1ttk0;

    private static /* synthetic */ int L(int n) {
        return (Integer.rotateLeft(n ^ 0x1E48D155, 19) ^ 0xCDE3AC1) + 1;
    }

    private static void P() {
        R = new byte[]{2};
    }

    private static void T() {
        i = new boolean[]{false, true, true, false, true};
    }

    public WC() {
        WC.OOqmpl0It("pbrjsc", -1025142894, -880481614, -880481613, -880481616, -1025142894, (WC)this);
        lv[] lvArray = new WS[WC.OOqmpl0It("zxbasawc", -1025142890, -880481614, -880481609, -880481612, -1025142890)[0]];
        lvArray[WC.OOqmpl0It("iwstdby", -1025142890, -880481614, -880481611, -880481606, -1025142890)[0]] = new WD(this, (String)((Object)WC.OOqmpl0It("zxbasawc", -1025142890, -880481614, -880481615, -880481610, -1025142890)[1]), (boolean)WC.OOqmpl0It("pbrjsc", -1025142890, -880481614, -880481611, -880481606, -1025142890)[1]);
        lvArray[WC.OOqmpl0It("axefp", -1025142890, -880481614, -880481611, -880481606, -1025142890)[2]] = new Wx(this, (String)((Object)WC.OOqmpl0It("zxbasawc", -1025142890, -880481614, -880481615, -880481610, -1025142890)[2]), (boolean)WC.OOqmpl0It("waba", -1025142890, -880481614, -880481611, -880481606, -1025142890)[3]);
        CallSite callSite = WC.OOqmpl0It("axefp", -1025142884, -880481605, -880481608, -880481607, -1025142884, (lY)this, (String)((Object)WC.OOqmpl0It("waba", -1025142890, -880481614, -880481615, -880481610, -1025142890)[0]), (lv[])lvArray);
        WC.OOqmpl0It("zxbasawc", -1025142896, -880481614, -880481602, -880481601, -1025142896, (WC)this)[WC.OOqmpl0It("axefp", -1025142890, -880481614, -880481604, -880481603, -1025142890)[0]] = callSite;
        WC.OOqmpl0It("zxbasawc", -1025142883, -880481632, -880481631, -880481626, -1025142883, (List)((Object)WC.OOqmpl0It("lxslhctr", -1025142894, -880481630, -880481602, -880481629, -1025142894, (ld)((ld)((Object)WC.OOqmpl0It("gctwywx", -1025142896, -880481614, -880481602, -880481601, -1025142896, (WC)this)[WC.OOqmpl0It("ucbqign", -1025142890, -880481614, -880481604, -880481603, -1025142890)[1]])))), wS -> {
            if (wS instanceof uY) {
                uY uY2 = (uY)((Object)wS);
                WC.OOqmpl0It("txmqq", -1025142883, -880481621, -880481608, -880481622, -1025142883, (uY)uY2, (Object)this);
            }
        });
    }

    static {
        WC.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-37, 127, 64, -34, -116, 110, -26, -12, -74, -128, 92, -111, -22, -75, 83, -28};
        int n = 0;
        int n2 = 111;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 51;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void b() {
        if (WC.OOqmpl0It("lxslhctr", -1025142896, -880481614, -880481602, -880481601, -1025142896, (WC)this) == null) {
            WC.OOqmpl0It("waba", -1025142895, -880481614, -880481602, -880481601, -1025142895, (WC)this, (Object[])new Object[WC.OOqmpl0It("ucbqign", -1025142890, -880481614, -880481611, -880481606, -1025142890)[4]]);
            CallSite callSite = WC.OOqmpl0It("lxslhctr", -1025142896, -880481614, -880481602, -880481601, -1025142896, (WC)this);
        }
    }

    private static void s() {
        M = new short[]{0, 0, 0, 0, 0};
    }

    private static void m() {
        u = new String[]{"mode", "spooky-time-duels", "really-world"};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{27, -121, 47, -115, 10, 69, -63, -96, -41, -97, 18, 112, 60, -95, 57, -22};
        int n = 0;
        int n2 = 104;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 53;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 2) ^ 0xBA2A9332, 28), 1), 26) ^ 0xF3A21DA;
    }

    @Override
    public void y() {
        WC.OOqmpl0It("axefp", -1025142894, -880481614, -880481613, -880481616, -1025142894, (WC)this);
        WC.OOqmpl0It("lxslhctr", -1025142883, -880481632, -880481631, -880481626, -1025142883, (List)((Object)WC.OOqmpl0It("lxslhctr", -1025142894, -880481630, -880481602, -880481629, -1025142894, (ld)((ld)((Object)WC.OOqmpl0It("txmqq", -1025142896, -880481614, -880481602, -880481601, -1025142896, (WC)this)[WC.OOqmpl0It("txmqq", -1025142890, -880481614, -880481604, -880481603, -1025142890)[2]])))), WS::N);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{23, -117, -80, -92, 45, 34, 65, -1, 40, -108, -107, 118, -73, 61, 112, -39};
        int n = 0;
        int n2 = 235;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 29;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft((n ^ 0xCC144FE2) + 1, 24), 16) ^ 0x190D260, 11);
    }

    @uF
    public void N(Rs rs) {
        WC.OOqmpl0It("gctwywx", -1025142894, -880481614, -880481613, -880481616, -1154196822, (WC)this);
        WC.OOqmpl0It("zxbasawc", -1025142894, -880481628, -880481627, -880481622, -1154196822, (WS)((WS)((Object)WC.OOqmpl0It("lxslhctr", -1025142894, -880481630, -880481611, -880481625, -1154196822, (ld)((ld)((Object)WC.OOqmpl0It("iwstdby", -1025142896, -880481614, -880481602, -880481601, 101931292, (WC)this)[WC.OOqmpl0It("axefp", -1025142890, -880481614, -880481604, -880481603, -809246633)[4]]))))), (Object)rs);
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n ^ 0x52675943, 17), 4), 22);
    }

    @uF
    public void N(Ry ry) {
        WC.OOqmpl0It("ucbqign", -1025142894, -880481614, -880481613, -880481616, -1154196822, (WC)this);
        WC.OOqmpl0It("lxslhctr", -1025142894, -880481628, -880481627, -880481622, -1154196822, (WS)((WS)((Object)WC.OOqmpl0It("gctwywx", -1025142894, -880481630, -880481611, -880481625, -1154196822, (ld)((ld)((Object)WC.OOqmpl0It("waba", -1025142896, -880481614, -880481602, -880481601, 1577269168, (WC)this)[WC.OOqmpl0It("lxslhctr", -1025142890, -880481614, -880481604, -880481603, -778556564)[3]]))))), (Object)ry);
    }

    private static /* synthetic */ void ntfClinit() {
        I1jmk = "3\u0010\u00e7z\u00a9E\n\u00861@\u0095\u0018\u00cba\u008daH\u00c5<Jh\u00a0O\u00fa\u00fd\r\u00de \u009a)\u00adp\u0018\u00cba\u008daH\u00dc)Mc\u00a0f\u00ed\u00f9Y,=\u00cen\u00d4C\b\u00c7.Qb\u00ear\u00a3\u00bel7\u0010\u00e7z\u00a9E\n\u0086\nw\u009fb2\u0018\u00eaD\u00bdz5\u00ec0\u000bc\u00d6;\u00d4\u00fd\u00ael5\u008el\u009an\u0000\u0086\u000eP}\u00e6n\u00ff\u00ac\u0094V\u001f\u00e5F\u0081R\"\u00c4rHy\u00b4)\u00d4\u00dc\u008b\\.\u00f3E\u0096/\u000b\u00cdf\b}\u00f7(}\u00edj\u009av\u0006\u0086(Pf\u00e3/\u00d4\u00fe\u001bto'\u0016\u001c\u0007=\u00e7n\u0010\u00e7z\u00a9E\n\u00861O\u0086\u0003\u0018\u00cba\u008daH\u00c5<Jh\u00a0S\u00ec\u00e5S63\u009aJ5\u00d7a\u00d4u\u0013\u00c01\u000bC\u00e6s\u00ec\u0002}\u00edj\u009av\u0006\u00861Ea\u00e8/\u00d7\u00f5PO7\u00d5;xn\u0010\u00e7z\u00a9E\n\u0086(}\u00e0\u0018\u00cba\u008daH\u00c5<Jh\u00a0O\u00fa\u00fd_\u00d8 \u009a\u00e6\u000e\u0096\u0002.;\u00d3E\u009ac\u000f3\u0010\u00e7z\u00a9E\n\u0086\ng";
        l1ttk0 = new int[]{17301514, 4849665, 8650755, 10289153, 11141139, 14614529, 0x990002, 11075585, 16580610, 10420234, 4784129, 4915257, 0x1000001, 15335443, 10354689, 10158082, 10, 8847378, 12386318, 0x1010007, 2031648, 13303828, 4128778, 0xFF0001, 655381, 0xE0000A};
        WC.s();
        WC.P();
        WC.T();
        WC.m();
    }

    private static /* synthetic */ CallSite OltjIqlr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = l1ttk0[n2 ^ 0xCB84EAB2];
        int n7 = n6 >>> 16;
        String string2 = WC.I1iII(I1jmk.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xCB84EAB2);
        n6 = l1ttk0[n3 ^ 0xCB84EAB2];
        int n8 = n6 >>> 16;
        String string3 = WC.I1iII(I1jmk.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xCB84EAB2);
        n6 = l1ttk0[n4 ^ 0xCB84EAB2];
        int n9 = n6 >>> 16;
        String string4 = WC.I1iII(I1jmk.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xCB84EAB2);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xC2E58F24) + -178;
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

    private static /* synthetic */ CallSite OOqmpl0It(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = l1ttk0[n2 ^ 0xCB84EAB2];
        int n7 = n6 >>> 16;
        String string2 = WC.I1iII(I1jmk.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xCB84EAB2);
        n6 = l1ttk0[n3 ^ 0xCB84EAB2];
        int n8 = n6 >>> 16;
        String string3 = WC.I1iII(I1jmk.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xCB84EAB2);
        n6 = l1ttk0[n4 ^ 0xCB84EAB2];
        int n9 = n6 >>> 16;
        String string4 = WC.I1iII(I1jmk.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xCB84EAB2);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xC2E58F24) + -178;
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

    private static /* synthetic */ CallSite llIsrkj(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = l1ttk0[n2 ^ 0xCB84EAB2];
        int n7 = n6 >>> 16;
        String string2 = WC.I1iII(I1jmk.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xCB84EAB2);
        n6 = l1ttk0[n3 ^ 0xCB84EAB2];
        int n8 = n6 >>> 16;
        String string3 = WC.I1iII(I1jmk.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xCB84EAB2);
        n6 = l1ttk0[n4 ^ 0xCB84EAB2];
        int n9 = n6 >>> 16;
        String string4 = WC.I1iII(I1jmk.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xCB84EAB2);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xC2E58F24) + -178;
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

    private static /* synthetic */ String I1iII(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-127, -49, -101, -3, -85, -7, -58, 80, -92, -39, -55, 43, 58, 60, 110, -95};
        byte[] byArray3 = new byte[]{97, -107, -14, 102, 123, -56, -23, -128, 35, -18, 20, -99, 40, 59, -47, 91};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void OOtO0Iq0(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[26];
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
        I1jmk = stringBuilder.toString();
        l1ttk0 = nArray;
    }

    private static /* synthetic */ CallSite Olkpj(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = l1ttk0[n2 ^ 0xCB84EAB2];
        int n7 = n6 >>> 16;
        String string2 = WC.I1iII(I1jmk.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xCB84EAB2);
        n6 = l1ttk0[n3 ^ 0xCB84EAB2];
        int n8 = n6 >>> 16;
        String string3 = WC.I1iII(I1jmk.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xCB84EAB2);
        n6 = l1ttk0[n4 ^ 0xCB84EAB2];
        int n9 = n6 >>> 16;
        String string4 = WC.I1iII(I1jmk.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xCB84EAB2);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xC2E58F24) + -178;
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
