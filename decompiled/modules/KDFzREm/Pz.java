/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.Mj;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="Timer", y=UR.MOVEMENT, N=Uz.BASE)
public class Pz
extends UM {
    private static short[] u;
    public Object[] L;
    private static boolean[] i;
    private static float[] R;
    private static String[] M;
    private static /* synthetic */ String I1qqt;
    private static /* synthetic */ int[] OOrpiIlki;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n, 30), 22) ^ 0x6B198301, 18) ^ 0xE457541D, 14);
    }

    private static void P() {
        M = new String[]{"timer"};
    }

    private static void T() {
        R = new float[]{1.0f, 0.1f, 10.0f, 0.05f};
    }

    public Pz() {
        Pz.lllOp("chbjc", -1488854201, -1573911068, -1573911067, -1573911066, -1488854201, (Pz)this);
        CallSite callSite = Pz.lllOp("jcwqrx", -1488854199, -1573911069, -1573911060, -1573911059, -1488854199, (lY)this, (String)((Object)Pz.lllOp("tnlurav", -1488854205, -1573911068, -1573911065, -1573911072, -1488854205)[0]), (float)Pz.lllOp("cjno", -1488854205, -1573911068, -1573911071, -1573911070, -1488854205)[0], (float)Pz.lllOp("vlcgzwzg", -1488854205, -1573911068, -1573911071, -1573911070, -1488854205)[1], (float)Pz.lllOp("vlcgzwzg", -1488854205, -1573911068, -1573911071, -1573911070, -1488854205)[2], (float)Pz.lllOp("hdnn", -1488854205, -1573911068, -1573911071, -1573911070, -1488854205)[3]);
        Pz.lllOp("cjno", -1488854203, -1573911068, -1573911058, -1573911057, -1488854203, (Pz)this)[Pz.lllOp("chbjc", -1488854205, -1573911068, -1573911064, -1573911063, -1488854205)[0]] = callSite;
    }

    static {
        Pz.ntfClinit();
    }

    private static void b() {
        i = new boolean[]{true};
    }

    private void s() {
        if (Pz.lllOp("jcwqrx", -1488854203, -1573911068, -1573911058, -1573911057, -1488854203, (Pz)this) == null) {
            Pz.lllOp("oaty", -1488854204, -1573911068, -1573911058, -1573911057, -1488854204, (Pz)this, (Object[])new Object[Pz.lllOp("tzga", -1488854205, -1573911068, -1573911062, -1573911061, -1488854205)[0]]);
            CallSite callSite = Pz.lllOp("tnlurav", -1488854203, -1573911068, -1573911058, -1573911057, -1488854203, (Pz)this);
        }
    }

    private static void m() {
        u = new short[]{0, 0};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateLeft(-Integer.rotateLeft(n, 11), 1), 11) ^ 0x20951468;
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-37, 127, -60, -107, 21, 40, 53, -20, -128, -64, 29, 65, -31, 24, -51, -21};
        int n = 0;
        int n2 = 88;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 135;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(-Integer.rotateRight(Integer.rotateRight(n ^ 0x2A8611A9, 17), 25) ^ 0x41F02C6C, 1);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 6), 1), 17) ^ 0x24189C72;
    }

    @uF
    public void N(Mj mj) {
        Pz.lllOp("zopg", -1488854201, -1573911068, -1573911067, -1573911066, -1488854201, (Pz)this);
        Pz.lllOp("tnlurav", -1488854201, -1573911055, -1573911060, -1573911054, -1488854201, (Mj)mj, (float)Pz.lllOp("chbjc", -1488854201, -1573911050, -1573911049, -1573911056, -1488854201, (Float)((Float)((Object)Pz.lllOp("tzga", -1488854201, -1573911052, -1573911062, -1573911051, -1488854201, (lQ)((lQ)((Object)Pz.lllOp("chbjc", -1488854203, -1573911068, -1573911058, -1573911057, -1488854203, (Pz)this)[Pz.lllOp("chbjc", -1488854205, -1573911068, -1573911064, -1573911063, -1488854205)[1]])))))));
    }

    private static /* synthetic */ void ntfClinit() {
        I1qqt = "\u00fc\u00cd<4\u00e6\u000b\u00ea\u008a>\u00c1\u0088&\u00ef\u009cm\u0001+\u00ce\u00af\f\u00ed\u00bb\u000f\u00f7\u00d6\u0015\u0091HL\u00d6+_\u0006\u00aa\u0087+\u00f9\u008ee\u00c9\u008d\u000b\u00a1\u001dg\u0087\fo!\u00c3\u00c2\u0006\u00dc\u00ad\f\u00e0\u00ab<\u00a5\\l\u00edq%=\u0084+\u00ef\u008a<\u00f6\u00c6&\u00fb\u0097\u001e\u00e7<b\u00d6p\u00bc\u0013\u00be\u00de#\u00c3\u0091\u0018\u00d2\u0084e\u00ca\u0083\u00de#\u00c3\u0091\u0018\u00d2\u0084e\u00f6\u00a8\u00cc\u00b6!\u00d5#\u00c3\u0091\u0018\u00d2\u0084e\u00d7\u0093\u00e2N\u00c3\u0091+\u00ef\u008a<\u00f6\u00c6&\u00fb\u0097\u001e\u00e7 t\u00ce\u00df\u00a4\u0000\u00be(N\u00d3\u00ff\u00c5!\u00ac\u00bdCj\u0006\u00f3\u008ae\u00fb\u0088$\u00fd\u00d6?\u00a4\u001ca\u00c8\u00b5#\u00c3\u0091\u0018\u00d2\u0084e\u00f6\u0092\u00cd\u0096N\u00c9\u0081+\u00e1\u0088e\u00f6\u0098\u0017\u00af\\O\u00de \u00db\u0004\u00f1\u00d0";
        OOrpiIlki = new int[]{5505034, 11337729, 9109507, 65537, 7864339, 6815745, 6881282, 0xA3000A, 917505, 983088, 9306113, 4259859, 9633793, 131074, 1, 4128770, 6160394, 11403284, 9699343, 262154, 7667715, 7012362, 9371652};
        Pz.m();
        Pz.T();
        Pz.b();
        Pz.P();
    }

    private static /* synthetic */ CallSite lllOp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = OOrpiIlki[n2 ^ 0xA23005E4];
        int n7 = n6 >>> 16;
        String string2 = Pz.Il0jmjr(I1qqt.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xA23005E4);
        n6 = OOrpiIlki[n3 ^ 0xA23005E4];
        int n8 = n6 >>> 16;
        String string3 = Pz.Il0jmjr(I1qqt.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xA23005E4);
        n6 = OOrpiIlki[n4 ^ 0xA23005E4];
        int n9 = n6 >>> 16;
        String string4 = Pz.Il0jmjr(I1qqt.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xA23005E4);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA741E3F1) + -178;
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

    private static /* synthetic */ void IlIsil(String[] stringArray) {
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
        I1qqt = stringBuilder.toString();
        OOrpiIlki = nArray;
    }

    private static /* synthetic */ CallSite IIl0jktkt(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = OOrpiIlki[n2 ^ 0xA23005E4];
        int n10 = n9 >>> 16;
        String string2 = Pz.Il0jmjr(I1qqt.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0xA23005E4);
        n9 = OOrpiIlki[n3 ^ 0xA23005E4];
        int n11 = n9 >>> 16;
        String string3 = Pz.Il0jmjr(I1qqt.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0xA23005E4);
        n9 = OOrpiIlki[n4 ^ 0xA23005E4];
        int n12 = n9 >>> 16;
        String string4 = Pz.Il0jmjr(I1qqt.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0xA23005E4);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA741E3F1) + -178;
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

    private static /* synthetic */ CallSite IIrIsm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = OOrpiIlki[n2 ^ 0xA23005E4];
        int n7 = n6 >>> 16;
        String string2 = Pz.Il0jmjr(I1qqt.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xA23005E4);
        n6 = OOrpiIlki[n3 ^ 0xA23005E4];
        int n8 = n6 >>> 16;
        String string3 = Pz.Il0jmjr(I1qqt.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xA23005E4);
        n6 = OOrpiIlki[n4 ^ 0xA23005E4];
        int n9 = n6 >>> 16;
        String string4 = Pz.Il0jmjr(I1qqt.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xA23005E4);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA741E3F1) + -178;
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

    private static /* synthetic */ String Il0jmjr(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{1, 102, 55, 127, -108, 40, 34, -34, -78, -97, -53, -1, -20, -65, -108, -127};
        byte[] byArray3 = new byte[]{-78, 63, -122, 9, 111, -36, -36, -107, -53, -58, 46, -57, -7, 68, 13, 127};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite oomilrqq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = OOrpiIlki[n2 ^ 0xA23005E4];
        int n9 = n8 >>> 16;
        String string2 = Pz.Il0jmjr(I1qqt.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xA23005E4);
        n8 = OOrpiIlki[n3 ^ 0xA23005E4];
        int n10 = n8 >>> 16;
        String string3 = Pz.Il0jmjr(I1qqt.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xA23005E4);
        n8 = OOrpiIlki[n4 ^ 0xA23005E4];
        int n11 = n8 >>> 16;
        String string4 = Pz.Il0jmjr(I1qqt.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xA23005E4);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA741E3F1) + -178;
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
