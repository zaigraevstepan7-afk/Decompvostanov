/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.vE;
import KDFzREm.vW;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class vP {
    public static Object[] N;
    private static short[] L;
    private static byte[] u;
    private static short[] i;
    private static long[] R;
    private static boolean[] M;
    private static boolean[] B;
    public Object[] y;
    private static /* synthetic */ String OlOqjil;
    private static /* synthetic */ int[] l1IsInkjq;

    public void L() {
        vP.OOOrs("egchne", 2026137899, 1675099167, 1675099155, 1675099194, 2026137899, 2026137899, (AtomicLong)((AtomicLong)((Object)vP.OOOrs("rcixje", 2026137897, 1675099195, 1675099196, 1675099197, 2026137897, 2026137897, (vP)this)[vP.OOOrs("aqyolphn", 2026137903, 1675099195, 1675099182, 1675099199, 2026137903, 2026137903)[6]])));
    }

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateRight(Integer.rotateRight(n, 26), 22), 23) ^ 0x30CB8100, 2), 17);
    }

    private static /* synthetic */ int M(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(n, 9) ^ 0xFAEB0454, 8), 11);
    }

    private static void M() {
        N = new Object[]{5, 250L};
    }

    public vP() {
        vP.OOOrs("tjwriqx", 2026137899, 1675099195, 1675099153, 1675099177, 2026137899, 2026137899, (vP)this);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        vP.OOOrs("tjwriqx", 2026137897, 1675099195, 1675099196, 1675099197, 2026137897, 2026137897, (vP)this)[vP.OOOrs("egchne", 2026137903, 1675099195, 1675099182, 1675099199, 2026137903, 2026137903)[0]] = copyOnWriteArrayList;
        AtomicInteger atomicInteger = new AtomicInteger();
        vP.OOOrs("utbi", 2026137897, 1675099195, 1675099196, 1675099197, 2026137897, 2026137897, (vP)this)[vP.OOOrs("rmunzyb", 2026137903, 1675099195, 1675099182, 1675099199, 2026137903, 2026137903)[1]] = atomicInteger;
        AtomicLong atomicLong = new AtomicLong();
        vP.OOOrs("aqyolphn", 2026137897, 1675099195, 1675099196, 1675099197, 2026137897, 2026137897, (vP)this)[vP.OOOrs("tjwriqx", 2026137903, 1675099195, 1675099182, 1675099199, 2026137903, 2026137903)[2]] = atomicLong;
    }

    static {
        vP.ntfClinit();
    }

    private static void B() {
        u = new byte[]{5, 3, 2, 5};
    }

    private static /* synthetic */ int B(int n) {
        return -Integer.rotateRight(n ^ 0x31D3084, 18) ^ 0xBC8976AF;
    }

    private static void Z() {
        R = new long[]{250L, 250L};
    }

    private static /* synthetic */ int i(int n) {
        return (Integer.rotateRight(-Integer.rotateRight(n, 17), 22) ^ 0xA510E1DC) + 1;
    }

    public vW i() {
        return new vW(this);
    }

    /*
     * WARNING - void declaration
     */
    private void U() {
        CallSite callSite = vP.OOOrs("utbi", 2026137892, 1675099158, 1675099145, 1675099146, 2026137892, 2026137892, (Stream)((Object)vP.OOOrs("aqyolphn", 2026137892, 1675099158, 1675099159, 1675099144, 2026137892, 2026137892, (Stream)((Object)vP.OOOrs("egchne", 2026137892, 1675099184, 1675099156, 1675099157, 2026137892, 2026137892, (List)((List)((Object)vP.OOOrs("utbi", 2026137897, 1675099195, 1675099196, 1675099197, 2026137897, 2026137897, (vP)this)[vP.OOOrs("nhdtu", 2026137903, 1675099195, 1675099198, 1675099199, 2026137903, 2026137903)[1]])))), vE::E)));
        reference var2_2 = vP.OOOrs("rmunzyb", 2026137892, 1675099184, 1675099147, 1675099171, 2026137892, 2026137892, (List)((Object)callSite)) - vP.OOOrs("kput", 2026137903, 1675099195, 1675099187, 1675099172, 2026137903, 2026137903)[0];
        CallSite callSite2 = vP.OOOrs("syxv", 2026137892, 1675099184, 1675099173, 1675099174, 2026137892, 2026137892, (List)((Object)callSite));
        while (vP.OOOrs("knkmkggo", 2026137892, 1675099175, 1675099160, 1675099161, 2026137892, 2026137892, (Iterator)((Object)callSite2)) != false) {
            void var2_3;
            vE vE2 = (vE)((Object)vP.OOOrs("kput", 2026137892, 1675099175, 1675099162, 1675099163, 2026137892, 2026137892, (Iterator)((Object)callSite2)));
            if (var2_3 <= 0) {
                return;
            }
            if (vP.OOOrs("nhdtu", 2026137899, 1675099191, 1675099148, 1675099161, 2026137899, 2026137899, (vE)vE2) != false) continue;
            vP.OOOrs("syxv", 2026137899, 1675099191, 1675099176, 1675099177, 2026137899, 2026137899, (vE)vE2);
            --var2_3;
        }
    }

    private void z() {
        if (vP.OOOrs("utbi", 2026137897, 1675099195, 1675099196, 1675099197, 2026137897, 2026137897, (vP)this) == null) {
            vP.OOOrs("nhdtu", 2026137896, 1675099195, 1675099196, 1675099197, 2026137896, 2026137896, (vP)this, (Object[])new Object[vP.OOOrs("rcixje", 2026137903, 1675099195, 1675099187, 1675099172, 2026137903, 2026137903)[1]]);
            CallSite callSite = vP.OOOrs("rmunzyb", 2026137897, 1675099195, 1675099196, 1675099197, 2026137897, 2026137897, (vP)this);
        }
    }

    public List<vE> u() {
        vP.OOOrs("utbi", 2026137899, 1675099195, 1675099176, 1675099177, -973324939, 857586146, (vP)this);
        return vP.OOOrs("rmunzyb", 2026137892, 1675099158, 1675099145, 1675099146, -973324939, 857586146, (Stream)((Object)vP.OOOrs("knkmkggo", 2026137892, 1675099158, 1675099159, 1675099144, -973324939, 857586146, (Stream)((Object)vP.OOOrs("tjwriqx", 2026137892, 1675099184, 1675099156, 1675099157, -973324939, 857586146, (List)((List)((Object)vP.OOOrs("tjwriqx", 2026137897, 1675099195, 1675099196, 1675099197, -1371772336, -1894636451, (vP)this)[vP.OOOrs("rmunzyb", 2026137903, 1675099195, 1675099182, 1675099199, 1716803496, -680035724)[3]])))), vE::E)));
    }

    private vE u(int n) {
        if (n <= 0) {
            return null;
        }
        CallSite callSite = vP.OOOrs("utbi", 2026137892, 1675099184, 1675099173, 1675099174, -973324939, 857586146, (List)((List)((Object)vP.OOOrs("knkmkggo", 2026137897, 1675099195, 1675099196, 1675099197, -489225248, -981037625, (vP)this)[vP.OOOrs("aqyolphn", 2026137903, 1675099195, 1675099198, 1675099199, 940848374, -1478255937)[2]])));
        while (vP.OOOrs("aqyolphn", 2026137892, 1675099175, 1675099160, 1675099161, -973324939, 857586146, (Iterator)((Object)callSite)) != false) {
            vE vE2 = (vE)((Object)vP.OOOrs("utbi", 2026137892, 1675099175, 1675099162, 1675099163, -973324939, 857586146, (Iterator)((Object)callSite)));
            if (vP.OOOrs("kput", 2026137899, 1675099191, 1675099183, 1675099171, -973324939, 857586146, (vE)vE2) != n) continue;
            return vP.OOOrs("nhdtu", 2026137899, 1675099191, 1675099164, 1675099161, -973324939, 857586146, (vE)vE2) != false ? vE2 : null;
        }
        return null;
    }

    public long y() {
        return (long)vP.OOOrs("rmunzyb", 2026137899, 1675099167, 1675099152, 1675099194, -973324939, 857586146, (AtomicLong)((AtomicLong)((Object)vP.OOOrs("kput", 2026137897, 1675099195, 1675099196, 1675099197, -882438700, 713793658, (vP)this)[vP.OOOrs("nhdtu", 2026137903, 1675099195, 1675099182, 1675099199, -725962424, 1397182612)[5]])));
    }

    public boolean y(int n) {
        return (boolean)(vP.OOOrs("nhdtu", 2026137899, 1675099195, 1675099187, 1675099188, -973324939, 857586146, (vP)this, n) != null ? vP.OOOrs("egchne", 2026137903, 1675099195, 1675099189, 1675099190, -2110045851, -1074040997)[0] : vP.OOOrs("egchne", 2026137903, 1675099195, 1675099189, 1675099190, 1145638932, 914724737)[1]);
    }

    private static void E() {
        B = new boolean[]{false, true};
        M = new boolean[]{true, false, false, true, true, false, false, true};
    }

    public int N(vW vW2) {
        CallSite callSite = vP.OOOrs("rmunzyb", 2026137899, 1675099170, 1675099183, 1675099188, 2026137899, 2026137899, (vW)vW2, (int)vP.OOOrs("utbi", 2026137899, 1675099149, 1675099155, 1675099171, 2026137899, 2026137899, (AtomicInteger)((AtomicInteger)((Object)vP.OOOrs("syxv", 2026137897, 1675099195, 1675099196, 1675099197, 2026137897, 2026137897, (vP)this)[vP.OOOrs("rcixje", 2026137903, 1675099195, 1675099182, 1675099199, 2026137903, 2026137903)[7]]))));
        vP.OOOrs("utbi", 2026137899, 1675099195, 1675099176, 1675099177, 2026137899, 2026137899, (vP)this);
        vP.OOOrs("kput", 2026137892, 1675099184, 1675099150, 1675099151, 2026137892, 2026137892, (List)((List)((Object)vP.OOOrs("nhdtu", 2026137897, 1675099195, 1675099196, 1675099197, 2026137897, 2026137897, (vP)this)[vP.OOOrs("egchne", 2026137903, 1675099195, 1675099198, 1675099199, 2026137903, 2026137903)[0]])), (Object)callSite);
        vP.OOOrs("knkmkggo", 2026137899, 1675099195, 1675099136, 1675099177, 2026137899, 2026137899, (vP)this);
        vP.OOOrs("kput", 2026137899, 1675099195, 1675099182, 1675099177, 2026137899, 2026137899, (vP)this);
        return (int)vP.OOOrs("knkmkggo", 2026137899, 1675099191, 1675099183, 1675099171, 2026137899, 2026137899, (vE)((Object)callSite));
    }

    public boolean N(int n) {
        CallSite callSite = vP.OOOrs("egchne", 2026137899, 1675099195, 1675099187, 1675099188, -973324939, 857586146, (vP)this, n);
        if (callSite == null) {
            return (boolean)vP.OOOrs("rmunzyb", 2026137903, 1675099195, 1675099189, 1675099190, -1940940213, 1575716293)[2];
        }
        vP.OOOrs("aqyolphn", 2026137899, 1675099191, 1675099176, 1675099177, -973324939, 857586146, (vE)((Object)callSite));
        return (boolean)vP.OOOrs("rmunzyb", 2026137903, 1675099195, 1675099189, 1675099190, -1594542195, 167352351)[3];
    }

    private static /* synthetic */ long N(long l) {
        return Long.rotateLeft(-Long.rotateLeft(Long.rotateRight(Long.rotateRight(l, 10), 19), 60), 29);
    }

    public int N(int n, Consumer<vE> consumer, Consumer<vW> consumer2) {
        if (vP.OOOrs("kput", 2026137899, 1675099195, 1675099183, 1675099168, 2026137899, 2026137899, (vP)this, n, consumer) != false) {
            return n;
        }
        CallSite callSite = vP.OOOrs("rmunzyb", 2026137899, 1675099195, 1675099198, 1675099169, 2026137899, 2026137899, (vP)this);
        vP.OOOrs("aqyolphn", 2026137892, 1675099179, 1675099180, 1675099181, 2026137892, 2026137892, consumer2, (Object)callSite);
        return (int)vP.OOOrs("egchne", 2026137899, 1675099170, 1675099183, 1675099171, 2026137899, 2026137899, (vW)((Object)callSite));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean N(long l, vE vE2) {
        CallSite callSite;
        if (vP.OOOrs("egchne", 2026137899, 1675099191, 1675099164, 1675099161, 2026137899, 2026137899, (vE)vE2) == false) {
            if (l - vP.OOOrs("knkmkggo", 2026137899, 1675099191, 1675099153, 1675099194, 2026137899, 2026137899, (vE)vE2) >= vP.OOOrs("knkmkggo", 2026137903, 1675099195, 1675099176, 1675099154, 2026137903, 2026137903)[0]) {
                callSite = vP.OOOrs("egchne", 2026137903, 1675099195, 1675099189, 1675099190, 1458744644, 1758833606)[4];
                return (boolean)callSite;
            }
        }
        callSite = vP.OOOrs("utbi", 2026137903, 1675099195, 1675099189, 1675099190, 2026137903, 2026137903)[5];
        return (boolean)callSite;
    }

    public boolean N(int n, Consumer<vE> consumer) {
        CallSite callSite = vP.OOOrs("tjwriqx", 2026137899, 1675099195, 1675099187, 1675099188, 2026137899, 2026137899, (vP)this, n);
        if (callSite == null) {
            return (boolean)vP.OOOrs("kput", 2026137903, 1675099195, 1675099178, 1675099190, 2026137903, 2026137903)[0];
        }
        vP.OOOrs("utbi", 2026137892, 1675099179, 1675099180, 1675099181, -973324939, 857586146, consumer, (Object)callSite);
        vP.OOOrs("aqyolphn", 2026137899, 1675099195, 1675099182, 1675099177, -973324939, 857586146, (vP)this);
        return (boolean)vP.OOOrs("nhdtu", 2026137903, 1675099195, 1675099178, 1675099190, -710053972, 1686364525)[1];
    }

    public List<vE> N() {
        vP.OOOrs("nhdtu", 2026137899, 1675099195, 1675099176, 1675099177, 2026137899, 2026137899, (vP)this);
        return vP.OOOrs("nhdtu", 2026137893, 1675099184, 1675099165, 1675099166, 2026137893, 2026137893, (Collection)((List)((Object)vP.OOOrs("egchne", 2026137897, 1675099195, 1675099196, 1675099197, 2026137897, 2026137897, (vP)this)[vP.OOOrs("kput", 2026137903, 1675099195, 1675099182, 1675099199, 2026137903, 2026137903)[4]])));
    }

    private static void W() {
        L = new short[]{0, 1, 2, 0, 0, 2, 2, 1};
        i = new short[]{0, 0, 0, 0};
    }

    private static /* synthetic */ int R(int n) {
        return Integer.rotateRight((Integer.rotateRight(-Integer.rotateRight(Integer.rotateRight(n ^ 0x6A1A6C7, 10), 16), 1) ^ 0x2D6A0AB7) + 1, 2);
    }

    private void R() {
        CallSite callSite = vP.OOOrs("utbi", 2026137893, 1675099192, 1675099193, 1675099194, 2026137893, 2026137893);
        vP.OOOrs("tjwriqx", 2026137892, 1675099184, 1675099185, 1675099186, 2026137892, 2026137892, (List)((List)((Object)vP.OOOrs("kput", 2026137897, 1675099195, 1675099196, 1675099197, 2026137897, 2026137897, (vP)this)[vP.OOOrs("kput", 2026137903, 1675099195, 1675099198, 1675099199, 2026137903, 2026137903)[3]])), arg_0 -> vP.N((long)callSite, arg_0));
    }

    private static /* synthetic */ void ntfClinit() {
        OlOqjil = "rw3F O\u00c1'\u00b1\u00a31\u000f>L0|\u00f2+\u00b1\u00a0\u0012\u000f@A\u00fb8\u001bD\u0003i5s\u00ab\t\u00f1\u00bb\u0015\u0013A\u000b\u00efv\\}E^L0|\u00f2+\u00b1\u00a0\u0012\u000f@A\u00ee9\u00d3\b\u0016muN\u00f08\u00fb\u00b4\u000b]g=\u0081^L0|\u00f2+\u00b1\u00a0\u0012\u000f@A\u00d49\u0089\u00db\u0016t5o\u00bfT^L\u0011Y\u00c20\u00cc\u0090\u000bIZ9\u00a6\u00d0\u0012x.\u000e^V8\u0016v;2\u00f1>\u00f7\u00b9I\u0005C\u0000\u00fe8\u00d3 \u0012n.2\u00e5>\u00f1\u00b8\u000f\u0005\u0003/\u00e9\"\u00cc;\u0014I4i\u00e1-\u00fb\u00a7\u0014;j;k\u00e5e\u00eb\u00a1\u000f\n\u0003\b\u00e8#\u0083H\u001eo42\u00d48\u00fb\u00b1\u000f\u0005M\u001a\u00f8v\u00c9f\u00f2-@\u0012t\u00ab\u001ez?\u009a>)\u0016V\u00c0\f\u00e4\u0087#\u000b\u0003\u0018\u00d8v\u00933F O\u00c1'\u00b1\u00a36E\u0002r(x\u00ea>\u00ca\u00bc\u000b\u0003a\u0007\u00f1!\u001cU 1\u0018p#R\u00e2\u00c1\u0003r?|\u00e9u3F O\u00c1'\u00b1\u00a3#L\u00db;j;k\u00e5e\u00eb\u00a1\u000f\n\u0003\b\u00e8#\u0016\u0087\u001eo42\u00d48\u00fb\u00b1\u000f\u0005M\u001a\u00f8v\\\u00bf\u001da,|\u00ab?\u00ea\u00bc\nI_\u001a\u00ef(\u0014\u009eXS.o\u00e1+\u00f3\u00ee\u0096^L0|\u00f2+\u00b1\u00a0\u0012\u000f@A\u00d1$\u0093\u00caL\u00e9\u0006\u00c3\u0016v;2\u00f1>\u00f7\u00b9I\u0015X\u001c\u00f8,\u0081\u0086$t(x\u00e5'\u0099\u0016v;2\u00e8+\u00f0\u00b2I5U\u001d\u00e9(\u0018\u009b\u0016s\u0014x\u00fc>\u00c9\u0016v;2\u00f1>\u00f7\u00b9I\u0005C\u0000\u00fe8\u009e\u00d1\u0012n.2\u00e5>\u00f1\u00b8\u000f\u0005\u0003/\u00e9\"\u0081\u00ca\u0014L5s\u00e3T\u0016v;2\u00f1>\u00f7\u00b9I/X\u000b\u00ef,\u0098Q\u0005x^I\u0096^Ja\u0013d\u00f8$M\u0016v;2\u00f1>\u00f7\u00b9I*E\u001d\u00e9\u00ed9\u0019c(x\u00e9/\u00f0\u00a1'\bH)\u00f89\u00f0^L0|\u00f2+\u00b1\u00b9\u0007\bKA\u00d2/\u008a\u00bd\u0014ta\u00c7R\u0018L3n\u00f0\u00b2\u0016v;2\u00f1>\u00f7\u00b9I\u0000Y\u0000\u00fe9\u0089\u00b7\u0019/\u0019r\u00ea9\u00eb\u00b8\u0003\u0014(;j;k\u00e5e\u00eb\u00a1\u000f\n\u0003-\u00f2!\u0080e\u0014t3r\u00eaq\u00b7\u0099\f\u0007Z\u000f\u00b28\u0098i\u001b/\u0016t\u00f7>\u00a5\u00fb\u0004\u0003e(|\u00f0%\u00eci%X\u001el.x\u00f6z;j;k\u00e5e\u00f2\u00b4\b\u0001\u0003!\u00ff'\u00c41\u0003;sK\u00e95\u008b;j;k\u00e5e\u00f2\u00b4\b\u0001\u0003!\u00ff'\u0089\u00c0\u0003;sG\u00fc\u000e^Z\t;j;k\u00e5e\u00f2\u00b4\b\u0001\u0003!\u00ff'\u00c41\u0003;\u000e\u0012m5k\u00e1\u0003\u00f8\u00df\u0014c?m\u00f0\u00a1";
        l1IsInkjq = new int[]{23920656, 0xE00011, 29294595, 14024714, 33095681, 42205203, 38535169, 29687810, 29818894, 43450376, 10289185, 38600705, 13041679, 0xF10001, 12451842, 16646154, 44367873, 7405571, 41943041, 33554459, 43974662, 39059477, 0x1080001, 30736385, 720929, 6225934, 65546, 29097987, 40435714, 38010888, 4784150, 27918354, 24969223, 42008579, 7143428, 31784980, 37945345, 15859718, 35323944, 25428006, 0xC00003, 0x1550001, 4653058, 30801935, 16252934, 2883611, 22413335, 38666246, 17367097, 33161222, 21102610, 12779524, 22282241, 7602217, 29491203, 40566805, 1};
        vP.W();
        vP.B();
        vP.E();
        vP.Z();
        vP.M();
    }

    private static /* synthetic */ CallSite OOOrs(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = l1IsInkjq[n2 ^ 0x63D7FC38];
        int n8 = n7 >>> 16;
        String string2 = vP.IIls0Oqin(OlOqjil.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x63D7FC38);
        n7 = l1IsInkjq[n3 ^ 0x63D7FC38];
        int n9 = n7 >>> 16;
        String string3 = vP.IIls0Oqin(OlOqjil.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x63D7FC38);
        n7 = l1IsInkjq[n4 ^ 0x63D7FC38];
        int n10 = n7 >>> 16;
        String string4 = vP.IIls0Oqin(OlOqjil.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x63D7FC38);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x78C4699D) + -178;
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

    private static /* synthetic */ CallSite l1qikn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = l1IsInkjq[n2 ^ 0x63D7FC38];
        int n9 = n8 >>> 16;
        String string2 = vP.IIls0Oqin(OlOqjil.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x63D7FC38);
        n8 = l1IsInkjq[n3 ^ 0x63D7FC38];
        int n10 = n8 >>> 16;
        String string3 = vP.IIls0Oqin(OlOqjil.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x63D7FC38);
        n8 = l1IsInkjq[n4 ^ 0x63D7FC38];
        int n11 = n8 >>> 16;
        String string4 = vP.IIls0Oqin(OlOqjil.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x63D7FC38);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x78C4699D) + -178;
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

    private static /* synthetic */ String IIls0Oqin(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{100, 52, -42, 66, -38, -57, 67, 9, -51, -68, -38, 24, 88, 90, -105, 54};
        byte[] byArray3 = new byte[]{-122, 85, -104, -20, -91, -35, 123, -73, 57, 11, -119, 82, -75, 46, 110, 123};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite l1lsO0np(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = l1IsInkjq[n2 ^ 0x63D7FC38];
        int n10 = n9 >>> 16;
        String string2 = vP.IIls0Oqin(OlOqjil.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x63D7FC38);
        n9 = l1IsInkjq[n3 ^ 0x63D7FC38];
        int n11 = n9 >>> 16;
        String string3 = vP.IIls0Oqin(OlOqjil.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x63D7FC38);
        n9 = l1IsInkjq[n4 ^ 0x63D7FC38];
        int n12 = n9 >>> 16;
        String string4 = vP.IIls0Oqin(OlOqjil.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x63D7FC38);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x78C4699D) + -178;
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

    private static /* synthetic */ CallSite lOOqpins(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = l1IsInkjq[n2 ^ 0x63D7FC38];
        int n9 = n8 >>> 16;
        String string2 = vP.IIls0Oqin(OlOqjil.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x63D7FC38);
        n8 = l1IsInkjq[n3 ^ 0x63D7FC38];
        int n10 = n8 >>> 16;
        String string3 = vP.IIls0Oqin(OlOqjil.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x63D7FC38);
        n8 = l1IsInkjq[n4 ^ 0x63D7FC38];
        int n11 = n8 >>> 16;
        String string4 = vP.IIls0Oqin(OlOqjil.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x63D7FC38);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x78C4699D) + -178;
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

    private static /* synthetic */ void IIrprt0r(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[57];
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
        OlOqjil = stringBuilder.toString();
        l1IsInkjq = nArray;
    }
}
