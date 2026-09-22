/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.Mj;
import KDFzREm.PI;
import KDFzREm.RL;
import KDFzREm.Rs;
import KDFzREm.Ry;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ih;
import KDFzREm.ix;
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

@UZ(L="Speed", y=UR.MOVEMENT, N=Uz.BASE)
public class Pg
extends UM {
    private static boolean[] u;
    private static byte[] i;
    private static short[] R;
    private static String[] M;
    public Object[] L;
    private static short[] B;
    private static /* synthetic */ String Ol0js;
    private static /* synthetic */ int[] OOqsOp;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateRight(-n ^ 0x3C2A9D62, 3);
    }

    private static void P() {
        i = new byte[]{2};
    }

    private void T() {
        if (Pg.OOspijiss("bkinfhzj", 563030708, -1954439081, -1954439088, -1954439073, 563030708, 563030708, (Pg)this) == null) {
            Pg.OOspijiss("bkinfhzj", 563030709, -1954439081, -1954439088, -1954439073, 563030709, 563030709, (Pg)this, (Object[])new Object[Pg.OOspijiss("tbfzjd", 563030706, -1954439081, -1954439097, -1954439102, 563030706, 563030706)[0]]);
            CallSite callSite = Pg.OOspijiss("kpiual", 563030708, -1954439081, -1954439088, -1954439073, 563030708, 563030708, (Pg)this);
        }
    }

    public Pg() {
        Pg.OOspijiss("mmpih", 563030710, -1954439081, -1954439082, -1954439083, 563030710, 563030710, (Pg)this);
        PI pI = new PI(this, (String)((Object)Pg.OOspijiss("tbfzjd", 563030706, -1954439081, -1954439084, -1954439085, 563030706, 563030706)[0]), (boolean)Pg.OOspijiss("znlvdp", 563030706, -1954439081, -1954439086, -1954439087, 563030706, 563030706)[0]);
        Pg.OOspijiss("uyif", 563030708, -1954439081, -1954439088, -1954439073, 563030708, 563030708, (Pg)this)[Pg.OOspijiss("bkgmqa", 563030706, -1954439081, -1954439074, -1954439075, 563030706, 563030706)[0]] = pI;
        lv[] lvArray = new ue[Pg.OOspijiss("kpiual", 563030706, -1954439081, -1954439086, -1954439087, 563030706, 563030706)[1]];
        lvArray[Pg.OOspijiss("mmpih", 563030706, -1954439081, -1954439086, -1954439087, 563030706, 563030706)[2]] = (ue)((Object)Pg.OOspijiss("mmpih", 563030708, -1954439081, -1954439088, -1954439073, 563030708, 563030708, (Pg)this)[Pg.OOspijiss("znlvdp", 563030706, -1954439081, -1954439074, -1954439075, 563030706, 563030706)[1]]);
        CallSite callSite = Pg.OOspijiss("mmpih", 563030712, -1954439076, -1954439077, -1954439078, 563030712, 563030712, (lY)this, (String)((Object)Pg.OOspijiss("bkgmqa", 563030706, -1954439081, -1954439084, -1954439085, 563030706, 563030706)[1]), (lv[])lvArray);
        Pg.OOspijiss("gxytih", 563030708, -1954439081, -1954439088, -1954439073, 563030708, 563030708, (Pg)this)[Pg.OOspijiss("znlvdp", 563030706, -1954439081, -1954439074, -1954439075, 563030706, 563030706)[2]] = callSite;
    }

    static {
        Pg.ntfClinit();
    }

    private static void b() {
        u = new boolean[]{true, true, false};
    }

    private static void s() {
        M = new String[]{"collision", "mode"};
    }

    private static void m() {
        B = new short[]{0, 0, 1, 1};
        R = new short[]{1, 1, 1, 1, 1};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n ^ 0xFDBD95B4, 26), 9) ^ 0xA1C34925, 26) ^ 0x22FBBAFD;
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-16, -41, -29, 35, 33, -50, 82, -93, -128, 100, 43, 34, -16, 12, -124, 12};
        int n = 0;
        int n2 = 127;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 241;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-110, 22, -11, 40, -84, -31, 110, 117, -38, -68, -38, 33, 31, 31, -111, -22};
        int n = 0;
        int n2 = 177;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 233;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(-n ^ 0x1FBD4102, 28) ^ 0xC75CC008, 23), 10);
    }

    @uF
    public void N(Rs rs) {
        Pg.OOspijiss("tbfzjd", 563030710, -1954439081, -1954439082, -1954439083, 100276128, -578359067, (Pg)this);
        Pg.OOspijiss("mmpih", 563030710, -1954439099, -1954439100, -1954439101, 100276128, -578359067, (ue)((ue)((Object)Pg.OOspijiss("bkgmqa", 563030710, -1954439080, -1954439097, -1954439098, 100276128, -578359067, (ld)((ld)((Object)Pg.OOspijiss("kpiual", 563030708, -1954439081, -1954439088, -1954439073, -708812563, -1310723506, (Pg)this)[Pg.OOspijiss("kpiual", 563030706, -1954439081, -1954439079, -1954439075, -317115705, 612898818)[4]]))))), (Object)rs);
    }

    @uF
    public void N(Ry ry) {
        Pg.OOspijiss("znlvdp", 563030710, -1954439081, -1954439082, -1954439083, 100276128, -578359067, (Pg)this);
        Pg.OOspijiss("znlvdp", 563030710, -1954439099, -1954439100, -1954439101, 100276128, -578359067, (ue)((ue)((Object)Pg.OOspijiss("cwfdakxx", 563030710, -1954439080, -1954439097, -1954439098, 100276128, -578359067, (ld)((ld)((Object)Pg.OOspijiss("ycxd", 563030708, -1954439081, -1954439088, -1954439073, 1369543249, 1937485341, (Pg)this)[Pg.OOspijiss("tbfzjd", 563030706, -1954439081, -1954439074, -1954439075, -781668409, 591655992)[3]]))))), (Object)ry);
    }

    @uF
    public void N(ih ih2) {
        Pg.OOspijiss("bkgmqa", 563030710, -1954439081, -1954439082, -1954439083, 100276128, -578359067, (Pg)this);
        Pg.OOspijiss("bkinfhzj", 563030710, -1954439099, -1954439100, -1954439101, 100276128, -578359067, (ue)((ue)((Object)Pg.OOspijiss("mgrzm", 563030710, -1954439080, -1954439097, -1954439098, 100276128, -578359067, (ld)((ld)((Object)Pg.OOspijiss("mmpih", 563030708, -1954439081, -1954439088, -1954439073, 1684561895, -88731735, (Pg)this)[Pg.OOspijiss("gxytih", 563030706, -1954439081, -1954439079, -1954439075, 910789390, 1320825781)[1]]))))), (Object)ih2);
    }

    @uF
    public void N(RL rL) {
        Pg.OOspijiss("lgclepmk", 563030710, -1954439081, -1954439082, -1954439083, 100276128, -578359067, (Pg)this);
        Pg.OOspijiss("uyif", 563030710, -1954439099, -1954439100, -1954439101, 100276128, -578359067, (ue)((ue)((Object)Pg.OOspijiss("mgrzm", 563030710, -1954439080, -1954439097, -1954439098, 100276128, -578359067, (ld)((ld)((Object)Pg.OOspijiss("gxytih", 563030708, -1954439081, -1954439088, -1954439073, 1632821987, -202520239, (Pg)this)[Pg.OOspijiss("znlvdp", 563030706, -1954439081, -1954439079, -1954439075, -763687903, 215597522)[2]]))))), (Object)rL);
    }

    @uF
    public void N(Mj mj) {
        Pg.OOspijiss("tbfzjd", 563030710, -1954439081, -1954439082, -1954439083, 563030710, 563030710, (Pg)this);
        Pg.OOspijiss("mher", 563030710, -1954439099, -1954439100, -1954439101, 563030710, 563030710, (ue)((ue)((Object)Pg.OOspijiss("mher", 563030710, -1954439080, -1954439097, -1954439098, 563030710, 563030710, (ld)((ld)((Object)Pg.OOspijiss("bkinfhzj", 563030708, -1954439081, -1954439088, -1954439073, 563030708, 563030708, (Pg)this)[Pg.OOspijiss("bkinfhzj", 563030706, -1954439081, -1954439079, -1954439075, 563030706, 563030706)[3]]))))), (Object)mj);
    }

    @uF
    public void N(ix ix2) {
        Pg.OOspijiss("mher", 563030710, -1954439081, -1954439082, -1954439083, 100276128, -578359067, (Pg)this);
        Pg.OOspijiss("gxytih", 563030710, -1954439099, -1954439100, -1954439101, 100276128, -578359067, (ue)((ue)((Object)Pg.OOspijiss("uyif", 563030710, -1954439080, -1954439097, -1954439098, 100276128, -578359067, (ld)((ld)((Object)Pg.OOspijiss("mgrzm", 563030708, -1954439081, -1954439088, -1954439073, 2059432997, -959900083, (Pg)this)[Pg.OOspijiss("ycxd", 563030706, -1954439081, -1954439079, -1954439075, 960789269, -196610831)[0]]))))), (Object)ix2);
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateLeft(n, 13) ^ 0x40B9258D;
    }

    private static /* synthetic */ void ntfClinit() {
        Ol0js = "Y)\u001d-\u0092\u0018M\u00adq\u008aE\u00ec\"\u00fe'\u0001T\u00d6\u0000s\u00bf|e\u008ae\u00bf/\u00d2y\u00e0\u0017T\u007f\u0087:I\u0095\u0017O\u0091Y\u009dm\u00aea\u00e4E\u0013T\u00f7%C\u00a4\u0001L\u0086$\u00b4d\u00ba\u00e9\u00929h\u009dj\u00f7l\u00e0c\u00f5Quz\u00d6<\u00d1\u00aahz7\u00929h\u009dj\u00f7l\u00e0c\u00f5Qil\u00ce\u001b\u0002\u00b9hE\u009a\u0015s\u00b9N\u00b5/\u00edf\u00d4\u008dD\u00929h\u009dj\u00f7l\u00e0c\u00f5Quz\u00d6\u0017\u000f\u00aah \u00bd<\u009a\u0015s\u00b9N\u00b5/\u00edi\u00dbd\u0084K\u009a\u0015s\u00b9N\u00b5/\u00f4h\u00a2\u00dd(\u00f7\u0005K\u00ff\u009a\u0015s\u00b9N\u00b5/\u00d1j\u0006\u00f7\u001fc\u008a}\u00b9/\u00edl\u00fc\u0019\u0015W\u00de\u0006K\u00bd'2cM\u009c";
        OOqsOp = new int[]{0xA1000A, 5177345, 10289155, 131073, 5242899, 12517377, 9371650, 0xA00001, 3932179, 1, 7143426, 6488074, 9306113, 196665, 10158081, 8650762, 10223617, 11206676, 9502730, 65537, 7274517, 0xC00002};
        Pg.m();
        Pg.P();
        Pg.b();
        Pg.s();
    }

    private static /* synthetic */ void lOrj000(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[22];
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
        Ol0js = stringBuilder.toString();
        OOqsOp = nArray;
    }

    private static /* synthetic */ CallSite IIOqqlm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = OOqsOp[n2 ^ 0x8B81A057];
        int n8 = n7 >>> 16;
        String string2 = Pg.llmt0(Ol0js.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x8B81A057);
        n7 = OOqsOp[n3 ^ 0x8B81A057];
        int n9 = n7 >>> 16;
        String string3 = Pg.llmt0(Ol0js.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x8B81A057);
        n7 = OOqsOp[n4 ^ 0x8B81A057];
        int n10 = n7 >>> 16;
        String string4 = Pg.llmt0(Ol0js.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x8B81A057);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x218F2A00) + -178;
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

    private static /* synthetic */ CallSite I1sll(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = OOqsOp[n2 ^ 0x8B81A057];
        int n10 = n9 >>> 16;
        String string2 = Pg.llmt0(Ol0js.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x8B81A057);
        n9 = OOqsOp[n3 ^ 0x8B81A057];
        int n11 = n9 >>> 16;
        String string3 = Pg.llmt0(Ol0js.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x8B81A057);
        n9 = OOqsOp[n4 ^ 0x8B81A057];
        int n12 = n9 >>> 16;
        String string4 = Pg.llmt0(Ol0js.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x8B81A057);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x218F2A00) + -178;
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

    private static /* synthetic */ String llmt0(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-54, -28, -90, -60, 58, -49, 126, -51, 69, -47, 95, -102, -11, -36, 120, -67};
        byte[] byArray3 = new byte[]{34, -21, 34, 74, 83, -2, -32, -110, -17, 116, -63, -108, 95, -82, 105, 4};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite OOspijiss(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = OOqsOp[n2 ^ 0x8B81A057];
        int n8 = n7 >>> 16;
        String string2 = Pg.llmt0(Ol0js.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x8B81A057);
        n7 = OOqsOp[n3 ^ 0x8B81A057];
        int n9 = n7 >>> 16;
        String string3 = Pg.llmt0(Ol0js.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x8B81A057);
        n7 = OOqsOp[n4 ^ 0x8B81A057];
        int n10 = n7 >>> 16;
        String string4 = Pg.llmt0(Ol0js.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x8B81A057);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x218F2A00) + -178;
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
