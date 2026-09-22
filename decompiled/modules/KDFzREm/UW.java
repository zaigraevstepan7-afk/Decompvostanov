/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.NSe
 *  KDFzREm.Nww
 */
package KDFzREm;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NSe;
import KDFzREm.Nww;
import KDFzREm.Rs;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.kR;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="NoSlotChange", y=UR.COMBAT, N=Uz.OTHER)
public class UW
extends UM {
    private static short[] L;
    private static /* synthetic */ String lOmpIsiqI;
    private static /* synthetic */ int[] OOprn;

    static {
        UW.ntfClinit();
    }

    private static void m() {
        L = new short[]{0, 4};
    }

    private /* synthetic */ void y(int n) {
        CallSite callSite = UW.llilIl00("lkheso", -431877989, -687270326, -687270325, -687270324, 781692792, (Nww)UW.llilIl00("jenubko", -431877989, -687270329, -687270328, -687270327, 781692792, (NNNwS)((NNNwS)UW.llilIl00("bdrmsr", -431877991, -687270331, -687270330, -687270334, -1750961535, (NNuU)((NNuU)UW.llilIl00("ficpfgd", -431877991, -687270336, -687270335, -687270334, -895855882, (UW)this)[UW.llilIl00("lxvskdav", -431877985, -687270336, -687270333, -687270332, 2121357227)[0]]))[UW.llilIl00("igui", -431877985, -687270336, -687270333, -687270332, 127393980)[1]])));
        UW.llilIl00("igui", -431877995, -687270323, -687270322, -687270321, 781692792, n);
        UW.llilIl00("nrzvwzzk", -431877995, -687270323, -687270322, -687270321, 781692792, (int)callSite);
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateRight(-Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(n ^ 0x4C0B0788, 29), 23), 27), 21), 17);
    }

    @uF
    private void N(Rs rs) {
        CallSite callSite = UW.llilIl00("qatffhrv", -431877989, -687270320, -687270319, -687270318, 781692792, (Rs)rs);
        if (callSite instanceof NSe) {
            CallSite callSite2;
            NSe nSe = (NSe)callSite;
            try {
                CallSite callSite3;
                callSite2 = callSite3 = UW.llilIl00("glbzvijf", -431877989, -687270317, -687270325, -687270324, 781692792, (NSe)nSe);
            }
            catch (Throwable throwable) {
                throw new MatchException((String)((Object)UW.llilIl00("ttmwt", -431877989, -687270310, -687270309, -687270308, 781692792, (Throwable)throwable)), throwable);
            }
            UW.llilIl00("lxvskdav", -431877989, -687270320, -687270325, -687270316, 781692792, (Rs)rs);
            UW.llilIl00("qatffhrv", -431877989, -687270312, -687270325, -687270311, 781692792, (kR)((Object)UW.llilIl00("bdrmsr", -431877995, -687270315, -687270314, -687270313, 781692792)), () -> this.y((int)callSite2));
        }
    }

    private static /* synthetic */ void ntfClinit() {
        lOmpIsiqI = "K\u0095\u00aa\u0010R\u0082\u00c0m\u008e\u00d69\u00e1\u00b4\u0098\u0002o\u00a3\u00f2q\u00db\u0091\u000b\u00b2\u00c7\u0095\u00aa\u0010R\u0082\u00c0m\u0081\u00f6\"5\u000e\u00f8\u00a0!D\u0081\u00d7\u0010\u00af\u00c9\u0010\u00c4\u00b7%\u00dd7\u00f8\u00baL\u00f8\u00a0\u0000a\u00b1\u00ccm\u0086\u00c5Q\u00ed\u00d95\u0092r\r\u00bf\u008bQ\u00a5\u0095\u00aa\u0010R\u0082\u00c0m\u00bf\u00f3\u0007\u00f8\u00a0!D\u0081\u00d7\u0010\u00af\u00c9\u0010\u00e1\u00a4]\u00a8(}\u009d\u0086\u000bv\u00a6\u0082.\u008b\u00caX\u00a5\u00b9\u0004\u008c\u00b4E\u00a5\u00d7\u00dc\u00f1\u009d\u0086\u000bv\u00a6\u0082.\u008b\u00caX\u00a5\u00a4\u0013\u0088\u009f\u00b8\u00b3\u0080\u000f;\u00ee\u00fb\u00aa\u0098\u00c5<#\u0095\u00aa\u0010R\u0082\u00c0m\u0093\u00a4\u00b0\u009a\u000b/\u00ab\u00cc,\u008d\u008bk\u00e2\u0084\t\u0091X\u00ac\u00bd\u0089/\u0095\u00aa\u0010R\u0082\u00c0m\u00a4\u00f7Z\u00f1\u00f8\u00a0!D\u0081\u00d7\u0010\u00af\u00c9\u0010\u00c4\u0081\u0011\u00dd\u0085\u0095\u00aa\u0010R\u0082\u00c0m\u00a4\u00d3HL\u00f8\u00a5#\u0095\u00aa\u0010R\u0082\u00c0m\u00a4\u00eaJ\u00df\u00d2\u0092\u00be\u00bf\u001er\u00ae\u00c3%\u00a5\u0095\u00aa\u0010R\u0082\u00c0m\u00b8\u00d7D\u0082d\u0095\u00aa\u0010R\u0082\u00c0m\u00a4\u00eaq\u00fd\u00a5";
        OOprn = new int[]{4784138, 655361, 6488083, 6422529, 16056322, 14024716, 7733249, 16187405, 720908, 12124175, 13107211, 0x610001, 0xD30003, 10, 0x210001, 9306116, 15400970, 0x220001, 2293775, 11403275, 0x320003, 0x920009, 14811137, 5439502, 1507338, 0x770017, 10158099, 14876680, 3473428};
        UW.m();
    }

    private static /* synthetic */ CallSite llilIl00(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = OOprn[n2 ^ 0xD7091640];
        int n7 = n6 >>> 16;
        String string2 = UW.Ol0npqss(lOmpIsiqI.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xD7091640);
        n6 = OOprn[n3 ^ 0xD7091640];
        int n8 = n6 >>> 16;
        String string3 = UW.Ol0npqss(lOmpIsiqI.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xD7091640);
        n6 = OOprn[n4 ^ 0xD7091640];
        int n9 = n6 >>> 16;
        String string4 = UW.Ol0npqss(lOmpIsiqI.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xD7091640);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE642102D) + -178;
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

    private static /* synthetic */ CallSite I1tt0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = OOprn[n2 ^ 0xD7091640];
        int n10 = n9 >>> 16;
        String string2 = UW.Ol0npqss(lOmpIsiqI.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0xD7091640);
        n9 = OOprn[n3 ^ 0xD7091640];
        int n11 = n9 >>> 16;
        String string3 = UW.Ol0npqss(lOmpIsiqI.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0xD7091640);
        n9 = OOprn[n4 ^ 0xD7091640];
        int n12 = n9 >>> 16;
        String string4 = UW.Ol0npqss(lOmpIsiqI.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0xD7091640);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE642102D) + -178;
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

    private static /* synthetic */ String Ol0npqss(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-109, 93, -9, 31, -45, -40, -68, -9, -5, -75, 117, 125, 74, 27, 17, -116};
        byte[] byArray3 = new byte[]{-19, 38, 121, -121, 56, -10, 104, -24, -26, 65, -6, 30, -50, -74, -55, -16};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void IIlsq(String[] stringArray) {
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
        lOmpIsiqI = stringBuilder.toString();
        OOprn = nArray;
    }

    private static /* synthetic */ CallSite lIpOOntOr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = OOprn[n2 ^ 0xD7091640];
        int n7 = n6 >>> 16;
        String string2 = UW.Ol0npqss(lOmpIsiqI.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xD7091640);
        n6 = OOprn[n3 ^ 0xD7091640];
        int n8 = n6 >>> 16;
        String string3 = UW.Ol0npqss(lOmpIsiqI.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xD7091640);
        n6 = OOprn[n4 ^ 0xD7091640];
        int n9 = n6 >>> 16;
        String string4 = UW.Ol0npqss(lOmpIsiqI.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xD7091640);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE642102D) + -178;
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

    private static /* synthetic */ CallSite I1IqijO00(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = OOprn[n2 ^ 0xD7091640];
        int n9 = n8 >>> 16;
        String string2 = UW.Ol0npqss(lOmpIsiqI.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xD7091640);
        n8 = OOprn[n3 ^ 0xD7091640];
        int n10 = n8 >>> 16;
        String string3 = UW.Ol0npqss(lOmpIsiqI.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xD7091640);
        n8 = OOprn[n4 ^ 0xD7091640];
        int n11 = n8 >>> 16;
        String string4 = UW.Ol0npqss(lOmpIsiqI.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xD7091640);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE642102D) + -178;
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
