/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2d
 *  org.joml.Vector2dc
 */
package KDFzREm;

import KDFzREm.UB;
import KDFzREm.bw;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import org.joml.Vector2d;
import org.joml.Vector2dc;

public class Na {
    private static byte[] y;
    private static short[] L;
    public Object[] N;
    private static boolean[] u;
    private static /* synthetic */ String IIi0Oki;
    private static /* synthetic */ int[] I1qIiOkms;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft((Integer.rotateRight(n ^ 0xFE77938E, 27) ^ 0x5359C78C) + 1 ^ 0x18C502C4, 3);
    }

    public boolean L() {
        return (boolean)Na.l1Imm0("qiireslf", 1169136179, -164124311, -164124312, -164124305, 1983573725, (Boolean)((Boolean)((Object)Na.l1Imm0("qiireslf", 1169136177, -164124306, -164124307, -164124308, -1743380743, (Na)this)[Na.l1Imm0("iamhxf", 1169136183, -164124306, -164124309, -164124310, 1531608116)[5]])));
    }

    private static void M() {
        u = new boolean[]{true, false, true, true, false, true, false};
    }

    public Na() {
        Na.l1Imm0("baiz", 1169136179, -164124306, -164124296, -164124299, 1169136179, (Na)this);
        Vector2d vector2d = new Vector2d();
        Na.l1Imm0("iamhxf", 1169136177, -164124306, -164124307, -164124308, 1169136177, (Na)this)[Na.l1Imm0("ihmnns", 1169136183, -164124306, -164124309, -164124310, 1169136183)[0]] = vector2d;
    }

    static {
        Na.ntfClinit();
    }

    private void B() {
        if (Na.l1Imm0("iamhxf", 1169136177, -164124306, -164124307, -164124308, 1169136177, (Na)this) == null) {
            Na.l1Imm0("siglfg", 1169136176, -164124306, -164124307, -164124308, 1169136176, (Na)this, (Object[])new Object[Na.l1Imm0("baiz", 1169136183, -164124306, -164124294, -164124295, 1169136183)[0]]);
            CallSite callSite = Na.l1Imm0("iamhxf", 1169136177, -164124306, -164124307, -164124308, 1169136177, (Na)this);
            callSite[Na.l1Imm0("cyxe", 1169136183, -164124306, -164124314, -164124297, 1169136183)[5]] = Na.l1Imm0("yhvspgo", 1169136189, -164124311, -164124302, -164124303, 1169136189, (boolean)Na.l1Imm0("tjaqx", 1169136183, -164124306, -164124314, -164124297, 1169136183)[6]);
        }
    }

    private static void i() {
        y = new byte[]{2};
    }

    public Vector2dc u() {
        return (Vector2d)Na.l1Imm0("lebmue", 1169136177, -164124306, -164124307, -164124308, -897723886, (Na)this)[Na.l1Imm0("ihmnns", 1169136183, -164124306, -164124309, -164124310, 1039219753)[4]];
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateLeft(Integer.rotateRight(-Integer.rotateRight(Integer.rotateLeft(n ^ 0xC4C3E483, 28), 26), 12), 15);
    }

    public void y() {
        Na.l1Imm0("baiz", 1169136179, -164124319, -164124298, -164124299, 1983573725, (bw)((Object)Na.l1Imm0("ihmnns", 1169136179, -164124316, -164124317, -164124318, 1983573725, (UB)((Object)Na.l1Imm0("baiz", 1169136189, -164124313, -164124314, -164124315, 1983573725)))));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(-Integer.rotateRight(n, 20), 16), 31), 19) ^ 0x93A4EE9F, 15);
    }

    public void N(double d, double d2) {
        CallSite callSite = Na.l1Imm0("iamhxf", 1169136179, -164124316, -164124317, -164124318, 1983573725, (UB)((Object)Na.l1Imm0("yhvspgo", 1169136189, -164124313, -164124314, -164124315, 1983573725)));
        Na.l1Imm0("qiireslf", 1169136179, -164124319, -164124307, -164124300, 1983573725, (bw)((Object)callSite), (boolean)Na.l1Imm0("tjaqx", 1169136183, -164124306, -164124314, -164124297, 1239903686)[0]);
        Na.l1Imm0("tjaqx", 1169136179, -164124319, -164124307, -164124301, 1983573725, (bw)((Object)callSite), (double)d, (double)d2);
    }

    public void N(Double d, Double d2) {
        block3: {
            block2: {
                if (d == null) break block2;
                if (d2 != null) break block3;
            }
            CallSite callSite = Na.l1Imm0("atxtzlt", 1169136189, -164124311, -164124302, -164124303, 1983573725, (boolean)Na.l1Imm0("baiz", 1169136183, -164124306, -164124314, -164124297, -31338931)[1]);
            Na.l1Imm0("cyxe", 1169136177, -164124306, -164124307, -164124308, 529871798, (Na)this)[Na.l1Imm0("zigtwa", 1169136183, -164124306, -164124309, -164124310, 928382071)[1]] = callSite;
            return;
        }
        Na.l1Imm0("baiz", 1169136179, -164124291, -164124292, -164124293, 1983573725, (Vector2d)((Vector2d)Na.l1Imm0("yhvspgo", 1169136177, -164124306, -164124307, -164124308, -1463480324, (Na)this)[Na.l1Imm0("ihmnns", 1169136183, -164124306, -164124309, -164124310, -71369775)[2]]), (double)Na.l1Imm0("efucx", 1169136179, -164124304, -164124289, -164124290, 1983573725, (Double)d), (double)Na.l1Imm0("baiz", 1169136179, -164124304, -164124289, -164124290, 1983573725, (Double)d2));
        CallSite callSite = Na.l1Imm0("yhvspgo", 1169136189, -164124311, -164124302, -164124303, 1983573725, (boolean)Na.l1Imm0("atxtzlt", 1169136183, -164124306, -164124314, -164124297, -465866288)[2]);
        Na.l1Imm0("yhvspgo", 1169136177, -164124306, -164124307, -164124308, 550432253, (Na)this)[Na.l1Imm0("yhvspgo", 1169136183, -164124306, -164124309, -164124310, -1360173891)[3]] = callSite;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean N() {
        CallSite callSite;
        if (Na.l1Imm0("baiz", 1169136179, -164124319, -164124320, -164124305, 1983573725, (bw)((Object)Na.l1Imm0("efucx", 1169136179, -164124316, -164124317, -164124318, 1983573725, (UB)((Object)Na.l1Imm0("iamhxf", 1169136189, -164124313, -164124314, -164124315, 1983573725))))) != false) {
            if (Na.l1Imm0("cyxe", 1169136179, -164124311, -164124312, -164124305, 1983573725, (Boolean)((Boolean)((Object)Na.l1Imm0("lebmue", 1169136177, -164124306, -164124307, -164124308, 1913071898, (Na)this)[Na.l1Imm0("cyxe", 1169136183, -164124306, -164124309, -164124310, -1890580721)[6]]))) != false) {
                callSite = Na.l1Imm0("lebmue", 1169136183, -164124306, -164124314, -164124297, 1528769206)[3];
                return (boolean)callSite;
            }
        }
        callSite = Na.l1Imm0("cyxe", 1169136183, -164124306, -164124314, -164124297, -1232731678)[4];
        return (boolean)callSite;
    }

    private static void R() {
        L = new short[]{0, 1, 0, 1, 0, 1, 1};
    }

    private static /* synthetic */ void ntfClinit() {
        IIi0Oki = "2\u00c2l\u00a0\u001dg\u0004\u0017\u00a8XE\u009aB\u0095j\u009a\u00f7\u00d3xzT\u00cd\u0015\u0005\u0016:\u00cd\u0015\u0005\f>\u00a0m/\u009d\u0002\u00adD\u008en\u00e4q\u00fd>^r5\u00e9l\u00a0\u0007m\u00e8'Mo=\u00b3dg\u00d8)\u00af]\u00c3T\u0010\u008b\u00cd\u0017V\u0012\u0014\u00bf%N\u0096\u00d3\u00c3\u00e6>@%0\u00bc\\a\u009b\u0018\u00a5~\u00a0\u000bD\u00ec%F\u0094\u00cd\u0017V\u0012\u0014\u00bf%U\u00b5\u0001\u00d3\u00f1\u00dal\u00c5;M60\u00fdfa\u0099\n\u00efg\u00c3R\u00c8T\u00fdj\u00e3\u0011\u00cd\u0017V\u0012\u0014\u00bf%yNRo\u00fb6\u0003*>\u00bff/\u00a1\b\u00a3\\\u00ceJ\u009fd\u0005\u00e8'Mo=\u00b3dg\u00d8/\u00afG\u00cd]\u00fc\u0001K\u00e8=Y%\u001e\u00b4\u0015\u00a0\u001dg\u0004\u0017\u00a8XE\u009aB\u00a2_\u009a2\u00e6$N,4\u0084kl\u0082\b\u00e8\u00a0\u0015^\u0007\u00d3x`*0\u00a4k/\u009b\f\u00aeO\u008ez\u001a@\u00e54M.j^d\u00cd\u0017V\u0012\u0014\u00bf%b\u00804\u00cb";
        I1qIiOkms = new int[]{8585225, 13828097, 131086, 6357002, 2, 11993102, 15400970, 9240577, 5898243, 4390922, 9175041, 7274515, 15335425, 7143426, 10420241, 5111820, 7012354, 0x600001, 0x300003, 0x100004, 1310725, 0xB00007, 13893654, 0x330010, 12910603, 0xD00003, 9306129, 6094851, 1638423, 5046273, 16056322, 8519681};
        Na.R();
        Na.i();
        Na.M();
    }

    private static /* synthetic */ String llkjO(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{6, -39, 80, 45, 105, 1, 20, 59, 66, 49, 92, -58, 41, -89, 122, -84};
        byte[] byArray3 = new byte[]{-86, 89, 29, -38, 24, 81, 67, 18, 112, 88, -37, 85, -69, -125, 122, 86};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite IlkimmI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = I1qIiOkms[n2 ^ 0xF637A967];
        int n7 = n6 >>> 16;
        String string2 = Na.llkjO(IIi0Oki.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xF637A967);
        n6 = I1qIiOkms[n3 ^ 0xF637A967];
        int n8 = n6 >>> 16;
        String string3 = Na.llkjO(IIi0Oki.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xF637A967);
        n6 = I1qIiOkms[n4 ^ 0xF637A967];
        int n9 = n6 >>> 16;
        String string4 = Na.llkjO(IIi0Oki.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xF637A967);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x45AF9A85) + -178;
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

    private static /* synthetic */ void l1ktntj(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[32];
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
        IIi0Oki = stringBuilder.toString();
        I1qIiOkms = nArray;
    }

    private static /* synthetic */ CallSite l1Imm0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = I1qIiOkms[n2 ^ 0xF637A967];
        int n7 = n6 >>> 16;
        String string2 = Na.llkjO(IIi0Oki.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xF637A967);
        n6 = I1qIiOkms[n3 ^ 0xF637A967];
        int n8 = n6 >>> 16;
        String string3 = Na.llkjO(IIi0Oki.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xF637A967);
        n6 = I1qIiOkms[n4 ^ 0xF637A967];
        int n9 = n6 >>> 16;
        String string4 = Na.llkjO(IIi0Oki.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xF637A967);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x45AF9A85) + -178;
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
