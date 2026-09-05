/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.mi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="DiscordActivity", y=UR.MISC, N=Uz.CLIENT)
public class mu
extends UM {
    private static /* synthetic */ String OlIsq;
    private static /* synthetic */ int[] I1k0Irt;

    static {
        mu.ntfClinit();
    }

    @Override
    public boolean Z() {
        mu.llOnq("hyqwh", -2111499238, -272035889, -272035899, -272035895, -2111499238, -2111499238, (mi)((Object)mu.llOnq("mrnplpne", -2111499244, -272035892, -272035891, -272035890, -2111499244, -2111499244)));
        return (boolean)mu.llOnq("atzenp", -2111499237, -272035894, -272035898, -272035900, -2111499237, -2111499237, (UM)this);
    }

    @Override
    public boolean i() {
        mu.llOnq("ksvc", -2111499238, -272035889, -272035896, -272035895, -1296425248, -1082995313, (mi)((Object)mu.llOnq("aoqs", -2111499244, -272035892, -272035891, -272035890, -1296425248, -1082995313)));
        return (boolean)mu.llOnq("ksvc", -2111499237, -272035894, -272035893, -272035900, -1296425248, -1082995313, (UM)this);
    }

    private static /* synthetic */ void ntfClinit() {
        OlIsq = "d\u0091\u00cdG\u001eD\u00f5\u0012si=s\u00fc\u00c7v\bG\u00e2o[m\u009a\u00a3X\u0081\u00ae\u0098\u00e8\u00fc\u00d1\u009c\u008f\u0091\u00cdG\u001eD\u00f5\u0012gN\u008b\u0091\u00cdG\u001eD\u00f5\u0012KMd\u00fc\u00dd";
        I1k0Irt = new int[]{2031625, 655361, 720910, 10, 0x1A0001, 0x330003, 2686986, 0x190001, 1769475, 2621441, 0x1E0001};
    }

    private static /* synthetic */ CallSite OlliItIl(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = I1k0Irt[n2 ^ 0xEFC90FCC];
        int n9 = n8 >>> 16;
        String string2 = mu.IIIsO(OlIsq.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xEFC90FCC);
        n8 = I1k0Irt[n3 ^ 0xEFC90FCC];
        int n10 = n8 >>> 16;
        String string3 = mu.IIIsO(OlIsq.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xEFC90FCC);
        n8 = I1k0Irt[n4 ^ 0xEFC90FCC];
        int n11 = n8 >>> 16;
        String string4 = mu.IIIsO(OlIsq.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xEFC90FCC);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x822514AC) + -178;
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

    private static /* synthetic */ String IIIsO(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-47, 95, 22, 44, -99, 23, -2, 17, -66, 17, -96, 48, 29, -118, 102, 21};
        byte[] byArray3 = new byte[]{-103, -106, 42, 10, 28, -123, -108, 10, 2, -80, 79, -89, -53, -124, -53, 109};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite llOnq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = I1k0Irt[n2 ^ 0xEFC90FCC];
        int n8 = n7 >>> 16;
        String string2 = mu.IIIsO(OlIsq.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xEFC90FCC);
        n7 = I1k0Irt[n3 ^ 0xEFC90FCC];
        int n9 = n7 >>> 16;
        String string3 = mu.IIIsO(OlIsq.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xEFC90FCC);
        n7 = I1k0Irt[n4 ^ 0xEFC90FCC];
        int n10 = n7 >>> 16;
        String string4 = mu.IIIsO(OlIsq.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xEFC90FCC);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x822514AC) + -178;
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

    private static /* synthetic */ void ooltr(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[11];
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
        OlIsq = stringBuilder.toString();
        I1k0Irt = nArray;
    }

    private static /* synthetic */ CallSite IlrpIOOk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = I1k0Irt[n2 ^ 0xEFC90FCC];
        int n10 = n9 >>> 16;
        String string2 = mu.IIIsO(OlIsq.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0xEFC90FCC);
        n9 = I1k0Irt[n3 ^ 0xEFC90FCC];
        int n11 = n9 >>> 16;
        String string3 = mu.IIIsO(OlIsq.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0xEFC90FCC);
        n9 = I1k0Irt[n4 ^ 0xEFC90FCC];
        int n12 = n9 >>> 16;
        String string4 = mu.IIIsO(OlIsq.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0xEFC90FCC);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x822514AC) + -178;
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
