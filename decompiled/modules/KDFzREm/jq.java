/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.td;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="Hotkeys", y=UR.VISUAL, N=Uz.INTERFACE)
public class jq
extends UM {
    private static /* synthetic */ String lInk00;
    private static /* synthetic */ int[] oo0rim;

    static {
        jq.ntfClinit();
    }

    @Override
    public boolean Z() {
        jq.I1lpilO("rhouqbvo", -1469264661, -1759400127, -1759400122, -1759400121, -1469264661, (td)((Object)jq.I1lpilO("mzxuq", -1469264667, -1759400126, -1759400125, -1759400128, -1469264667)));
        return (boolean)jq.I1lpilO("mldgxnkm", -1469264662, -1759400124, -1759400123, -1759400118, -1469264662, (UM)this);
    }

    @Override
    public boolean i() {
        jq.I1lpilO("domhwdq", -1469264661, -1759400127, -1759400122, -1759400121, -837755481, (td)((Object)jq.I1lpilO("jwiplkxc", -1469264667, -1759400126, -1759400125, -1759400128, -837755481)));
        return (boolean)jq.I1lpilO("rbpfnyos", -1469264662, -1759400124, -1759400125, -1759400118, -837755481, (UM)this);
    }

    private static /* synthetic */ void ntfClinit() {
        lInk00 = "\u00a3\u00faLFJ\u00de\u00bf=Q\u00c8w\u009e\u008eb\u0013\u0097Fw\\\u00dd\u00a8@m;\u0081\u0097Fw\\\u00dd\u00a8@A\u00e8K\u0097Fw\\\u00dd\u00a8@`\u00c1{\u0084\u008d\u00faZX\u00faV";
        oo0rim = new int[]{917513, 2949121, 14, 0x22000A, 2883585, 0x310003, 1572874, 0x170001, 3014659};
    }

    private static /* synthetic */ CallSite I1lpilO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = oo0rim[n2 ^ 0x9721AF42];
        int n7 = n6 >>> 16;
        String string2 = jq.OlsspmssO(lInk00.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x9721AF42);
        n6 = oo0rim[n3 ^ 0x9721AF42];
        int n8 = n6 >>> 16;
        String string3 = jq.OlsspmssO(lInk00.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x9721AF42);
        n6 = oo0rim[n4 ^ 0x9721AF42];
        int n9 = n6 >>> 16;
        String string4 = jq.OlsspmssO(lInk00.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x9721AF42);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA86CCC5D) + -178;
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

    private static /* synthetic */ String OlsspmssO(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-111, -55, -31, -3, 114, 33, 124, 91, 79, 52, -71, 26, -16, -92, -128, 87};
        byte[] byArray3 = new byte[]{35, 42, 64, 81, -102, 5, -40, 90, 73, 71, 24, -111, 69, -70, 69, -108};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void l1pqOnm(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[9];
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
        lInk00 = stringBuilder.toString();
        oo0rim = nArray;
    }

    private static /* synthetic */ CallSite Ilrrrkt(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = oo0rim[n2 ^ 0x9721AF42];
        int n8 = n7 >>> 16;
        String string2 = jq.OlsspmssO(lInk00.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x9721AF42);
        n7 = oo0rim[n3 ^ 0x9721AF42];
        int n9 = n7 >>> 16;
        String string3 = jq.OlsspmssO(lInk00.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x9721AF42);
        n7 = oo0rim[n4 ^ 0x9721AF42];
        int n10 = n7 >>> 16;
        String string4 = jq.OlsspmssO(lInk00.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x9721AF42);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA86CCC5D) + -178;
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
