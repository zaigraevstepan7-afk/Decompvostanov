/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.UB;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.kE;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="TickRateSync", y=UR.MISC, N=Uz.BASE)
public class WK
extends UM {
    private static float[] L;
    private static /* synthetic */ String lljks;
    private static /* synthetic */ int[] OOIqp;

    private static void P() {
        L = new float[]{20.0f};
    }

    static {
        WK.ntfClinit();
    }

    public static float m() {
        CallSite callSite = WK.Olrpikri("sfbs", 715613633, -2047865342, -2047865339, -2047865340, -1924468608, -1181185325, (UB)((Object)WK.Olrpikri("sbjsokr", 715613647, -2047865343, -2047865344, -2047865341, -1924468608, -1181185325)));
        if (WK.Olrpikri("ebsiac", 715613633, -2047865337, -2047865338, -2047865335, -1924468608, -1181185325, (WK)((Object)callSite)) != false) {
            return (float)WK.Olrpikri("ipbskkh", 715613633, -2047865333, -2047865334, -2047865331, -1924468608, -1181185325, (kE)((Object)WK.Olrpikri("whnj", 715613647, -2047865343, -2047865338, -2047865336, -1924468608, -1181185325)));
        }
        return (float)WK.Olrpikri("whnj", 715613637, -2047865337, -2047865332, -2047865329, 1032138494, 870011077)[0];
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(-Integer.rotateRight(n ^ 0xA17C8F8D, 27) ^ 0x180C1F86, 23) ^ 0x5F442287;
    }

    private static /* synthetic */ void ntfClinit() {
        lljks = "\u00f4\u00bd\u0006\u00a6)\"\u00e5\u00edA\u00de\u00cb\u00e2\u00da\u00e3\u00ec\u00a8\u00a7\u00bd\fO\u00d0\f\u0097?!\u00f2\u0090o\u00f6r\u00bd\u00103\u00fd\u00da(\u00bd\u0006\u00a6)\"\u00e5\u00edA\u00de\u00cb\u00dc\u00dd\u00e3\u008e\u00d0\f\u0097?!\u00f2\u0090S\u00f8|\u00d2\\`\u00bd\u0006\u00a6)\"\u00e5\u00edA\u00de\u00cb\u00de\u00d4\u00e3\u00ae\u00d0\f\u0097?!\u00f2\u0090Q\u00f17\u00d0\f\u0097?!\u00f2\u0090}";
        OOIqp = new int[]{5636105, 917505, 2293774, 4980746, 0x200002, 0x3E000E, 3211274, 983041, 1900547, 14, 1245194, 0x220001, 0x100003, 3997697, 3866626};
        WK.P();
    }

    private static /* synthetic */ CallSite Olrpikri(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = OOIqp[n2 ^ 0x85F00E01];
        int n8 = n7 >>> 16;
        String string2 = WK.Ilklismq(lljks.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x85F00E01);
        n7 = OOIqp[n3 ^ 0x85F00E01];
        int n9 = n7 >>> 16;
        String string3 = WK.Ilklismq(lljks.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x85F00E01);
        n7 = OOIqp[n4 ^ 0x85F00E01];
        int n10 = n7 >>> 16;
        String string4 = WK.Ilklismq(lljks.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x85F00E01);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x2AA76577) + -178;
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

    private static /* synthetic */ CallSite I1jntO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = OOIqp[n2 ^ 0x85F00E01];
        int n9 = n8 >>> 16;
        String string2 = WK.Ilklismq(lljks.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x85F00E01);
        n8 = OOIqp[n3 ^ 0x85F00E01];
        int n10 = n8 >>> 16;
        String string3 = WK.Ilklismq(lljks.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x85F00E01);
        n8 = OOIqp[n4 ^ 0x85F00E01];
        int n11 = n8 >>> 16;
        String string4 = WK.Ilklismq(lljks.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x85F00E01);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x2AA76577) + -178;
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

    private static /* synthetic */ void OOOskOsmp(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[15];
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
        lljks = stringBuilder.toString();
        OOIqp = nArray;
    }

    private static /* synthetic */ CallSite l1inqInjI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = OOIqp[n2 ^ 0x85F00E01];
        int n7 = n6 >>> 16;
        String string2 = WK.Ilklismq(lljks.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x85F00E01);
        n6 = OOIqp[n3 ^ 0x85F00E01];
        int n8 = n6 >>> 16;
        String string3 = WK.Ilklismq(lljks.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x85F00E01);
        n6 = OOIqp[n4 ^ 0x85F00E01];
        int n9 = n6 >>> 16;
        String string4 = WK.Ilklismq(lljks.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x85F00E01);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x2AA76577) + -178;
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

    private static /* synthetic */ String Ilklismq(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-84, -28, 35, 81, -117, 53, -10, 73, -88, -68, -26, 2, 105, 112, -48, 15};
        byte[] byArray3 = new byte[]{-62, 54, -38, -116, -106, -8, 110, -65, -8, 102, 1, -95, -26, 91, 82, 86};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }
}
