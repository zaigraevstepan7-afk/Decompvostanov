/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNZZ
 *  KDFzREm.NNuU
 */
package KDFzREm;

import KDFzREm.NNNZZ;
import KDFzREm.NNuU;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.iF;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="NoEntityTrace", y=UR.PLAYER, N=Uz.BASE)
public class sN
extends UM {
    public Object[] L;
    private static short[] u;
    private static String[] i;
    private static boolean[] R;
    private static /* synthetic */ String Olslp;
    private static /* synthetic */ int[] llmkt;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(-Integer.rotateRight(n ^ 0xC769FDD3, 22), 15), 29) ^ 0x9D427AE8, 2), 13);
    }

    private void P() {
        if (sN.OOiIkkpr0("dtlq", -1785450714, -967301069, -967301070, -967301071, -1785450714, -1785450714, (sN)this) == null) {
            sN.OOiIkkpr0("kyqkof", -1785450713, -967301069, -967301070, -967301071, -1785450713, -1785450713, (sN)this, (Object[])new Object[sN.OOiIkkpr0("lqkc", -1785450720, -967301069, -967301072, -967301065, -1785450720, -1785450720)[1]]);
            CallSite callSite = sN.OOiIkkpr0("sbrno", -1785450714, -967301069, -967301070, -967301071, -1785450714, -1785450714, (sN)this);
        }
    }

    private static void T() {
        R = new boolean[]{false, true};
    }

    public sN() {
        sN.OOiIkkpr0("ewyysn", -1785450716, -967301069, -967301066, -967301067, -1785450716, -1785450716, (sN)this);
        CallSite callSite = sN.OOiIkkpr0("kyqkof", -1785450710, -967301062, -967301063, -967301064, -1785450710, -1785450710, (lY)this, (String)((Object)sN.OOiIkkpr0("hlyi", -1785450720, -967301069, -967301068, -967301061, -1785450720, -1785450720)[0]), (boolean)sN.OOiIkkpr0("lqkc", -1785450720, -967301069, -967301072, -967301065, -1785450720, -1785450720)[0]);
        sN.OOiIkkpr0("kyqkof", -1785450714, -967301069, -967301070, -967301071, -1785450714, -1785450714, (sN)this)[sN.OOiIkkpr0("lqkc", -1785450720, -967301069, -967301057, -967301058, -1785450720, -1785450720)[0]] = callSite;
    }

    static {
        sN.ntfClinit();
    }

    private static void s() {
        u = new short[]{0, 0, 0, 2};
    }

    private static void m() {
        i = new String[]{"only-while-breaking"};
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateRight(n ^ 0x6AA6D0E7, 20) ^ 0xD0CC3C81, 11);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{31, -62, 61, -30, -56, 72, -126, -47, -62, 24, 33, 28, -104, 12, 8, -73};
        int n = 0;
        int n2 = 120;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 145;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @uF
    public void N(iF iF2) {
        sN.OOiIkkpr0("nvcs", -1785450716, -967301069, -967301066, -967301067, -1143518683, 500993438, (sN)this);
        if (sN.OOiIkkpr0("kifg", -1785450716, -967301085, -967301086, -967301087, -1143518683, 500993438, (Boolean)((Boolean)((Object)sN.OOiIkkpr0("lefhpe", -1785450716, -967301059, -967301068, -967301060, -1143518683, 500993438, (lT)((lT)((Object)sN.OOiIkkpr0("sbrno", -1785450714, -967301069, -967301070, -967301071, 2077430445, -1187597609, (sN)this)[sN.OOiIkkpr0("czgoeay", -1785450720, -967301069, -967301057, -967301058, -191814474, 637900562)[1]])))))) != false) {
            if (sN.OOiIkkpr0("sbrno", -1785450716, -967301083, -967301084, -967301087, -1143518683, 500993438, (NNNZZ)((NNNZZ)sN.OOiIkkpr0("lqkc", -1785450714, -967301081, -967301082, -967301071, -908437979, 2070372033, (NNuU)((NNuU)sN.OOiIkkpr0("ewyysn", -1785450714, -967301069, -967301088, -967301071, 2016840840, 563586467, (sN)this)[sN.OOiIkkpr0("kifg", -1785450720, -967301069, -967301057, -967301058, 1998078440, -435142414)[2]]))[sN.OOiIkkpr0("ewyysn", -1785450720, -967301069, -967301057, -967301058, -2122477962, 1914381845)[3]])) == false) {
                return;
            }
        }
        sN.OOiIkkpr0("dtlq", -1785450716, -967301077, -967301063, -967301067, -1143518683, 500993438, (iF)iF2);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(Integer.rotateLeft(n ^ 0x818F2362, 19), 5), 13), 20), 8);
    }

    private static /* synthetic */ void ntfClinit() {
        Olslp = "\u0006\u00b6d\u00c0?4{m\u00d2x&\u008a\u00e9\u00a6z\u00bdd\u00c0?4{m\u00d2Z<\b\t\u00dc4l\u00cd\u0001 DR\u00b8[G\u0093\u00e5;\u001c\"\u0007jA\u00a9)\u0007Pg\u00d2e\u001c\u008d\u00d5n7s<5l\u00cd\u0001 DR\u00b8[G\u0093\u00e8;\u0098\u00f4\u00f7\u00afl\u00ec$\u0010_/\u0091W\u0006\u0098\u0093S$:S\u009aG\u00bd\u00d1\t\u00ca/\u0007Ha\u00d2Z\t\u0091\u00db/\u001f*\f\u009cC\u00f2~\u00df\u00bfd\u00c0?4{m\u00d2_.\u00a8\u00b4\u009f\u00fad\u00c0?4{m\u00d2E&[s\u00a8d\u00c0?4{m\u00d2x&\u00b1\u00e6Z\u00cb\t\u00d0\u00dbA\u00f0$IRa\u0093QG\u00bd\u00d3o<-[\u00df\u009b\u00acd\u00c0?4{m\u00d2Z\u0003\u00d9O\u00e9)\u0003_n\u00abW\u0004\u008a\u00d9{l\u00ec$\u0010_/\u0091W\u0006\u0098\u0093O2\"\u0003CT\u00bd";
        llmkt = new int[]{8454154, 4915201, 12910611, 4849665, 851970, 0x800001, 10092547, 8323073, 4980755, 0xAF000A, 1, 1835053, 8257537, 9109506, 983050, 6225940, 10289169, 12124172, 1638403, 7536641, 65548, 11403265, 0x8D000D, 4784129, 7602186};
        sN.s();
        sN.T();
        sN.m();
    }

    private static /* synthetic */ CallSite OOiIkkpr0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = llmkt[n2 ^ 0xC6582833];
        int n8 = n7 >>> 16;
        String string2 = sN.lltjO(Olslp.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xC6582833);
        n7 = llmkt[n3 ^ 0xC6582833];
        int n9 = n7 >>> 16;
        String string3 = sN.lltjO(Olslp.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xC6582833);
        n7 = llmkt[n4 ^ 0xC6582833];
        int n10 = n7 >>> 16;
        String string4 = sN.lltjO(Olslp.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xC6582833);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x95942F92) + -178;
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

    private static /* synthetic */ void lOmiqq(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[25];
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
        Olslp = stringBuilder.toString();
        llmkt = nArray;
    }

    private static /* synthetic */ String lltjO(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-122, -90, 32, 55, 61, 101, 91, 123, 73, -50, -102, 114, 97, 112, 127, 91};
        byte[] byArray3 = new byte[]{109, -65, -65, -16, 73, -102, 64, -119, -10, 56, -127, 110, -48, -59, 81, -19};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite l1rOInn0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = llmkt[n2 ^ 0xC6582833];
        int n9 = n8 >>> 16;
        String string2 = sN.lltjO(Olslp.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xC6582833);
        n8 = llmkt[n3 ^ 0xC6582833];
        int n10 = n8 >>> 16;
        String string3 = sN.lltjO(Olslp.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xC6582833);
        n8 = llmkt[n4 ^ 0xC6582833];
        int n11 = n8 >>> 16;
        String string4 = sN.lltjO(Olslp.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xC6582833);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x95942F92) + -178;
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

    private static /* synthetic */ CallSite lInntqrI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = llmkt[n2 ^ 0xC6582833];
        int n8 = n7 >>> 16;
        String string2 = sN.lltjO(Olslp.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xC6582833);
        n7 = llmkt[n3 ^ 0xC6582833];
        int n9 = n7 >>> 16;
        String string3 = sN.lltjO(Olslp.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xC6582833);
        n7 = llmkt[n4 ^ 0xC6582833];
        int n10 = n7 >>> 16;
        String string4 = sN.lltjO(Olslp.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xC6582833);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x95942F92) + -178;
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
