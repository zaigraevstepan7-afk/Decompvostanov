/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.im;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="SuperFirework", y=UR.MOVEMENT, N=Uz.TOOLS)
public class PZ
extends UM {
    public Object[] L;
    private static boolean[] u;
    private static short[] i;
    private static String[] R;
    private static float[] M;
    private static /* synthetic */ String OOltt0rm;
    private static /* synthetic */ int[] llqikjmpn;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(-n, 30), 25), 6), 26) ^ 0xEFF7F8A5;
    }

    private static void P() {
        u = new boolean[]{true};
    }

    private static void T() {
        i = new short[]{0, 0};
    }

    public PZ() {
        PZ.lljmji("rcosre", 521281214, -1273624614, -1273624613, -1273624616, 521281214, 521281214, (PZ)this);
        CallSite callSite = PZ.lljmji("awacbd", 521281200, -1273624631, -1273624617, -1273624626, 521281200, 521281200, (lY)this, (String)((Object)PZ.lljmji("rrbxl", 521281210, -1273624614, -1273624619, -1273624630, 521281210, 521281210)[0]), (float)PZ.lljmji("grrhki", 521281210, -1273624614, -1273624629, -1273624632, 521281210, 521281210)[0], (float)PZ.lljmji("rrbxl", 521281210, -1273624614, -1273624629, -1273624632, 521281210, 521281210)[1], (float)PZ.lljmji("rcosre", 521281210, -1273624614, -1273624629, -1273624632, 521281210, 521281210)[2], (float)PZ.lljmji("grrhki", 521281210, -1273624614, -1273624629, -1273624632, 521281210, 521281210)[3]);
        PZ.lljmji("awacbd", 521281212, -1273624614, -1273624615, -1273624610, 521281212, 521281212, (PZ)this)[PZ.lljmji("zevt", 521281210, -1273624614, -1273624609, -1273624612, 521281210, 521281210)[0]] = callSite;
    }

    static {
        PZ.ntfClinit();
    }

    private static void b() {
        M = new float[]{1.5f, 1.5f, 2.0f, 0.01f};
    }

    private void s() {
        if (PZ.lljmji("awacbd", 521281212, -1273624614, -1273624615, -1273624610, 521281212, 521281212, (PZ)this) == null) {
            PZ.lljmji("rxhbcjqa", 521281213, -1273624614, -1273624615, -1273624610, 521281213, 521281213, (PZ)this, (Object[])new Object[PZ.lljmji("grrhki", 521281210, -1273624614, -1273624625, -1273624628, 521281210, 521281210)[0]]);
            CallSite callSite = PZ.lljmji("rrbxl", 521281212, -1273624614, -1273624615, -1273624610, 521281212, 521281212, (PZ)this);
        }
    }

    private static void m() {
        R = new String[]{"speed"};
    }

    private static /* synthetic */ int u(int n) {
        return (Integer.rotateLeft(Integer.rotateLeft(-n, 7), 20) ^ 0x679A889B) + 1;
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n, 26), 21) ^ 0xE5E10C99, 27), 26), 17), 22);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-19, -73, 17, -46, -109, 120, -94, 109, 108, 108, -91, -7, -34, 11, -45, -88};
        int n = 0;
        int n2 = 88;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 185;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateRight(-Integer.rotateLeft(n, 4), 27), 10), 8) ^ 0x5948855E;
    }

    @uF
    public void N(im im2) {
        PZ.lljmji("zqsbqts", 521281214, -1273624614, -1273624613, -1273624616, -1959827216, 1089400721, (PZ)this);
        PZ.lljmji("sakpe", 521281214, -1273624618, -1273624617, -1273624620, -1959827216, 1089400721, (im)im2, (double)((double)PZ.lljmji("zevt", 521281214, -1273624621, -1273624624, -1273624623, -1959827216, 1089400721, (Float)((Float)((Object)PZ.lljmji("zqsbqts", 521281214, -1273624611, -1273624609, -1273624622, -1959827216, 1089400721, (lQ)((lQ)((Object)PZ.lljmji("rrbxl", 521281212, -1273624614, -1273624615, -1273624610, 1909765656, -1569776488, (PZ)this)[PZ.lljmji("rcosre", 521281210, -1273624614, -1273624609, -1273624612, 644960035, -721143534)[1]]))))))));
    }

    private static /* synthetic */ void ntfClinit() {
        OOltt0rm = "Zj\u00ec\u00b0\u00d1\u00dd\u00aa\u00ba?pXO\u00dc\u00ab\u00ac\u00f4\u00a6\u00fb12\u007f\u00cd]\u0086(\u00b1b\u00c0\u00ab\u00f5\u00f9\u00e8\u00f97s^\u008ea\u0093.\u009c\u0084I\u0091\u00feB\u00c5\u00ab\u00f7\u00ce\u00a6\u00f9#x\u0089\u00ad\\}dZ$j\u0083\u0086\u00c8\u00dc\u0081\u00ef\u0004XT\u008e[\u008ago\u0007\u00ecW\u0007\u00fc\u00c1\u0007\u00e6\u00a0\u00e2\u00ee\u00a6\u00ba:|W\u00c6\u001d\u00a8>\u009f\u008cM\u00de\u00f1R\\t\u00a1j\u00ec\u00b0\u00d1\u00dd\u00aa\u00ba\u0006G[j\u00ec\u00b0\u00d1\u00dd\u00aa\u00ba:L\u00b1LKj\u00ec\u00b0\u00d1\u00dd\u00aa\u00ba:v$h\u00c8b\u00c0\u00ab\u00f5\u00f9\u00e8\u00f97s^\u008e}\u00856H\u00f0Z\u0091\u00bbb\u00e1\u008e\u00c5\u00e2\u0095\u00d0;2U\u00f8\t\u00ab6L\u00e5O\u0085\u00a6\u00e2\u00f6\u00a0\u00ba\u0005iK\u00c8\\\u0080gk\u00d5h\u00ec\u00e3\u00cf\u00d3\u0083\u00d3,O|\u00cc\u001d\u008b\r\u0016";
        llqikjmpn = new int[]{6815754, 3866625, 5111811, 8192001, 9043987, 3604481, 3670018, 7471114, 5308436, 655375, 2883594, 4915203, 10, 6619137, 3932175, 3538945, 1638419, 3801089, 0x880002, 8257546, 10289200, 8126465, 0x660002};
        PZ.T();
        PZ.b();
        PZ.P();
        PZ.m();
    }

    private static /* synthetic */ CallSite lljmji(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = llqikjmpn[n2 ^ 0xB41607DA];
        int n8 = n7 >>> 16;
        String string2 = PZ.IIkj0q(OOltt0rm.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xB41607DA);
        n7 = llqikjmpn[n3 ^ 0xB41607DA];
        int n9 = n7 >>> 16;
        String string3 = PZ.IIkj0q(OOltt0rm.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xB41607DA);
        n7 = llqikjmpn[n4 ^ 0xB41607DA];
        int n10 = n7 >>> 16;
        String string4 = PZ.IIkj0q(OOltt0rm.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xB41607DA);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x1F121E08) + -178;
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

    private static /* synthetic */ CallSite Ilsmnkl(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = llqikjmpn[n2 ^ 0xB41607DA];
        int n9 = n8 >>> 16;
        String string2 = PZ.IIkj0q(OOltt0rm.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xB41607DA);
        n8 = llqikjmpn[n3 ^ 0xB41607DA];
        int n10 = n8 >>> 16;
        String string3 = PZ.IIkj0q(OOltt0rm.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xB41607DA);
        n8 = llqikjmpn[n4 ^ 0xB41607DA];
        int n11 = n8 >>> 16;
        String string4 = PZ.IIkj0q(OOltt0rm.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xB41607DA);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x1F121E08) + -178;
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

    private static /* synthetic */ void llOItrIlO(String[] stringArray) {
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
        OOltt0rm = stringBuilder.toString();
        llqikjmpn = nArray;
    }

    private static /* synthetic */ String IIkj0q(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{80, 87, 98, 65, 64, -56, 76, -70, 23, 92, 121, -61, -117, 47, -108, -71};
        byte[] byArray3 = new byte[]{19, -19, 107, 73, 77, -53, 118, 40, -29, -88, 2, -21, -77, -64, -23, 83};
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
