/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNG
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 */
package KDFzREm;

import KDFzREm.NNNG;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Rn;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="CustomCape", y=UR.MISC, N=Uz.CLIENT)
public class WY
extends UM {
    private static short[] u;
    public Object[] L;
    private static boolean[] i;
    private static String[] R;
    private static /* synthetic */ String Ililm;
    private static /* synthetic */ int[] oosr0sj;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft((Integer.rotateLeft(-Integer.rotateLeft(n, 15), 1) ^ 0xCEA4379D) + 1, 23);
    }

    private void P() {
        if (WY.I1ktqs("gpkpxhus", 1692542502, 1330894664, 1330894667, 1330894668, 1692542502, 1692542502, (WY)this) == null) {
            WY.I1ktqs("kecjj", 1692542503, 1330894664, 1330894667, 1330894668, 1692542503, 1692542503, (WY)this, (Object[])new Object[WY.I1ktqs("gpkpxhus", 1692542496, 1330894664, 1330894669, 1330894670, 1692542496, 1692542496)[0]]);
            CallSite callSite = WY.I1ktqs("aukmfr", 1692542502, 1330894664, 1330894667, 1330894668, 1692542502, 1692542502, (WY)this);
        }
    }

    private static void T() {
        u = new short[]{0, 4, 0, 0, 0};
    }

    public WY() {
        WY.I1ktqs("wtgxnqh", 1692542500, 1330894664, 1330894665, 1330894666, 1692542500, 1692542500, (WY)this);
    }

    static {
        WY.ntfClinit();
    }

    private static void s() {
        i = new boolean[]{true};
    }

    private static void m() {
        R = new String[]{"textures/capes/cape.png"};
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-22, 51, 98, 87, -90, 9, -12, -112, 115, 14, 6, 76, 121, 59, -58, 65};
        int n = 0;
        int n2 = 13;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 119;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(-Integer.rotateLeft((Integer.rotateRight(n, 31) ^ 0x54BC3454) + 1 ^ 0x73820296, 7), 27);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(n, 11), 9), 11), 19), 10);
    }

    @uF
    public void N(Rn rn) {
        WY.I1ktqs("wtgxnqh", 1692542500, 1330894664, 1330894665, 1330894666, -1637797590, 283647422, (WY)this);
        if (WY.I1ktqs("ityppv", 1692542500, 1330894671, 1330894656, 1330894657, -1637797590, 283647422, (Rn)rn) == (NNNwS)WY.I1ktqs("wtgxnqh", 1692542502, 1330894660, 1330894661, 1330894668, 833967605, -846667502, (NNuU)((NNuU)WY.I1ktqs("tacb", 1692542502, 1330894664, 1330894656, 1330894668, 1891454582, -978997118, (WY)this)[WY.I1ktqs("ijuibsl", 1692542496, 1330894664, 1330894658, 1330894659, -430011076, 878031538)[0]]))[WY.I1ktqs("gpkpxhus", 1692542496, 1330894664, 1330894658, 1330894659, 1703763341, -1060855184)[1]]) {
            if ((NNNG)WY.I1ktqs("xasroy", 1692542502, 1330894664, 1330894667, 1330894668, 412628781, -588971754, (WY)this)[WY.I1ktqs("nthjwcg", 1692542496, 1330894664, 1330894658, 1330894659, 737204530, -1189188081)[2]] == null) {
                CallSite callSite = WY.I1ktqs("tacb", 1692542506, 1330894680, 1330894681, 1330894682, -1637797590, 283647422, (String)((Object)WY.I1ktqs("vugv", 1692542496, 1330894664, 1330894662, 1330894663, -1846082481, -453233470)[0]));
                WY.I1ktqs("xasroy", 1692542502, 1330894664, 1330894667, 1330894668, -1497019003, 1878112729, (WY)this)[WY.I1ktqs("xasroy", 1692542496, 1330894664, 1330894658, 1330894659, -1527479252, 625449890)[3]] = callSite;
            }
            WY.I1ktqs("vpaxnqsq", 1692542500, 1330894671, 1330894681, 1330894683, -1637797590, 283647422, (Rn)rn, (NNNG)((NNNG)WY.I1ktqs("aukmfr", 1692542502, 1330894664, 1330894667, 1330894668, 603837722, 1111928019, (WY)this)[WY.I1ktqs("arew", 1692542496, 1330894664, 1330894658, 1330894659, -274698258, 1981384077)[4]]));
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Ililm = "\u00cb(\u009djs\u00cf\u00f5/\u00e1H\u00e9\u00d5h\u00d8\u00d2F\u00a8n\u00b6;;\u00f5\u00dfD\u00cbS\u00d5\u00f7*\u00a4\u00e8z\u008fG\u00ea&_\u0095Fh\u00eb\u00d1m\u00a2^\u00e4!\u009djs\u00cf\u00f5/\u00e1H\u00e9\u00d5h\u00d8\u00d2F\u000e\u0014\u00b6;\u0089(\u00f8V\u00f4\u00f8LY\u00fd\u00d2z\u00dfl\u00ea\u009d\t\u00e9\u00ed\u000f\u0005_\u0095Fh\u00eb\u00d1m\u00a2~\u00de\u008b\u0082\u00ee\u00b7\u0095Fh\u00eb\u00d1m\u00a2{\u00e9\u001e\u008b8\u0093\u009djs\u00cf\u00f5/\u00e1H\u00e9\u00d5h\u00c4\u00c4^A\u00ab\u00a5;\u009e\u00ba\u0095Fh\u00eb\u00d1m\u00a2g\u00c9\u00c7\u0012\u00ed\u009dKV\u00ff\u00eeR\u00c8D\u00a8\u00fc\t\u00c5\u00e1\u000f\u00e8\u0089\u009aDT\u00c3\u00c6E\u00e0\u0006\u00d5\u00dc|\u0081";
        oosr0sj = new int[]{0x55000A, 7208961, 4325379, 0x410001, 7274515, 8519681, 7077890, 6422538, 1, 4521999, 0x610001, 6225922, 8585228, 11206657, 5505025, 3014675, 2359306, 2293761, 65570, 9371676};
        WY.T();
        WY.s();
        WY.m();
    }

    private static /* synthetic */ CallSite Olsiiknk0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = oosr0sj[n2 ^ 0x4F53D748];
        int n10 = n9 >>> 16;
        String string2 = WY.lOsqrIOIs(Ililm.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x4F53D748);
        n9 = oosr0sj[n3 ^ 0x4F53D748];
        int n11 = n9 >>> 16;
        String string3 = WY.lOsqrIOIs(Ililm.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x4F53D748);
        n9 = oosr0sj[n4 ^ 0x4F53D748];
        int n12 = n9 >>> 16;
        String string4 = WY.lOsqrIOIs(Ililm.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x4F53D748);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x64E22692) + -178;
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

    private static /* synthetic */ void Olljr(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[20];
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
        Ililm = stringBuilder.toString();
        oosr0sj = nArray;
    }

    private static /* synthetic */ String lOsqrIOIs(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-13, 54, -25, -101, -74, 15, 59, 4, 104, 35, 65, 47, -92, -119, 2, 38};
        byte[] byArray3 = new byte[]{-14, 65, -96, 112, 31, -58, -40, 36, 102, 91, -122, 109, 101, -70, 61, 19};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite lIsti0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = oosr0sj[n2 ^ 0x4F53D748];
        int n9 = n8 >>> 16;
        String string2 = WY.lOsqrIOIs(Ililm.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x4F53D748);
        n8 = oosr0sj[n3 ^ 0x4F53D748];
        int n10 = n8 >>> 16;
        String string3 = WY.lOsqrIOIs(Ililm.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x4F53D748);
        n8 = oosr0sj[n4 ^ 0x4F53D748];
        int n11 = n8 >>> 16;
        String string4 = WY.lOsqrIOIs(Ililm.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x4F53D748);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x64E22692) + -178;
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

    private static /* synthetic */ CallSite I1ktqs(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = oosr0sj[n2 ^ 0x4F53D748];
        int n8 = n7 >>> 16;
        String string2 = WY.lOsqrIOIs(Ililm.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x4F53D748);
        n7 = oosr0sj[n3 ^ 0x4F53D748];
        int n9 = n7 >>> 16;
        String string3 = WY.lOsqrIOIs(Ililm.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x4F53D748);
        n7 = oosr0sj[n4 ^ 0x4F53D748];
        int n10 = n7 >>> 16;
        String string4 = WY.lOsqrIOIs(Ililm.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x4F53D748);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x64E22692) + -178;
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

    private static /* synthetic */ CallSite ooirOr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = oosr0sj[n2 ^ 0x4F53D748];
        int n10 = n9 >>> 16;
        String string2 = WY.lOsqrIOIs(Ililm.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x4F53D748);
        n9 = oosr0sj[n3 ^ 0x4F53D748];
        int n11 = n9 >>> 16;
        String string3 = WY.lOsqrIOIs(Ililm.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x4F53D748);
        n9 = oosr0sj[n4 ^ 0x4F53D748];
        int n12 = n9 >>> 16;
        String string4 = WY.lOsqrIOIs(Ililm.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x4F53D748);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x64E22692) + -178;
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
