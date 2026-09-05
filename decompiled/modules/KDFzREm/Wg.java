/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.jA;
import KDFzREm.yM;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="IRC", y=UR.MISC, N=Uz.CLIENT)
public class Wg
extends UM {
    private static /* synthetic */ String Olimq;
    private static /* synthetic */ int[] llnrl;

    static {
        Wg.ntfClinit();
    }

    @Override
    public void y() {
        Wg.llOIs("ezxenim", 1011003244, -1781579007, -1781579008, -1781579005, 1011003244, (UM)this);
        Wg.llOIs("rjjvab", 1011003245, -1781579000, -1781579002, -1781578997, 1011003245, (jA)((Object)Wg.llOIs("hibkvpo", 1011003235, -1781579006, -1781579003, -1781579004, 1011003235)), (yM)((Object)Wg.llOIs("zpxff", 1011003235, -1781579001, -1781579002, -1781578999, 1011003235)));
    }

    private static /* synthetic */ void ntfClinit() {
        Olimq = "\u0092|\u00c8\u00d9n\u00f8L\u0090q\u00a1W\u0087\u00ff\u00c0\u00d4P\u00ecs\u00af\u001b\u00ba*1\u00d9\u00d8\u00d0%\u00fd\u00a5\u00d3_\u00eeO\u0087\f\u0092hg\u00fe\u00a2\u00c2\u00c5\u00c8\u00d9n\u00f8L\u0090q\u00ae_\u00c8\u00d9n\u00f8L\u0090q\u0082H\u00ac\u00c8\u00d9n\u00f8L\u0090q\u00bdD\u0082\u00b5\u00a5\u00d3_\u00eeO\u0087\f\u0092hg\u00ed\u00b2\u00c2(\u00a5\u00c9";
        llnrl = new int[]{3276810, 4587521, 0x550003, 0x290009, 720897, 1769486, 65546, 1, 4653070, 3932170, 786447};
    }

    private static /* synthetic */ CallSite llOIs(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = llnrl[n2 ^ 0x95CF4301];
        int n7 = n6 >>> 16;
        String string2 = Wg.Oltkt(Olimq.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x95CF4301);
        n6 = llnrl[n3 ^ 0x95CF4301];
        int n8 = n6 >>> 16;
        String string3 = Wg.Oltkt(Olimq.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x95CF4301);
        n6 = llnrl[n4 ^ 0x95CF4301];
        int n9 = n6 >>> 16;
        String string4 = Wg.Oltkt(Olimq.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x95CF4301);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x3C42AFDB) + -178;
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

    private static /* synthetic */ String Oltkt(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{100, -22, 112, -97, 83, -72, -103, -79, -77, -17, -7, -125, 96, 102, 23, -117};
        byte[] byArray3 = new byte[]{-94, -96, 93, 118, -90, 80, -118, 58, 8, -58, -113, 111, -61, 20, -30, -39};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void IIklls(String[] stringArray) {
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
        Olimq = stringBuilder.toString();
        llnrl = nArray;
    }

    private static /* synthetic */ CallSite lOtj0sj(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = llnrl[n2 ^ 0x95CF4301];
        int n9 = n8 >>> 16;
        String string2 = Wg.Oltkt(Olimq.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x95CF4301);
        n8 = llnrl[n3 ^ 0x95CF4301];
        int n10 = n8 >>> 16;
        String string3 = Wg.Oltkt(Olimq.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x95CF4301);
        n8 = llnrl[n4 ^ 0x95CF4301];
        int n11 = n8 >>> 16;
        String string4 = Wg.Oltkt(Olimq.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x95CF4301);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x3C42AFDB) + -178;
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
