/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNNi
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 */
package KDFzREm;

import KDFzREm.NNNNi;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.RP;
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

@UZ(L="AutoRespawn", y=UR.PLAYER, N=Uz.AUTO)
public class PC
extends UM {
    private static short[] L;
    private static /* synthetic */ String IIprO;
    private static /* synthetic */ int[] IIlt0;

    static {
        PC.ntfClinit();
    }

    private static void m() {
        L = new short[]{0, 0, 4, 0, 4, 0, 4};
    }

    @uF
    private void N(RP rP) {
        CallSite callSite = PC.OOsss("udor", 1748234486, -375672481, -375672487, -375672482, 872959075, 869452636, -537260410, (RP)rP);
        if (callSite instanceof NNNNi) {
            NNNNi nNNNi = (NNNNi)callSite;
            PC.OOsss("nfnhg", 1748234486, -375672492, -375672511, -375672512, 872959075, 869452636, -537260410, (NNuU)((NNuU)PC.OOsss("chkgy", 1748234484, -375672495, -375672496, -375672493, 358064080, -592475322, 365638893, (PC)this)[PC.OOsss("lghi", 1748234482, -375672495, -375672494, -375672491, -1033784805, 883303160, -346572963)[0]]), () -> {
                if ((NNNwS)PC.OOsss("ukek", 1748234484, -375672492, -375672489, -375672493, 1285058697, -708912908, 1253843701, (NNuU)((NNuU)PC.OOsss("nfke", 1748234484, -375672495, -375672496, -375672493, -703862897, 1243158724, 854773906, (PC)this)[PC.OOsss("nfnhg", 1748234482, -375672495, -375672494, -375672491, 2114406278, 1681235048, -1392493671)[1]]))[PC.OOsss("tmzg", 1748234482, -375672495, -375672494, -375672491, 197675724, -1015611756, 496064143)[2]] != null) {
                    if (PC.OOsss("zeovowr", 1748234486, -375672490, -375672487, -375672488, 872959075, 869452636, -537260410, (NNNNi)nNNNi) == PC.OOsss("nfke", 1748234486, -375672485, -375672486, -375672488, 872959075, 869452636, -537260410, (NNNwS)((NNNwS)PC.OOsss("udor", 1748234484, -375672492, -375672489, -375672493, 1747866635, -1906996227, 106818848, (NNuU)((NNuU)PC.OOsss("jswoshkp", 1748234484, -375672495, -375672496, -375672493, 187042026, 1855875985, -649965187, (PC)this)[PC.OOsss("chkgy", 1748234482, -375672495, -375672494, -375672491, 565622595, 1073357460, -464867256)[3]]))[PC.OOsss("udor", 1748234482, -375672495, -375672494, -375672491, -149618813, -1787720028, 50806574)[4]]))) {
                        PC.OOsss("chkgy", 1748234486, -375672485, -375672483, -375672484, 872959075, 869452636, -537260410, (NNNwS)((NNNwS)PC.OOsss("dmmq", 1748234484, -375672492, -375672489, -375672493, -1438720614, 5088710, -403942973, (NNuU)((NNuU)PC.OOsss("udor", 1748234484, -375672495, -375672496, -375672493, 1494463669, -1852971308, 1845742264, (PC)this)[PC.OOsss("udor", 1748234482, -375672495, -375672494, -375672491, -931110181, 1387855873, 1637051141)[5]]))[PC.OOsss("nfnhg", 1748234482, -375672495, -375672494, -375672491, 1800257788, 1293105961, -1105046299)[6]]));
                    }
                }
            });
        }
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateRight(n ^ 0x2E88EE21, 28) ^ 0x701AF09D, 27) ^ 0x90F33561;
    }

    private static /* synthetic */ void ntfClinit() {
        IIprO = "\u00ed\u0080\u00c2\u0017\u00dfe5\u0090\u001d\u0082\u0012\u00fd\n\"\u0080\u00c2\u0017\u00dfe5\u0090\u0001\u009cL\u0088\u00ee\f\u00fbAw\u00d32\u00a2;\u00a5\u000ba,\u00f2\u0005\u00a6\u00e8\b\u00b6\t\u000eu\u0097\u00d2\u00a1\u00f0\u0005\u00e2D\u0007\u008ae\u00fed~\u0080\u00c2\u0017\u00dfe5\u0090\u0003\u008fE\u00cc\u00ed\u00d23P\u00bc\u00e1\u000e\u00f8T=\u00bb\u0080\u00c2\u0017\u00dfe5\u0090\u001d\u0082\u0012\u00c40\u00cd\u0080\u00c2\u0017\u00dfe5\u0090\u001d\u0082)\u00dfvD\u00ed\u00cd\u009e\u00ed\u00c8&\u00c9f\"\u00ed\u0016\u00a1s\u00c4\u0018Wy\u001dK\u00f3\u0088\u00ee\f\u00fbAw\u00d32\u00a2;\u00a5\u0016v(*\u00cb\u00b0\u00bf";
        IIlt0 = new int[]{3866634, 8192001, 8323091, 4521985, 0x2E0002, 6160396, 6946817, 5308429, 4784129, 7012355, 13, 0x30000B, 8257537, 4587523, 851978, 7208975, 4849671, 0x170017};
        PC.m();
    }

    private static /* synthetic */ void lI0Ikkrnj(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[18];
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
        IIprO = stringBuilder.toString();
        IIlt0 = nArray;
    }

    private static /* synthetic */ CallSite OOsss(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = IIlt0[n2 ^ 0xE99BB151];
        int n9 = n8 >>> 16;
        String string2 = PC.lOkqpmlpi(IIprO.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xE99BB151);
        n8 = IIlt0[n3 ^ 0xE99BB151];
        int n10 = n8 >>> 16;
        String string3 = PC.lOkqpmlpi(IIprO.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xE99BB151);
        n8 = IIlt0[n4 ^ 0xE99BB151];
        int n11 = n8 >>> 16;
        String string4 = PC.lOkqpmlpi(IIprO.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xE99BB151);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x6833F040) + -178;
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

    private static /* synthetic */ String lOkqpmlpi(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{125, 17, 95, 116, 0, -5, -43, -53, 83, 25, 20, -62, 72, -103, -37, -115};
        byte[] byArray3 = new byte[]{76, -83, -116, -48, -77, -7, -127, 40, -52, 41, 66, -7, 99, -34, -35, 102};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite OOjksl(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = IIlt0[n2 ^ 0xE99BB151];
        int n7 = n6 >>> 16;
        String string2 = PC.lOkqpmlpi(IIprO.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xE99BB151);
        n6 = IIlt0[n3 ^ 0xE99BB151];
        int n8 = n6 >>> 16;
        String string3 = PC.lOkqpmlpi(IIprO.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xE99BB151);
        n6 = IIlt0[n4 ^ 0xE99BB151];
        int n9 = n6 >>> 16;
        String string4 = PC.lOkqpmlpi(IIprO.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xE99BB151);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x6833F040) + -178;
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

    private static /* synthetic */ CallSite lIjiIi(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = IIlt0[n2 ^ 0xE99BB151];
        int n10 = n9 >>> 16;
        String string2 = PC.lOkqpmlpi(IIprO.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0xE99BB151);
        n9 = IIlt0[n3 ^ 0xE99BB151];
        int n11 = n9 >>> 16;
        String string3 = PC.lOkqpmlpi(IIprO.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0xE99BB151);
        n9 = IIlt0[n4 ^ 0xE99BB151];
        int n12 = n9 >>> 16;
        String string4 = PC.lOkqpmlpi(IIprO.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0xE99BB151);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x6833F040) + -178;
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
