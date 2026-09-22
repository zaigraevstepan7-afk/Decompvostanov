/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

public class kW {
    private static short[] y;
    private static boolean[] L;
    public Object[] N;
    private static /* synthetic */ String lOr0k;
    private static /* synthetic */ int[] Ill0I;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(n ^ 0x8F6EBD8, 5), 23), 27) ^ 0xD5CCF74F;
    }

    private static void L() {
        L = new boolean[]{true, true, false, false};
    }

    public kW() {
        kW.lOknIn("yixx", 1543302432, 1212094008, 1212094004, 1212094005, 1543302432, 1543302432, (kW)this);
    }

    static {
        kW.ntfClinit();
    }

    private void i() {
        this.N = new Object[L[(1 | -1) >>> 31]];
        this.N[0] = 0;
    }

    private static void u() {
        y = new short[]{0, 0, 0};
    }

    public int y() {
        return (int)kW.lOknIn("dljhiv", 1543302432, 1212094013, 1212094014, 1212094015, 1543302432, 1543302432, (Integer)((Object)kW.lOknIn("unhzzyek", 1543302434, 1212094008, 1212094009, 1212094010, 1543302434, 1543302434, (kW)this)[kW.lOknIn("uhdt", 1543302436, 1212094008, 1212094011, 1212094012, 1543302436, 1543302436)[2]]));
    }

    private static /* synthetic */ int y(int n) {
        return (Integer.rotateRight(Integer.rotateLeft(n, 5), 10) ^ 0x16BBC6CA) + 1;
    }

    public void N() {
        kW kW2 = this;
        CallSite callSite = kW.lOknIn("uhdt", 1543302446, 1212094013, 1212094002, 1212094003, 1543302446, 1543302446, (int)(kW.lOknIn("yixx", 1543302432, 1212094013, 1212094014, 1212094015, 1543302432, 1543302432, (Integer)((Object)kW.lOknIn("vxwaikt", 1543302434, 1212094008, 1212094009, 1212094010, 1543302434, 1543302434, (kW)kW2)[kW.lOknIn("dxig", 1543302436, 1212094008, 1212094011, 1212094012, 1543302436, 1543302436)[0]])) + kW.lOknIn("xibae", 1543302436, 1212094008, 1212094000, 1212094001, 1543302436, 1543302436)[0]));
        kW.lOknIn("dljhiv", 1543302434, 1212094008, 1212094009, 1212094010, 1543302434, 1543302434, (kW)kW2)[kW.lOknIn("dxig", 1543302436, 1212094008, 1212094011, 1212094012, 1543302436, 1543302436)[1]] = callSite;
    }

    private static /* synthetic */ int N(int n) {
        return (Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(-n, 3) ^ 0x48BE308, 12), 3) ^ 0xD569BD33) + 1;
    }

    private static /* synthetic */ void ntfClinit() {
        lOr0k = "i(\u0092\u00a3\u00e1\u0095\u00f9\u0081\u00eaa\u00eaV4MO\u00c1\u001f\u0004\u00fb\u00b9\u00e0\u00f8\u00a5\u00ad\u00a4H\u00f2\f\u00cd\u00a9\u00afX\u00e5x$}\u00a9\u00b5L\u00af[#B\u0007\u00827\u0004\u00e8\u00f3\u00ceXeC\u00da\u008c\u0085W\u00d2r/\u0003\u000b\u00fa{\u00a6\u00b7{\u00e1[7I\u00ec5\u00e1\u008a\u0086\u009bY\u0092\u0084\u00a9L\u00f6Vm@\u0001\u00c3\u0019E\u00d3\u00f4\u00c3o\u00aa\u00bc\u00f8";
        Ill0I = new int[]{3473418, 3407873, 5111827, 5046273, 4915202, 2293777, 4128776, 4718595, 4653057, 65538, 1835015, 393238, 1, 196611};
        kW.u();
        kW.L();
    }

    private static /* synthetic */ void IIjs0sjjp(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[14];
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
        lOr0k = stringBuilder.toString();
        Ill0I = nArray;
    }

    private static /* synthetic */ String l1Inmr(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{9, 122, 27, 41, -87, 30, -64, -76, -44, 4, 122, -40, -104, -126, -78, 20};
        byte[] byArray3 = new byte[]{12, -19, -63, 40, 91, -52, 19, 21, 29, -37, -83, -49, -53, 62, 108, 108};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite lljqtpq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = Ill0I[n2 ^ 0x483F1638];
        int n9 = n8 >>> 16;
        String string2 = kW.l1Inmr(lOr0k.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x483F1638);
        n8 = Ill0I[n3 ^ 0x483F1638];
        int n10 = n8 >>> 16;
        String string3 = kW.l1Inmr(lOr0k.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x483F1638);
        n8 = Ill0I[n4 ^ 0x483F1638];
        int n11 = n8 >>> 16;
        String string4 = kW.l1Inmr(lOr0k.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x483F1638);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x5BFCED96) + -178;
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

    private static /* synthetic */ CallSite lImlkkljm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = Ill0I[n2 ^ 0x483F1638];
        int n9 = n8 >>> 16;
        String string2 = kW.l1Inmr(lOr0k.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x483F1638);
        n8 = Ill0I[n3 ^ 0x483F1638];
        int n10 = n8 >>> 16;
        String string3 = kW.l1Inmr(lOr0k.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x483F1638);
        n8 = Ill0I[n4 ^ 0x483F1638];
        int n11 = n8 >>> 16;
        String string4 = kW.l1Inmr(lOr0k.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x483F1638);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x5BFCED96) + -178;
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

    private static /* synthetic */ CallSite lOknIn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = Ill0I[n2 ^ 0x483F1638];
        int n8 = n7 >>> 16;
        String string2 = kW.l1Inmr(lOr0k.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x483F1638);
        n7 = Ill0I[n3 ^ 0x483F1638];
        int n9 = n7 >>> 16;
        String string3 = kW.l1Inmr(lOr0k.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x483F1638);
        n7 = Ill0I[n4 ^ 0x483F1638];
        int n10 = n7 >>> 16;
        String string4 = kW.l1Inmr(lOr0k.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x483F1638);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x5BFCED96) + -178;
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
