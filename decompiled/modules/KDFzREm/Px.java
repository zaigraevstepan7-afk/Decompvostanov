/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NHS
 *  KDFzREm.NNNZg
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.NbK
 */
package KDFzREm;

import KDFzREm.NHS;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NbK;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uu;
import KDFzREm.Uz;
import KDFzREm.ih;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

@UZ(L="AvoidCollision", y=UR.PLAYER, u=Uu.DEVELOPMENT, N=Uz.BASE)
public class Px
extends UM {
    private static short[] L;
    private static double[] u;
    private static float[] i;
    private static boolean[] R;
    private static short[] M;
    private static /* synthetic */ String OOrqjp;
    private static /* synthetic */ int[] Il0Osj;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(-Integer.rotateRight(-Integer.rotateLeft(n, 29), 14), 30);
    }

    private static void P() {
        i = new float[]{0.3f};
    }

    private static void T() {
        R = new boolean[]{true};
    }

    static {
        Px.ntfClinit();
    }

    private static void s() {
        L = new short[]{-180, 180, 0, 3, 0, 4, 0};
        M = new short[]{4, 180};
    }

    private static void m() {
        u = new double[]{0.0};
    }

    private static /* synthetic */ int u(int n) {
        return (Integer.rotateRight(Integer.rotateRight(-n, 8), 23) ^ 0xCC05C619) + 1 ^ 0x8ECE6C9B;
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n, 24), 27), 4) ^ 0x38A9514B, 22), 22) ^ 0xD71F77D9;
    }

    /*
     * WARNING - void declaration
     */
    @uF
    public void N(ih ih2) {
        void var3_4;
        CallSite callSite = Px.OOtn0lqij("yfexmmhv", 281916543, -1970893216, -1970893215, -1970893214, -1309090671, 2078632900)[0];
        CallSite callSite2 = Px.OOtn0lqij("ifpo", 281916543, -1970893216, -1970893213, -1970893212, 1680209854, 1330107422)[0];
        while (var3_4 <= Px.OOtn0lqij("eijsmg", 281916543, -1970893216, -1970893213, -1970893212, 287830402, 34761234)[1]) {
            reference var4_5 = -Px.OOtn0lqij("ohkv", 281916533, -1970893211, -1970893208, -1970893209, -1207554529, 55906978, (double)Px.OOtn0lqij("ifpo", 281916533, -1970893211, -1970893210, -1970893209, -1207554529, 55906978, (double)((double)var3_4))) * (double)callSite;
            reference var6_6 = Px.OOtn0lqij("wtnqoe", 281916533, -1970893211, -1970893207, -1970893209, -1207554529, 55906978, (double)Px.OOtn0lqij("paempev", 281916533, -1970893211, -1970893210, -1970893209, -1207554529, 55906978, (double)((double)var3_4))) * (double)callSite;
            if (Px.OOtn0lqij("wtnqoe", 281916532, -1970893188, -1970893187, -1970893186, -1207554529, 55906978, (Iterator)((Object)Px.OOtn0lqij("paempev", 281916532, -1970893191, -1970893190, -1970893189, -1207554529, 55906978, (Iterable)((Object)Px.OOtn0lqij("miudgbo", 281916539, -1970893194, -1970893193, -1970893192, -1207554529, 55906978, (NNNZg)((NNNZg)Px.OOtn0lqij("ulec", 281916537, -1970893204, -1970893203, -1970893205, 2132327056, -346039328, (NNuU)((NNuU)Px.OOtn0lqij("yfexmmhv", 281916537, -1970893216, -1970893206, -1970893205, 1024056182, -1473536626, (Px)this)[Px.OOtn0lqij("ifpo", 281916543, -1970893216, -1970893213, -1970893212, 520270532, 1581865326)[2]]))[Px.OOtn0lqij("ifpo", 281916543, -1970893216, -1970893213, -1970893212, 690948181, -1961531088)[3]]), (NbK)((NNNwS)Px.OOtn0lqij("ulec", 281916537, -1970893204, -1970893203, -1970893205, -1355775388, 880156025, (NNuU)((NNuU)Px.OOtn0lqij("ifpo", 281916537, -1970893216, -1970893206, -1970893205, -2102552949, 461531227, (Px)this)[Px.OOtn0lqij("ohkv", 281916543, -1970893216, -1970893213, -1970893212, 1966368512, -605712812)[4]]))[Px.OOtn0lqij("ohkv", 281916543, -1970893216, -1970893213, -1970893212, -1695791483, -1038671432)[5]]), (NHS)Px.OOtn0lqij("dnswz", 281916539, -1970893196, -1970893198, -1970893195, -1207554529, 55906978, (NHS)Px.OOtn0lqij("veamui", 281916539, -1970893201, -1970893200, -1970893199, -1207554529, 55906978, (NNNwS)((NNNwS)Px.OOtn0lqij("wtnqoe", 281916537, -1970893204, -1970893203, -1970893205, -2079849567, 842487452, (NNuU)((NNuU)Px.OOtn0lqij("dnswz", 281916537, -1970893216, -1970893206, -1970893205, -2122846981, -2070014019, (Px)this)[Px.OOtn0lqij("ulec", 281916543, -1970893216, -1970893213, -1970893212, -1816727574, 658741718)[6]]))[Px.OOtn0lqij("dnswz", 281916543, -1970893216, -1970893202, -1970893212, -1781802650, 1477466500)[0]])), (double)var4_5, (double)Px.OOtn0lqij("yfexmmhv", 281916543, -1970893216, -1970893198, -1970893197, 1499778294, 1749074176)[0], (double)var6_6)))))) != false) {
                Px.OOtn0lqij("ubahxoxa", 281916539, -1970893247, -1970893246, -1970893245, -1207554529, 55906978, (ih)ih2, (boolean)Px.OOtn0lqij("ubahxoxa", 281916543, -1970893216, -1970893185, -1970893248, -1333970206, -1161369697)[0]);
                Px.OOtn0lqij("ohkv", 281916533, -1970893244, -1970893243, -1970893242, -1207554529, 55906978, (ih)ih2, (float)((float)(var3_4 + Px.OOtn0lqij("yfexmmhv", 281916543, -1970893216, -1970893202, -1970893212, -585078532, -2113070070)[1])));
                break;
            }
            var3_4 += 90;
        }
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateLeft(n, 27) ^ 0xD1777DC, 4), 2), 8);
    }

    private static /* synthetic */ long N(long l) {
        return -Long.rotateRight(Long.rotateLeft(Long.rotateLeft(Long.rotateLeft(0x5F63FFBC5B3D6A2DL ^ l, 29), 32), 54) ^ 0x1D2A00FB1E651670L, 17);
    }

    private static /* synthetic */ void ntfClinit() {
        OOrqjp = "J\u001d\u00c7\u0082d\u00dcw\u00c6T\b\u00d4\u0091*\u00ddl\u00dd\u00eb2\u00ea$\u00b5r\u00b3\u00c0Q\u001be\f\u00d6\u0098j\u00ccG\u0081\u00bf/\u009ap\u0000\u00cc\u0011/>\u0006\u00d1e:7\b\u00d4\u0091*\u00c4y\u00da\u00e02\u00ea$\u00b5r\u00b3\u00011\f\u00db@\u00ee\u009ad\u00dey\u009b\u00f2i\u00ca<\u00ffI\u00a6\u00c7\u0081\b\u00d6\u009fw\u0093\u00c1-\u00e4\u008aW\u00edu\u009b\u00eeum%\u00e9\u00b4C\u00d2J\u00f1\u00ea2\u00ca8\u00ebF\u00fb8u-\u00e4\u008aW\u00edu\u009b\u00f0I:\b\u00d4\u0091*\u00c4y\u00da\u00e02\u00ee1\u00a4hC-\u00e4\u008aW\u00edu\u009b\u00d7e(-\u008b\u00b4\u0003-m\f\u00d6\u0098j\u00ccG\u008c\u00b1-\u0093yp3\u008b\u00bcN\u00ec^\u00ce\u00d5X\u00ce\u007f\u00b9h\u00e9\b\u001e?\u00a2@\u00ee\u00bbA\u00eeb\u00e6\u00c2p\u008c\u001e\u0098S\u00e9\u009f\u00f4\b\u00d1\u00be`\u00d0lu-\u00e4\u008aW\u00edu\u009b\u00c9U\u00f0\u00c8\u00a8%\u00c8\u0091s\u00c97\u00d8\u00e6s\u00c4\u007f\u009fb\u00b8\u00c7\u0090\u001d\u0099\u0014\u000e-\u00e4\u008aW\u00edu\u009b\u00c9S\u00ed\n\u00b7\u0086-\u00e4\u008aW\u00edu\u009b\u00c9S\u00ed'\u0083Zu-\u00e4\u008aW\u00edu\u009b\u00c9S\u00d6\u0005S3x-\u00e6\u00b4,\u00e4S\u00f0\u00c1g\u00f1\u0015\u00bd/\u009c\u00fc\u0003R\u00e31\u0006\u00f0\u0091a\u00c1y\u00da\u00f4+%\u00e9\u00b4C\u00d2J\u00f1\u00ea2\u00ed2\u009b;\u009e(G/\u00d8\u00a2@\u00c57\u00fa\u00cfN\u0098y\u009cj\u00b3\u0015bF\u00ce\u0091k\u00cf7\u00fd\u00f3x\u00d11\u00b2l\u00b7X\u001c@\u00f8";
        Il0Osj = new int[]{8978442, 19464193, 0x280002, 15532033, 0x2D0002, 8060942, 19529737, 9633796, 2424835, 2752515, 0x1080001, 14286867, 17367052, 14221313, 10747905, 16449549, 1703947, 11993103, 11927553, 9895938, 13500427, 18284562, 0xEE000D, 0x99000B, 0x1330030, 3080210, 8, 4259862, 524306, 0xC70007, 23265283, 12976129, 18153474, 5701642, 11796481, 10813455, 7405578, 11862017, 0x610010};
        Px.s();
        Px.m();
        Px.P();
        Px.T();
    }

    private static /* synthetic */ String Olmqmqi(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{42, 96, -74, 41, 114, 30, 119, 20, -25, 9, 122, 34, -39, 111, -96, 20};
        byte[] byArray3 = new byte[]{-73, 92, 61, -31, 90, -91, 93, -33, -19, 92, -46, 33, -13, -74, -82, 91};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite Olmj0mnsi(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = Il0Osj[n2 ^ 0x8A868E60];
        int n9 = n8 >>> 16;
        String string2 = Px.Olmqmqi(OOrqjp.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x8A868E60);
        n8 = Il0Osj[n3 ^ 0x8A868E60];
        int n10 = n8 >>> 16;
        String string3 = Px.Olmqmqi(OOrqjp.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x8A868E60);
        n8 = Il0Osj[n4 ^ 0x8A868E60];
        int n11 = n8 >>> 16;
        String string4 = Px.Olmqmqi(OOrqjp.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x8A868E60);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x10CDB4CD) + -178;
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

    private static /* synthetic */ CallSite OljkmOtm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = Il0Osj[n2 ^ 0x8A868E60];
        int n9 = n8 >>> 16;
        String string2 = Px.Olmqmqi(OOrqjp.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x8A868E60);
        n8 = Il0Osj[n3 ^ 0x8A868E60];
        int n10 = n8 >>> 16;
        String string3 = Px.Olmqmqi(OOrqjp.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x8A868E60);
        n8 = Il0Osj[n4 ^ 0x8A868E60];
        int n11 = n8 >>> 16;
        String string4 = Px.Olmqmqi(OOrqjp.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x8A868E60);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x10CDB4CD) + -178;
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

    private static /* synthetic */ CallSite OOtn0lqij(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = Il0Osj[n2 ^ 0x8A868E60];
        int n8 = n7 >>> 16;
        String string2 = Px.Olmqmqi(OOrqjp.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x8A868E60);
        n7 = Il0Osj[n3 ^ 0x8A868E60];
        int n9 = n7 >>> 16;
        String string3 = Px.Olmqmqi(OOrqjp.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x8A868E60);
        n7 = Il0Osj[n4 ^ 0x8A868E60];
        int n10 = n7 >>> 16;
        String string4 = Px.Olmqmqi(OOrqjp.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x8A868E60);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x10CDB4CD) + -178;
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

    private static /* synthetic */ void Olpjn(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[39];
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
        OOrqjp = stringBuilder.toString();
        Il0Osj = nArray;
    }

    private static /* synthetic */ CallSite OOlmimn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = Il0Osj[n2 ^ 0x8A868E60];
        int n9 = n8 >>> 16;
        String string2 = Px.Olmqmqi(OOrqjp.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x8A868E60);
        n8 = Il0Osj[n3 ^ 0x8A868E60];
        int n10 = n8 >>> 16;
        String string3 = Px.Olmqmqi(OOrqjp.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x8A868E60);
        n8 = Il0Osj[n4 ^ 0x8A868E60];
        int n11 = n8 >>> 16;
        String string4 = Px.Olmqmqi(OOrqjp.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x8A868E60);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x10CDB4CD) + -178;
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
