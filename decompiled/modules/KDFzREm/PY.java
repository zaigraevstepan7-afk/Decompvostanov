/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.Mv;
import KDFzREm.PO;
import KDFzREm.PQ;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.lv;
import KDFzREm.uF;
import KDFzREm.ue;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="NoWeb", y=UR.MOVEMENT, N=Uz.TOOLS)
public class PY
extends UM {
    private static short[] u;
    private static boolean[] i;
    private static byte[] R;
    public Object[] L;
    private static String[] M;
    private static /* synthetic */ String I1Oir0;
    private static /* synthetic */ int[] lOq0mjqO;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight((Integer.rotateLeft(n ^ 0xE3F7D339, 14) ^ 0xB07647DB) + 1, 6);
    }

    private static void P() {
        i = new boolean[]{true, false, false, true};
    }

    private void T() {
        if (PY.lOOkiO("ltpj", 715377027, 1588743678, 1588743677, 1588743674, 715377027, (PY)this) == null) {
            PY.lOOkiO("ndsuqu", 715377026, 1588743678, 1588743677, 1588743674, 715377026, (PY)this, (Object[])new Object[PY.lOOkiO("wkbexf", 715377029, 1588743678, 1588743662, 1588743663, 715377029)[1]]);
            CallSite callSite = PY.lOOkiO("fxhury", 715377027, 1588743678, 1588743677, 1588743674, 715377027, (PY)this);
        }
    }

    public PY() {
        PY.lOOkiO("obddnw", 715377025, 1588743678, 1588743679, 1588743676, 715377025, (PY)this);
        PQ pQ = new PQ(this, (String)((Object)PY.lOOkiO("fkesgi", 715377029, 1588743678, 1588743667, 1588743664, 715377029)[0]), (boolean)PY.lOOkiO("ltpj", 715377029, 1588743678, 1588743670, 1588743665, 715377029)[0]);
        PY.lOOkiO("fxhury", 715377027, 1588743678, 1588743677, 1588743674, 715377027, (PY)this)[PY.lOOkiO("vokvcqip", 715377029, 1588743678, 1588743675, 1588743672, 715377029)[0]] = pQ;
        PO pO = new PO(this, (String)((Object)PY.lOOkiO("fkesgi", 715377029, 1588743678, 1588743667, 1588743664, 715377029)[1]), (boolean)PY.lOOkiO("ndsuqu", 715377029, 1588743678, 1588743670, 1588743665, 715377029)[1]);
        PY.lOOkiO("lrto", 715377027, 1588743678, 1588743677, 1588743674, 715377027, (PY)this)[PY.lOOkiO("fxhury", 715377029, 1588743678, 1588743675, 1588743672, 715377029)[1]] = pO;
        lv[] lvArray = new ue[PY.lOOkiO("obddnw", 715377029, 1588743678, 1588743662, 1588743663, 715377029)[0]];
        lvArray[PY.lOOkiO("tqhcigh", 715377029, 1588743678, 1588743670, 1588743665, 715377029)[2]] = (PQ)((Object)PY.lOOkiO("obddnw", 715377027, 1588743678, 1588743677, 1588743674, 715377027, (PY)this)[PY.lOOkiO("fkesgi", 715377029, 1588743678, 1588743675, 1588743672, 715377029)[2]]);
        lvArray[PY.lOOkiO("vokvcqip", 715377029, 1588743678, 1588743670, 1588743665, 715377029)[3]] = (PO)((Object)PY.lOOkiO("ltpj", 715377027, 1588743678, 1588743677, 1588743674, 715377027, (PY)this)[PY.lOOkiO("ndsuqu", 715377029, 1588743678, 1588743675, 1588743672, 715377029)[3]]);
        CallSite callSite = PY.lOOkiO("obddnw", 715377039, 1588743660, 1588743661, 1588743658, 715377039, (lY)this, (String)((Object)PY.lOOkiO("uiprtym", 715377029, 1588743678, 1588743667, 1588743664, 715377029)[2]), (lv[])lvArray);
        PY.lOOkiO("uiprtym", 715377027, 1588743678, 1588743677, 1588743674, 715377027, (PY)this)[PY.lOOkiO("uiprtym", 715377029, 1588743678, 1588743675, 1588743672, 715377029)[4]] = callSite;
    }

    static {
        PY.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{102, 38, -125, 30, -37, 37, 71, -104, 90, -52, 65, 95, -18, -83, 19, -24};
        int n = 0;
        int n2 = 189;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 87;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        R = new byte[]{2, 3};
    }

    private static void s() {
        u = new short[]{0, 1, 0, 1, 2, 2};
    }

    private static void m() {
        M = new String[]{"default", "really-world", "mode"};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight((-Integer.rotateLeft(n, 13) ^ 0x95A2C5E9) + 1, 5), 18), 9);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{55, 11, 21, -31, 30, 79, 92, 123, 40, -24, -30, 37, 62, -100, -21, -27};
        int n = 0;
        int n2 = 207;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 131;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{5, 56, -22, 106, 26, -120, -75, -118, -63, -115, 122, 67, 7, 87, 102, -44};
        int n = 0;
        int n2 = 29;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 249;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 8), 2), 27) ^ 0xA76C723B, 12);
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 30), 19), 11), 16), 25), 25) ^ 0x7B73BEAD;
    }

    @uF
    public void N(Mv mv) {
        PY.lOOkiO("fxhury", 715377025, 1588743678, 1588743679, 1588743676, 1744103114, (PY)this);
        PY.lOOkiO("lrto", 715377025, 1588743668, 1588743669, 1588743666, 1744103114, (ue)((ue)((Object)PY.lOOkiO("tqhcigh", 715377025, 1588743673, 1588743670, 1588743671, 1744103114, (ld)((ld)((Object)PY.lOOkiO("tqhcigh", 715377027, 1588743678, 1588743677, 1588743674, -684912270, (PY)this)[PY.lOOkiO("fxhury", 715377029, 1588743678, 1588743675, 1588743672, -1703597872)[5]]))))), (Object)mv);
    }

    private static /* synthetic */ void ntfClinit() {
        I1Oir0 = "K\u009c\u0007\u007f\u008aw\u00af/\u009bJ(\u00f1\u0017\u008e\u00b8\u001a\u0094+d\u00aeS\u00edl\u0096O`\u00b3\u0002H\u00b4\u00ae\"\u00acz\u0098i\u0094\nA\u009eH\u0090E\u009a\u000ek\u00c5vf\u00b4\u00aa7\u00b9ni\u00b9\\\u00a5/\u00a4Uu\u00f5#M\u00e5\u0090\r\u0093\u0005C\u00a2`\u0087m\u00d8Mq\u00a7df\u0095\u008f\u0007\u00a2\u0013@\u00b5\u001d\u00aed\u00cc\u00c8\u0094+d\u00aeS\u00edl\u0096O`\u00b3\u0002H\u00b4\u00ae\u0083\u00acz,\u008e5\u00b77w=\u009a2\u00f6\u008bn\u009c\u0007\u007f\u008aw\u00af/\u00a7x\u0088\u009c\u0007\u007f\u008aw\u00af/\u009bE\u0090\u0082\u00a4\u00f1\ro\u00b9D\u00a3/\u009b@i\u00fbbe\u00bc\u00a1\u00e9\u00bb5>r\u009c\u0007\u007f\u008aw\u00af/\u0082D\u00e5\u0094+d\u00aeS\u00edl\u0096O`\u00b3\u001e^\u00ac\u00a2\u00d0\u00bfz";
        lOq0mjqO = new int[]{0x7A000A, 0x770001, 655363, 7536641, 983059, 917505, 7864322, 8650762, 851969, 9437204, 0xA4000A, 7471105, 6029333, 0x220001, 11403283, 9306114, 7602177, 7667714, 10, 0x710001, 2293817};
        PY.s();
        PY.b();
        PY.P();
        PY.m();
    }

    private static /* synthetic */ void I100jt0ss(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[21];
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
        I1Oir0 = stringBuilder.toString();
        lOq0mjqO = nArray;
    }

    private static /* synthetic */ CallSite Ilnmlpkr0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = lOq0mjqO[n2 ^ 0x5EB24DFE];
        int n8 = n7 >>> 16;
        String string2 = PY.lltqi(I1Oir0.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x5EB24DFE);
        n7 = lOq0mjqO[n3 ^ 0x5EB24DFE];
        int n9 = n7 >>> 16;
        String string3 = PY.lltqi(I1Oir0.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x5EB24DFE);
        n7 = lOq0mjqO[n4 ^ 0x5EB24DFE];
        int n10 = n7 >>> 16;
        String string4 = PY.lltqi(I1Oir0.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x5EB24DFE);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x2AA3C937) + -178;
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

    private static /* synthetic */ CallSite lOOkiO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = lOq0mjqO[n2 ^ 0x5EB24DFE];
        int n7 = n6 >>> 16;
        String string2 = PY.lltqi(I1Oir0.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x5EB24DFE);
        n6 = lOq0mjqO[n3 ^ 0x5EB24DFE];
        int n8 = n6 >>> 16;
        String string3 = PY.lltqi(I1Oir0.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x5EB24DFE);
        n6 = lOq0mjqO[n4 ^ 0x5EB24DFE];
        int n9 = n6 >>> 16;
        String string4 = PY.lltqi(I1Oir0.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x5EB24DFE);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x2AA3C937) + -178;
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

    private static /* synthetic */ String lltqi(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{105, 15, 40, -89, -41, -68, 76, -86, 80, -27, -119, 18, -60, -92, -114, -94};
        byte[] byArray3 = new byte[]{98, 59, 126, -32, -43, -7, 56, 72, -39, -125, -8, -57, -74, -67, -38, 17};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }
}
