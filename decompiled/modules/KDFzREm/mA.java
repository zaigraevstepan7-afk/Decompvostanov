/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.Rs;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.is;
import KDFzREm.lY;
import KDFzREm.lj;
import KDFzREm.lv;
import KDFzREm.mS;
import KDFzREm.mf;
import KDFzREm.mx;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.List;

@UZ(L="UseTracker", y=UR.MISC, N=Uz.TRACKERS)
public class mA
extends UM {
    private static String[] u;
    private static byte[] i;
    private static boolean[] R;
    public Object[] L;
    private static short[] M;
    private static /* synthetic */ String Ilkptqn;
    private static /* synthetic */ int[] IlspmpOn;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateRight(n, 21), 25), 4), 16);
    }

    private static void P() {
        R = new boolean[]{true, true, false, true};
    }

    private static void T() {
        u = new String[]{"totem-tracker", "food-tracker", "trackers"};
    }

    public mA() {
        mA.IItjI0klq("pljfm", -1640518836, -373590034, -373590037, -373590040, -1640518836, -1640518836, (mA)this);
        mS mS2 = new mS(this, (String)((Object)mA.IItjI0klq("svlrrlqd", -1640518840, -373590034, -373590039, -373590042, -1640518840, -1640518840)[0]), (boolean)mA.IItjI0klq("svlrrlqd", -1640518840, -373590034, -373590041, -373590044, -1640518840, -1640518840)[0]);
        mA.IItjI0klq("levc", -1640518834, -373590034, -373590033, -373590036, -1640518834, -1640518834, (mA)this)[mA.IItjI0klq("ueyxr", -1640518840, -373590034, -373590043, -373590046, -1640518840, -1640518840)[0]] = mS2;
        mf mf2 = new mf(this, (String)((Object)mA.IItjI0klq("ueyxr", -1640518840, -373590034, -373590039, -373590042, -1640518840, -1640518840)[1]), (boolean)mA.IItjI0klq("levc", -1640518840, -373590034, -373590041, -373590044, -1640518840, -1640518840)[1]);
        mA.IItjI0klq("vyhxcvl", -1640518834, -373590034, -373590033, -373590036, -1640518834, -1640518834, (mA)this)[mA.IItjI0klq("ncrt", -1640518840, -373590034, -373590043, -373590046, -1640518840, -1640518840)[1]] = mf2;
        lv[] lvArray = new mx[mA.IItjI0klq("ociqtsoz", -1640518840, -373590034, -373590035, -373590038, -1640518840, -1640518840)[0]];
        lvArray[mA.IItjI0klq("pgjycx", -1640518840, -373590034, -373590041, -373590044, -1640518840, -1640518840)[2]] = (mx)((Object)mA.IItjI0klq("levc", -1640518834, -373590034, -373590033, -373590036, -1640518834, -1640518834, (mA)this)[mA.IItjI0klq("ociqtsoz", -1640518840, -373590034, -373590043, -373590046, -1640518840, -1640518840)[2]]);
        lvArray[mA.IItjI0klq("qhpremkn", -1640518840, -373590034, -373590041, -373590044, -1640518840, -1640518840)[3]] = (mx)((Object)mA.IItjI0klq("aysyno", -1640518834, -373590034, -373590033, -373590036, -1640518834, -1640518834, (mA)this)[mA.IItjI0klq("ncrt", -1640518840, -373590034, -373590043, -373590046, -1640518840, -1640518840)[3]]);
        CallSite callSite = mA.IItjI0klq("ncrt", -1640518846, -373590045, -373590048, -373590047, -1640518846, -1640518846, (lY)this, (String)((Object)mA.IItjI0klq("qhpremkn", -1640518840, -373590034, -373590039, -373590042, -1640518840, -1640518840)[2]), (lv[])lvArray);
        mA.IItjI0klq("pgjycx", -1640518834, -373590034, -373590033, -373590036, -1640518834, -1640518834, (mA)this)[mA.IItjI0klq("pgjycx", -1640518840, -373590034, -373590043, -373590046, -1640518840, -1640518840)[4]] = callSite;
    }

    static {
        mA.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{110, 15, -5, 99, 8, -68, -94, -46, -43, 120, -24, -44, -15, -59, 107, -97};
        int n = 0;
        int n2 = 170;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 87;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        M = new short[]{0, 1, 0, 1, 2, 2, 2};
    }

    private static void s() {
        i = new byte[]{2, 3};
    }

    private void m() {
        if (mA.IItjI0klq("aysyno", -1640518834, -373590034, -373590033, -373590036, -1640518834, -1640518834, (mA)this) == null) {
            mA.IItjI0klq("aysyno", -1640518833, -373590034, -373590033, -373590036, -1640518833, -1640518833, (mA)this, (Object[])new Object[mA.IItjI0klq("svlrrlqd", -1640518840, -373590034, -373590035, -373590038, -1640518840, -1640518840)[1]]);
            CallSite callSite = mA.IItjI0klq("ueyxr", -1640518834, -373590034, -373590033, -373590036, -1640518834, -1640518834, (mA)this);
        }
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateRight((Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 29), 31), 16) ^ 0x157EE8BF) + 1, 2), 4);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{98, 69, 15, 12, 74, 84, -125, -78, 21, 45, 67, -82, 95, 90, -105, -127};
        int n = 0;
        int n2 = 160;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 249;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{40, 59, 121, -32, -86, 7, 3, -81, 43, 61, -89, 13, -96, 25, -36, -46};
        int n = 0;
        int n2 = 115;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 167;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(Integer.rotateRight(n ^ 0x54ED7E5D, 19), 27), 9), 4), 30);
    }

    @uF
    public void N(is is2) {
        mA.IItjI0klq("aysyno", -1640518836, -373590034, -373590037, -373590040, -954676189, -740952763, (mA)this);
        mA.IItjI0klq("banm", -1640518845, -373590020, -373590019, -373590022, -954676189, -740952763, (List)((List)((Object)mA.IItjI0klq("qhpremkn", -1640518836, -373590018, -373590035, -373590017, -954676189, -740952763, (lj)((lj)((Object)mA.IItjI0klq("eybdx", -1640518834, -373590034, -373590033, -373590036, -1258813177, -93842353, (mA)this)[mA.IItjI0klq("aysyno", -1640518840, -373590034, -373590043, -373590046, 1484873041, -1984219032)[6]]))))), mx2 -> mA.IItjI0klq("vyhxcvl", -1640518836, -373590021, -373590048, -373590024, -954676189, -740952763, (mx)mx2, (Object)is2));
    }

    @uF
    public void N(Rs rs) {
        mA.IItjI0klq("banm", -1640518836, -373590034, -373590037, -373590040, -954676189, -740952763, (mA)this);
        mA.IItjI0klq("ncrt", -1640518845, -373590020, -373590019, -373590022, -954676189, -740952763, (List)((List)((Object)mA.IItjI0klq("ncrt", -1640518836, -373590018, -373590035, -373590017, -954676189, -740952763, (lj)((lj)((Object)mA.IItjI0klq("ociqtsoz", -1640518834, -373590034, -373590033, -373590036, -301528499, -473936693, (mA)this)[mA.IItjI0klq("ociqtsoz", -1640518840, -373590034, -373590043, -373590046, 183541907, -1786865716)[5]]))))), mx2 -> mA.IItjI0klq("levc", -1640518836, -373590021, -373590048, -373590024, -954676189, -740952763, (mx)mx2, (Object)rs));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(n ^ 0x1A347E6B, 15), 26), 18);
    }

    private static /* synthetic */ void ntfClinit() {
        Ilkptqn = "\u00e6\u00c4\u00fd\u000f\u00c0\u0090\u001f\u00ff\u00fc\u0006\u0084>\u00b5xRL\u0096\u00cb\u00c4\u00983\u00e4\u00d8\"\u00c6}\u00b9n\u00fd*\u00ea\u0094\u00f0Z\u008f\u00a0b\u00ac\u00f8\u00db\u00983\u00e4\u00d8\"\u00c6}\u00b9n\u00fd*\u00f6\u0082\u00e8\u001b\u00ee\u00b3b>\u00875\u00b5/\u00e4\u00816\u009dx\u00b4/\u00d6l\u00d6\u0082n\u0090\u001f\u00ff\u00fc\u0006\u0084>\u00b4k|\u00bb+\u00c0\u00cf \u0081\u0001\u008e \u00af\u00fd\u0015\u00ef\u00cf5\u0088>\u00b4a\u00f4b\u008a\u00b9\u00f8j\u00e2\u00b7-\u00bes\u0004\u00983\u00e4\u00d8\"\u00c6}\u00b9n\u00fd*\u00ea\u0094\u00f0\u00ec<\u00a0b\u00e9?\u00983\u00e4\u00d8\"\u00c6d\u00aci\u00f6*\u00c3\u0083\u00f4\u0088c\u00bd6\u00eb\u0081\u0000\u0086\u007f\u00abu\u00f7`\u00d7\u00cd\u00b3\u00bdH.\u0098\u0012\u00c1\u00e89\u00bbT\u00b5/\u00f6\\\u009e\u00ba\u00f0[p\u00b5v\u00e9\u00cf-\u008e>\u008bt\u00e8l\u00cb\u0091\u00a1aJ\u009f\u001d\u00c3\u00d4\u0011\u00ac|\u00f7l\u00ec>\u008c\u00ba\u00d1~@\u00ae\u000b\u00c0\u00c3l\u0085{\u00e3\u00c5\u0090\u001f\u00ff\u00fc\u0006\u0084>\u00b5A\u00c5\u0090\u001f\u00ff\u00fc\u0006\u0084>\u00b4j";
        IlspmpOn = new int[]{14745610, 0x110001, 7536659, 7471105, 983042, 1, 65539, 8781825, 2555923, 917505, 5963778, 10944513, 3801090, 0x4A000A, 6094849, 11010105, 15400970, 6160404, 3932174, 5505031, 8847392, 262154, 1179669};
        mA.b();
        mA.s();
        mA.P();
        mA.T();
    }

    private static /* synthetic */ CallSite l1ssi0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = IlspmpOn[n2 ^ 0xE9BB77EE];
        int n9 = n8 >>> 16;
        String string2 = mA.IInspI(Ilkptqn.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xE9BB77EE);
        n8 = IlspmpOn[n3 ^ 0xE9BB77EE];
        int n10 = n8 >>> 16;
        String string3 = mA.IInspI(Ilkptqn.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xE9BB77EE);
        n8 = IlspmpOn[n4 ^ 0xE9BB77EE];
        int n11 = n8 >>> 16;
        String string4 = mA.IInspI(Ilkptqn.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xE9BB77EE);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x9E37ABFA) + -178;
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

    private static /* synthetic */ CallSite llqjtiim(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = IlspmpOn[n2 ^ 0xE9BB77EE];
        int n8 = n7 >>> 16;
        String string2 = mA.IInspI(Ilkptqn.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xE9BB77EE);
        n7 = IlspmpOn[n3 ^ 0xE9BB77EE];
        int n9 = n7 >>> 16;
        String string3 = mA.IInspI(Ilkptqn.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xE9BB77EE);
        n7 = IlspmpOn[n4 ^ 0xE9BB77EE];
        int n10 = n7 >>> 16;
        String string4 = mA.IInspI(Ilkptqn.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xE9BB77EE);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x9E37ABFA) + -178;
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

    private static /* synthetic */ String IInspI(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-103, -58, -97, 25, 18, -64, -100, -114, 30, -61, 5, 23, -68, 117, -125, -4};
        byte[] byArray3 = new byte[]{73, 83, 57, -13, 88, -71, 33, 123, 81, -24, 8, -47, -97, -55, 77, 120};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void OOqjOIpn(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[23];
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
        Ilkptqn = stringBuilder.toString();
        IlspmpOn = nArray;
    }

    private static /* synthetic */ CallSite IItjI0klq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = IlspmpOn[n2 ^ 0xE9BB77EE];
        int n8 = n7 >>> 16;
        String string2 = mA.IInspI(Ilkptqn.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xE9BB77EE);
        n7 = IlspmpOn[n3 ^ 0xE9BB77EE];
        int n9 = n7 >>> 16;
        String string3 = mA.IInspI(Ilkptqn.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xE9BB77EE);
        n7 = IlspmpOn[n4 ^ 0xE9BB77EE];
        int n10 = n7 >>> 16;
        String string4 = mA.IInspI(Ilkptqn.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xE9BB77EE);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x9E37ABFA) + -178;
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
