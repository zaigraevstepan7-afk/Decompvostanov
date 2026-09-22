/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.PJ;
import KDFzREm.Ru;
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

@UZ(L="WallClimb", y=UR.MOVEMENT, N=Uz.BASE)
public class Po
extends UM {
    private static short[] u;
    private static boolean[] i;
    private static String[] R;
    public Object[] L;
    private static /* synthetic */ String Il0IlI;
    private static /* synthetic */ int[] II0ml0rIr;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(-Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(-n, 15), 17), 13) ^ 0x2E3A4155, 25);
    }

    private static void P() {
        R = new String[]{"mode", "block"};
    }

    private static void T() {
        u = new short[]{0, 0, 0};
    }

    public Po() {
        Po.Ilmrmijl("rsfvo", 902899543, -1125913804, -1125913803, -1125913802, 902899543, (Po)this);
        lv[] lvArray = new ue[Po.Ilmrmijl("rsfvo", 902899539, -1125913804, -1125913796, -1125913798, 902899539)[0]];
        lvArray[Po.Ilmrmijl("dtwva", 902899539, -1125913804, -1125913796, -1125913798, 902899539)[1]] = new PJ(this, (String)((Object)Po.Ilmrmijl("rsfvo", 902899539, -1125913804, -1125913797, -1125913820, 902899539)[1]), (boolean)Po.Ilmrmijl("rsfvo", 902899539, -1125913804, -1125913796, -1125913798, 902899539)[2]);
        CallSite callSite = Po.Ilmrmijl("gvpkq", 902899545, -1125913819, -1125913818, -1125913817, 902899545, (lY)this, (String)((Object)Po.Ilmrmijl("rsfvo", 902899539, -1125913804, -1125913797, -1125913820, 902899539)[0]), (lv[])lvArray);
        Po.Ilmrmijl("gjacvc", 902899541, -1125913804, -1125913801, -1125913808, 902899541, (Po)this)[Po.Ilmrmijl("ufilub", 902899539, -1125913804, -1125913807, -1125913806, 902899539)[0]] = callSite;
    }

    static {
        Po.ntfClinit();
    }

    private static void s() {
        i = new boolean[]{true, false, true, true};
    }

    private void m() {
        if (Po.Ilmrmijl("mzqj", 902899541, -1125913804, -1125913801, -1125913808, 902899541, (Po)this) == null) {
            Po.Ilmrmijl("sxmfxef", 902899540, -1125913804, -1125913801, -1125913808, 902899540, (Po)this, (Object[])new Object[Po.Ilmrmijl("dtwva", 902899539, -1125913804, -1125913796, -1125913798, 902899539)[3]]);
            CallSite callSite = Po.Ilmrmijl("glqyrcb", 902899541, -1125913804, -1125913801, -1125913808, 902899541, (Po)this);
        }
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-41, 107, 9, 105, 79, -33, -2, 24, 116, 7, 84, -50, -96, 24, -116, 77};
        int n = 0;
        int n2 = 223;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 201;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @Override
    public void y() {
        Po.Ilmrmijl("sxmfxef", 902899543, -1125913804, -1125913803, -1125913802, 902899543, (Po)this);
        Po.Ilmrmijl("gqoxmlw", 902899543, -1125913794, -1125913793, -1125913800, 902899543, (ue)((ue)((Object)Po.Ilmrmijl("gvpkq", 902899543, -1125913805, -1125913796, -1125913795, 902899543, (ld)((ld)((Object)Po.Ilmrmijl("gvpkq", 902899541, -1125913804, -1125913801, -1125913808, 902899541, (Po)this)[Po.Ilmrmijl("ndge", 902899539, -1125913804, -1125913807, -1125913806, 902899539)[1]]))))), (Object)this);
        Po.Ilmrmijl("bmlrr", 902899542, -1125913799, -1125913793, -1125913802, 902899542, (UM)this);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-92, -1, -77, -103, 26, -67, 42, -18, 102, 120, -88, -11, -49, -41, 80, 127};
        int n = 0;
        int n2 = 180;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 77;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateRight(-Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(-n, 8), 20), 14), 13), 20), 20);
    }

    @uF
    public void N(Ru ru) {
        Po.Ilmrmijl("gqoxmlw", 902899543, -1125913804, -1125913803, -1125913802, -1448496476, (Po)this);
        Po.Ilmrmijl("sxmfxef", 902899543, -1125913794, -1125913793, -1125913800, -1448496476, (ue)((ue)((Object)Po.Ilmrmijl("qfapown", 902899543, -1125913805, -1125913796, -1125913795, -1448496476, (ld)((ld)((Object)Po.Ilmrmijl("bmlrr", 902899541, -1125913804, -1125913801, -1125913808, -503268453, (Po)this)[Po.Ilmrmijl("gjacvc", 902899539, -1125913804, -1125913807, -1125913806, 826186113)[2]]))))), (Object)ru);
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateLeft((n ^ 0x800B6F19) + 1 ^ 0x645C5915, 1) ^ 0xC7A2AC4E;
    }

    private static /* synthetic */ void ntfClinit() {
        Il0IlI = "\u00839\u00bd,n\u00d5\u0090\u0012\u00fc(+K\u00c1&A\u00f2\u009b\u0001\u0085}\u00cf\u00b5\u0000u\u00f1\u00b4P\u00bf\u0019*p\u00a2\u00b8\u00b5\u0000u\u00f1\u00b4P\u00bf\u001c\b\u001a\f\u00d8\ne\u00c2\u0087\\\u00bf%$B\u0089Fl\u00faIA\u009224l\u00b5\u0000u\u00f1\u00b4P\u00bf< [\u00ab\u00df\u00bd,n\u00d5\u0090\u0012\u00fc(+K\u00c1:W\u00ea\u00d2\u00ea\u0096}\u00f7\u00bd,n\u00d5\u0090\u0012\u00fc(+K\u00c1&A\u00f2/\u00bc\u0085}&\u00f5\u0091\u00bd\rK\u00e5\u008bo\u00d5$j@\u00b7Ro\u00f2a\u00cf\u0090ic\u00c2\u009fZ\u00bf\u001a1^\u0087\u0007D\u00a3[\u00f5\u00ba\u0002I\u00d9\u00a3x\u00fdf)Z\u00d5@o\u00d3D\u00ff\u008b\u0014J\u00ce\u00deQ\u00f4r\u00f7\u0091\u00d8\u0010\u00f5!t\u009b\u00b5\u0000u\u00f1\u00b4P\u00bf%!\u00e5\u00a5\u00b5\u0000u\u00f1\u00b4P\u00bf%.";
        II0ml0rIr = new int[]{1310730, 1, 11337731, 0xB00001, 65555, 12386305, 1966082, 11730954, 0xB10001, 2818068, 4128778, 11665409, 6160405, 0x20000A, 4784130, 2752513, 4915219, 12451850, 11272193, 7536697};
        Po.T();
        Po.s();
        Po.P();
    }

    private static /* synthetic */ void OOrtltmI(String[] stringArray) {
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
        Il0IlI = stringBuilder.toString();
        II0ml0rIr = nArray;
    }

    private static /* synthetic */ CallSite ootI0i(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = II0ml0rIr[n2 ^ 0xBCE3EB34];
        int n8 = n7 >>> 16;
        String string2 = Po.ll0tk0npn(Il0IlI.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xBCE3EB34);
        n7 = II0ml0rIr[n3 ^ 0xBCE3EB34];
        int n9 = n7 >>> 16;
        String string3 = Po.ll0tk0npn(Il0IlI.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xBCE3EB34);
        n7 = II0ml0rIr[n4 ^ 0xBCE3EB34];
        int n10 = n7 >>> 16;
        String string4 = Po.ll0tk0npn(Il0IlI.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xBCE3EB34);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x35D127E1) + -178;
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

    private static /* synthetic */ CallSite Ilmrmijl(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = II0ml0rIr[n2 ^ 0xBCE3EB34];
        int n7 = n6 >>> 16;
        String string2 = Po.ll0tk0npn(Il0IlI.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xBCE3EB34);
        n6 = II0ml0rIr[n3 ^ 0xBCE3EB34];
        int n8 = n6 >>> 16;
        String string3 = Po.ll0tk0npn(Il0IlI.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xBCE3EB34);
        n6 = II0ml0rIr[n4 ^ 0xBCE3EB34];
        int n9 = n6 >>> 16;
        String string4 = Po.ll0tk0npn(Il0IlI.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xBCE3EB34);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x35D127E1) + -178;
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

    private static /* synthetic */ String ll0tk0npn(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-124, 61, -26, -96, -93, -52, 0, 20, -81, -119, 91, 106, 61, 84, -52, 119};
        byte[] byArray3 = new byte[]{-114, -123, 53, 53, -66, -30, 38, -7, -62, 117, -71, -91, 57, -8, 51, 12};
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
