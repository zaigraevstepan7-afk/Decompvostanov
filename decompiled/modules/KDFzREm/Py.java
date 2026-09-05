/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.MP;
import KDFzREm.Ms;
import KDFzREm.PL;
import KDFzREm.Pu;
import KDFzREm.Rs;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.lY;
import KDFzREm.lv;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="NoPush", y=UR.MOVEMENT, N=Uz.TOOLS)
public class Py
extends UM {
    public Object[] L;
    private static byte[] u;
    private static String[] i;
    private static short[] R;
    private static short[] M;
    private static boolean[] B;
    private static /* synthetic */ String I1OIt;
    private static /* synthetic */ int[] ootklri;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(-n, 2), 11), 26), 26), 16);
    }

    private static void P() {
        i = new String[]{"entity-push", "block-push", "fishing-rod", "apply-to"};
    }

    private static void T() {
        R = new short[]{0, 1, 2, 0, 1};
        M = new short[]{2, 3, 0, 1, 2};
    }

    public Py() {
        Py.IlIrrqltm("cblb", -1263985971, 2002828859, 2002828858, 2002828857, -1263985971, -1263985971, -1263985971, (Py)this);
        Pu pu = new Pu((String)((Object)Py.IlIrrqltm("cblb", -1263985975, 2002828859, 2002828849, 2002828848, -1263985975, -1263985975, -1263985975)[0]), (boolean)Py.IlIrrqltm("yolwjaq", -1263985975, 2002828859, 2002828855, 2002828854, -1263985975, -1263985975, -1263985975)[0]);
        Py.IlIrrqltm("txsqg", -1263985969, 2002828859, 2002828856, 2002828863, -1263985969, -1263985969, -1263985969, (Py)this)[Py.IlIrrqltm("wwiqkv", -1263985975, 2002828859, 2002828853, 2002828861, -1263985975, -1263985975, -1263985975)[0]] = pu;
        Pu pu2 = new Pu((String)((Object)Py.IlIrrqltm("txsqg", -1263985975, 2002828859, 2002828849, 2002828848, -1263985975, -1263985975, -1263985975)[1]), (boolean)Py.IlIrrqltm("cblb", -1263985975, 2002828859, 2002828855, 2002828854, -1263985975, -1263985975, -1263985975)[1]);
        Py.IlIrrqltm("kysa", -1263985969, 2002828859, 2002828856, 2002828863, -1263985969, -1263985969, -1263985969, (Py)this)[Py.IlIrrqltm("cblb", -1263985975, 2002828859, 2002828853, 2002828861, -1263985975, -1263985975, -1263985975)[1]] = pu2;
        PL pL = new PL((String)((Object)Py.IlIrrqltm("kysa", -1263985975, 2002828859, 2002828849, 2002828848, -1263985975, -1263985975, -1263985975)[2]), (boolean)Py.IlIrrqltm("wwiqkv", -1263985975, 2002828859, 2002828855, 2002828854, -1263985975, -1263985975, -1263985975)[2]);
        Py.IlIrrqltm("yolwjaq", -1263985969, 2002828859, 2002828856, 2002828863, -1263985969, -1263985969, -1263985969, (Py)this)[Py.IlIrrqltm("cblb", -1263985975, 2002828859, 2002828853, 2002828861, -1263985975, -1263985975, -1263985975)[2]] = pL;
        lv[] lvArray = new Pu[Py.IlIrrqltm("iuyloe", -1263985975, 2002828859, 2002828852, 2002828843, -1263985975, -1263985975, -1263985975)[0]];
        lvArray[Py.IlIrrqltm("etyotqnl", -1263985975, 2002828859, 2002828855, 2002828854, -1263985975, -1263985975, -1263985975)[3]] = (Pu)((Object)Py.IlIrrqltm("yolwjaq", -1263985969, 2002828859, 2002828856, 2002828863, -1263985969, -1263985969, -1263985969, (Py)this)[Py.IlIrrqltm("yolwjaq", -1263985975, 2002828859, 2002828853, 2002828861, -1263985975, -1263985975, -1263985975)[3]]);
        lvArray[Py.IlIrrqltm("iuyloe", -1263985975, 2002828859, 2002828855, 2002828854, -1263985975, -1263985975, -1263985975)[4]] = (Pu)((Object)Py.IlIrrqltm("kysa", -1263985969, 2002828859, 2002828856, 2002828863, -1263985969, -1263985969, -1263985969, (Py)this)[Py.IlIrrqltm("txsqg", -1263985975, 2002828859, 2002828853, 2002828861, -1263985975, -1263985975, -1263985975)[4]]);
        lvArray[Py.IlIrrqltm("cblb", -1263985975, 2002828859, 2002828852, 2002828843, -1263985975, -1263985975, -1263985975)[1]] = (PL)((Object)Py.IlIrrqltm("iuyloe", -1263985969, 2002828859, 2002828856, 2002828863, -1263985969, -1263985969, -1263985969, (Py)this)[Py.IlIrrqltm("kysa", -1263985975, 2002828859, 2002828862, 2002828861, -1263985975, -1263985975, -1263985975)[0]]);
        CallSite callSite = Py.IlIrrqltm("yolwjaq", -1263985981, 2002828842, 2002828851, 2002828841, -1263985981, -1263985981, -1263985981, (lY)this, (String)((Object)Py.IlIrrqltm("vuezh", -1263985975, 2002828859, 2002828849, 2002828848, -1263985975, -1263985975, -1263985975)[3]), (lv[])lvArray);
        Py.IlIrrqltm("iuyloe", -1263985969, 2002828859, 2002828856, 2002828863, -1263985969, -1263985969, -1263985969, (Py)this)[Py.IlIrrqltm("wwiqkv", -1263985975, 2002828859, 2002828862, 2002828861, -1263985975, -1263985975, -1263985975)[1]] = callSite;
    }

    static {
        Py.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-64, -110, 104, -127, 41, -12, -41, 5, -53, 16, -37, 86, 54, -95, -20, 85};
        int n = 0;
        int n2 = 133;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 179;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void b() {
        if (Py.IlIrrqltm("iuyloe", -1263985969, 2002828859, 2002828856, 2002828863, -1263985969, -1263985969, -1263985969, (Py)this) == null) {
            Py.IlIrrqltm("iuyloe", -1263985970, 2002828859, 2002828856, 2002828863, -1263985970, -1263985970, -1263985970, (Py)this, (Object[])new Object[Py.IlIrrqltm("yolwjaq", -1263985975, 2002828859, 2002828852, 2002828843, -1263985975, -1263985975, -1263985975)[2]]);
            CallSite callSite = Py.IlIrrqltm("etyotqnl", -1263985969, 2002828859, 2002828856, 2002828863, -1263985969, -1263985969, -1263985969, (Py)this);
        }
    }

    private static void s() {
        B = new boolean[]{true, true, true, false, true};
    }

    private static void m() {
        u = new byte[]{3, 2, 4};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(n, 15), 27) ^ 0x49FC42B8, 2) ^ 0x1040E601, 23), 7);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{8, -69, 123, -100, 19, -112, 111, 71, -118, 108, 82, 64, -78, -123, 86, 89};
        int n = 0;
        int n2 = 101;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 241;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(-n, 24), 24) ^ 0x391C05DE, 2) ^ 0xF99F9617, 22);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-55, 65, -96, -38, 84, -58, -73, -91, 25, 66, 88, -32, -64, -65, 37, -57};
        int n = 0;
        int n2 = 248;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 95;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @uF
    public void N(MP mP) {
        Py.IlIrrqltm("cblb", -1263985971, 2002828859, 2002828858, 2002828857, 1045634017, 745695470, -1488037799, (Py)this);
        Py.IlIrrqltm("txsqg", -1263985971, 2002828860, 2002828851, 2002828850, 1045634017, 745695470, -1488037799, (Pu)((Pu)((Object)Py.IlIrrqltm("wwiqkv", -1263985969, 2002828859, 2002828856, 2002828863, 867061909, 802729404, -1956115574, (Py)this)[Py.IlIrrqltm("yolwjaq", -1263985975, 2002828859, 2002828862, 2002828861, 53953402, -170039905, -992608467)[3]])), (Object)mP);
    }

    @uF
    public void N(Ms ms) {
        Py.IlIrrqltm("txsqg", -1263985971, 2002828859, 2002828858, 2002828857, 1045634017, 745695470, -1488037799, (Py)this);
        Py.IlIrrqltm("iuyloe", -1263985971, 2002828860, 2002828851, 2002828850, 1045634017, 745695470, -1488037799, (Pu)((Pu)((Object)Py.IlIrrqltm("kysa", -1263985969, 2002828859, 2002828856, 2002828863, 1307370840, 1795435014, 866902411, (Py)this)[Py.IlIrrqltm("iuyloe", -1263985975, 2002828859, 2002828862, 2002828861, 1711027874, 1448878525, -1811083311)[2]])), (Object)ms);
    }

    @uF
    public void N(Rs rs) {
        Py.IlIrrqltm("vuezh", -1263985971, 2002828859, 2002828858, 2002828857, 1045634017, 745695470, -1488037799, (Py)this);
        Py.IlIrrqltm("kysa", -1263985971, 2002828840, 2002828851, 2002828850, 1045634017, 745695470, -1488037799, (PL)((PL)((Object)Py.IlIrrqltm("vuezh", -1263985969, 2002828859, 2002828856, 2002828863, 1460776902, 539684132, 1092749689, (Py)this)[Py.IlIrrqltm("etyotqnl", -1263985975, 2002828859, 2002828862, 2002828861, -82583200, -1033947447, -596351735)[4]])), (Object)rs);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 23), 6), 27), 18) ^ 0xAFE16302;
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{103, 18, -125, -23, 117, -93, 31, 121, 117, 29, 115, -102, 21, 17, 95, -76};
        int n = 0;
        int n2 = 99;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 85;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        I1OIt = "\u00b8vg\u00c4`\u00ed$6a\r\u0000\u0089\u008c\u00fe\u00b6\u00df\u00c9\u0016e\u00fcX\u00bc/h\u00c1?\u0012EOC\u0084\u0089\u00c0``\u00cc\u0001\u0006zp)\u0085\u00cd\u00f5\u00c0\u00ab\u00e7\u0016?>M\u00a8)!nEC\u00bb\u0096\u00eb\u00f0\u00fe\u00ccG\u0005\u0004g\u00c3\u0003:Rg\u0001\u00c7\u008e\u00ef\u00a2\u00b9\u00e77\u001a\u000eV\u00d5\u0000-/N\u0006\u00d3]\u007f\u008a-=`\u00ed$6a\r\u0000\u0089\u008c\u00fe\u00b6\u00df\u00c9\u0016\u009cvX\u00bcl\u0016`\u0005\u00d1}\u0013h\u00c1?\u0012EOC\u00b8\u0097\u0006\u00efh\u00c1?\u0012EOC\u00b8\u009b\u00c7h\u00c1?\u0012EOC\u00b8\u00ae\u009a\u00ffn[`\u00ed$6a\r\u0000\u0089\u008c\u00fe\u00b6\u00c3\u00df\u000e\u00f9nK\u00bc\u00ef";
        ootklri = new int[]{8519690, 0x810001, 0x730003, 0x200001, 196627, 131073, 5898242, 0x77000A, 11272193, 6160405, 6029313, 10027027, 6094849, 2, 9830401, 7733249, 9895938, 1441802, 2162745, 9175050};
        Py.T();
        Py.m();
        Py.s();
        Py.P();
    }

    private static /* synthetic */ CallSite OOOkrI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = ootklri[n2 ^ 0x7760BE3B];
        int n10 = n9 >>> 16;
        String string2 = Py.ooiOmI(I1OIt.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x7760BE3B);
        n9 = ootklri[n3 ^ 0x7760BE3B];
        int n11 = n9 >>> 16;
        String string3 = Py.ooiOmI(I1OIt.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x7760BE3B);
        n9 = ootklri[n4 ^ 0x7760BE3B];
        int n12 = n9 >>> 16;
        String string4 = Py.ooiOmI(I1OIt.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x7760BE3B);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xB4A91A7B) + -178;
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

    private static /* synthetic */ String ooiOmI(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-2, -8, -102, -111, -10, 29, -44, 90, 114, 54, -21, 97, -90, -74, 29, 104};
        byte[] byArray3 = new byte[]{91, 21, 113, -25, -89, 70, -2, 36, -6, 17, -114, 102, 65, 93, 123, -62};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void lImjnnnIp(String[] stringArray) {
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
        I1OIt = stringBuilder.toString();
        ootklri = nArray;
    }

    private static /* synthetic */ CallSite llmstpk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = ootklri[n2 ^ 0x7760BE3B];
        int n8 = n7 >>> 16;
        String string2 = Py.ooiOmI(I1OIt.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x7760BE3B);
        n7 = ootklri[n3 ^ 0x7760BE3B];
        int n9 = n7 >>> 16;
        String string3 = Py.ooiOmI(I1OIt.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x7760BE3B);
        n7 = ootklri[n4 ^ 0x7760BE3B];
        int n10 = n7 >>> 16;
        String string4 = Py.ooiOmI(I1OIt.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x7760BE3B);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xB4A91A7B) + -178;
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

    private static /* synthetic */ CallSite IlIrrqltm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = ootklri[n2 ^ 0x7760BE3B];
        int n9 = n8 >>> 16;
        String string2 = Py.ooiOmI(I1OIt.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x7760BE3B);
        n8 = ootklri[n3 ^ 0x7760BE3B];
        int n10 = n8 >>> 16;
        String string3 = Py.ooiOmI(I1OIt.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x7760BE3B);
        n8 = ootklri[n4 ^ 0x7760BE3B];
        int n11 = n8 >>> 16;
        String string4 = Py.ooiOmI(I1OIt.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x7760BE3B);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xB4A91A7B) + -178;
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
