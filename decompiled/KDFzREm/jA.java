/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package KDFzREm;

import KDFzREm.LZ;
import KDFzREm.jC;
import KDFzREm.jF;
import KDFzREm.jS;
import KDFzREm.jf;
import KDFzREm.vB;
import KDFzREm.vL;
import KDFzREm.vM;
import KDFzREm.vU;
import KDFzREm.vi;
import KDFzREm.vu;
import KDFzREm.vy;
import KDFzREm.yM;
import KDFzREm.yU;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class jA {
    private static short[] u;
    private static short[] i;
    private static short[] R;
    private static short[] M;
    private static short[] B;
    private static short[] Z;
    private static short[] z;
    private static boolean[] U;
    public static Object[] N;
    private static byte[] E;
    private static String[] W;
    private static boolean[] m;
    public Object[] y;
    public Object[] L;
    private static short[] P;
    private static short[] s;
    private static /* synthetic */ String lljntIi;
    private static /* synthetic */ int[] lIlpl;

    public AtomicBoolean L() {
        return (AtomicBoolean)((Object)jA.ooklij("gdyag", -733626399, -1754731848, -1754731843, -1754731846, -2058646804, 930091153, -2142542589, (jA)this)[jA.ooklij("xxdmih", -733626393, -1754731848, -1754731845, -1754731844, 1077322378, 91053238, 423966956)[1]]);
    }

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(n, 11), 12), 11), 22) ^ 0xCD1DC93D, 29), 12);
    }

    private static /* synthetic */ String L(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-49, -71, -98, 81, 88, -1, -13, -49, -109, 63, -107, 98, -54, 74, -107, 9};
        int n = 0;
        int n2 = 22;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 37;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public vi M() {
        return (vi)((Object)jA.ooklij("xwncbbf", -733626399, -1754731848, -1754731843, -1754731846, 980960198, 342319158, -2139363244, (jA)this)[jA.ooklij("buelo", -733626393, -1754731848, -1754731884, -1754731844, -1111889314, 259105631, 1317618546)[1]]);
    }

    private void P() {
        CallSite callSite;
        if (jA.ooklij("yarvasdm", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this) == null) {
            jA.ooklij("taxykg", -733626400, -1754731848, -1754731843, -1754731846, -733626400, -733626400, -733626400, (jA)this, (Object[])new Object[jA.ooklij("yarvasdm", -733626393, -1754731848, -1754731877, -1754731876, -733626393, -733626393, -733626393)[0]]);
            callSite = jA.ooklij("idrsznfj", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this);
        }
        if (jA.ooklij("lcjtzjk", -733626399, -1754731848, -1754731847, -1754731846, -733626399, -733626399, -733626399, (jA)this) == null) {
            jA.ooklij("hnclvwat", -733626400, -1754731848, -1754731847, -1754731846, -733626400, -733626400, -733626400, (jA)this, (Object[])new Object[jA.ooklij("buelo", -733626393, -1754731848, -1754731877, -1754731876, -733626393, -733626393, -733626393)[1]]);
            callSite = jA.ooklij("taxykg", -733626399, -1754731848, -1754731847, -1754731846, -733626399, -733626399, -733626399, (jA)this);
        }
    }

    private static void T() {
        U = new boolean[]{true, false, false, true, true, true};
        m = new boolean[]{false, false, true};
    }

    public jA() {
        jA.ooklij("rtij", -733626397, -1754731848, -1754731859, -1754731850, -733626397, -733626397, -733626397, (jA)this);
        vi vi2 = new vi();
        jA.ooklij("xwncbbf", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("yarvasdm", -733626393, -1754731848, -1754731858, -1754731844, -733626393, -733626393, -733626393)[0]] = vi2;
        vu vu2 = new vu();
        jA.ooklij("gdyag", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("awrrbypv", -733626393, -1754731848, -1754731858, -1754731844, -733626393, -733626393, -733626393)[1]] = vu2;
        vy vy2 = new vy();
        jA.ooklij("xxdmih", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("rtij", -733626393, -1754731848, -1754731858, -1754731844, -733626393, -733626393, -733626393)[2]] = vy2;
        AtomicBoolean atomicBoolean = new AtomicBoolean((boolean)jA.ooklij("pybbrzkn", -733626393, -1754731848, -1754731857, -1754731856, -733626393, -733626393, -733626393)[0]);
        jA.ooklij("taxykg", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("awrrbypv", -733626393, -1754731848, -1754731872, -1754731844, -733626393, -733626393, -733626393)[0]] = atomicBoolean;
        AtomicReference atomicReference = new AtomicReference();
        jA.ooklij("hnclvwat", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("rtij", -733626393, -1754731848, -1754731872, -1754731844, -733626393, -733626393, -733626393)[1]] = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        jA.ooklij("rtij", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("xxdmih", -733626393, -1754731848, -1754731872, -1754731844, -733626393, -733626393, -733626393)[2]] = atomicReference2;
        AtomicReference atomicReference3 = new AtomicReference();
        jA.ooklij("xwncbbf", -733626399, -1754731848, -1754731847, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("xxdmih", -733626393, -1754731848, -1754731872, -1754731844, -733626393, -733626393, -733626393)[3]] = atomicReference3;
        AtomicReference atomicReference4 = (AtomicReference)((Object)jA.ooklij("xwncbbf", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("pybbrzkn", -733626393, -1754731848, -1754731872, -1754731844, -733626393, -733626393, -733626393)[4]]);
        jA.ooklij("xxdmih", -733626387, -1754731871, -1754731870, -1754731869, -733626387, -733626387, -733626387, (Object)atomicReference4);
        vU vU2 = new vU(atomicReference4::get);
        jA.ooklij("xxdmih", -733626399, -1754731848, -1754731847, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("buelo", -733626393, -1754731848, -1754731872, -1754731844, -733626393, -733626393, -733626393)[5]] = vU2;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean((boolean)jA.ooklij("lcjtzjk", -733626393, -1754731848, -1754731857, -1754731856, -733626393, -733626393, -733626393)[1]);
        jA.ooklij("xxdmih", -733626399, -1754731848, -1754731847, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("fjxnbo", -733626393, -1754731848, -1754731859, -1754731844, -733626393, -733626393, -733626393)[0]] = atomicBoolean2;
    }

    static {
        jA.ntfClinit();
    }

    public vu B() {
        return (vu)((Object)jA.ooklij("gdyag", -733626399, -1754731848, -1754731843, -1754731846, -2089726130, 1407542637, 1311570279, (jA)this)[jA.ooklij("rtij", -733626393, -1754731848, -1754731884, -1754731844, 1291577821, 315248744, -2008335571)[2]]);
    }

    public void Z() {
        vL vL2 = (vL)((Object)jA.ooklij("awrrbypv", -733626397, -1754731901, -1754731900, -1754731899, 320781364, 1683944137, -1398640255, (AtomicReference)((AtomicReference)((Object)jA.ooklij("hnclvwat", -733626399, -1754731848, -1754731847, -1754731846, 249625783, -91983152, 46589381, (jA)this)[jA.ooklij("xxdmih", -733626393, -1754731848, -1754731867, -1754731844, 1973823319, 718833784, -200553190)[3]]))));
        if (vL2 == null) {
            return;
        }
        jA.ooklij("yarvasdm", -733626397, -1754731898, -1754731849, -1754731850, 320781364, 1683944137, -1398640255, (vL)vL2);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateLeft(-Integer.rotateRight(Integer.rotateRight(n ^ 0x39519DBB, 5) ^ 0x7C4FE316, 31), 30);
    }

    public vU i() {
        return (vU)((Object)jA.ooklij("buelo", -733626399, -1754731848, -1754731847, -1754731846, 243056214, -108300077, -812603688, (jA)this)[jA.ooklij("rtij", -733626393, -1754731848, -1754731845, -1754731844, -1392974987, 1061874607, -1394067546)[5]]);
    }

    private static void s() {
        N = new Object[]{null};
    }

    private static void n() {
        E = new byte[]{6, 3};
    }

    public void m() {
        vL vL2 = (vL)((Object)jA.ooklij("xxdmih", -733626397, -1754731901, -1754731900, -1754731899, 320781364, 1683944137, -1398640255, (AtomicReference)((AtomicReference)((Object)jA.ooklij("pybbrzkn", -733626399, -1754731848, -1754731847, -1754731846, 450338665, -1721486845, -922643152, (jA)this)[jA.ooklij("hnclvwat", -733626393, -1754731848, -1754731867, -1754731844, -1632830813, -295890445, -30712343)[2]]))));
        if (vL2 == null) {
            jA.ooklij("taxykg", -733626387, -1754731788, -1754731787, -1754731786, 320781364, 1683944137, -1398640255, null);
            return;
        }
        jA.ooklij("hnclvwat", -733626397, -1754731898, -1754731847, -1754731785, 320781364, 1683944137, -1398640255, (vL)vL2);
    }

    private void t() {
        jC jC2 = (jC)((Object)jA.ooklij("yarvasdm", -733626397, -1754731901, -1754731900, -1754731899, 320781364, 1683944137, -1398640255, (AtomicReference)((AtomicReference)((Object)jA.ooklij("xwncbbf", -733626399, -1754731848, -1754731843, -1754731846, -1622925690, -828724096, -480097138, (jA)this)[jA.ooklij("lcjtzjk", -733626393, -1754731848, -1754731884, -1754731844, -1920803094, -692626167, -347084861)[0]]))));
        if (jC2 != null) {
            jA.ooklij("rtij", -733626397, -1754731791, -1754731849, -1754731850, 320781364, 1683944137, -1398640255, (jC)jC2);
        }
    }

    private static void v() {
        W = new String[]{"startSocketConnection called twice - ignoring", "packet and state must not be null", "SSL init failed. Disabling auto reconnect."};
    }

    private static void j() {
        R = new short[]{0, 1, 2};
        z = new short[]{3, 4, 5, 0, 4, 1};
        P = new short[]{2, 2, 0, 3, 1, 1, 3, 2};
        i = new short[]{3, 1};
        u = new short[]{5, 0, 2, 1, 3, 2};
        M = new short[]{1, 4, 0, 0, 0, 4};
        B = new short[]{5, 0, 1};
        Z = new short[]{2, 3, 4, 5, 0, 1, 2};
        s = new short[]{3, 0};
    }

    public AtomicReference<jC> U() {
        return (AtomicReference)((Object)jA.ooklij("pybbrzkn", -733626399, -1754731848, -1754731843, -1754731846, 125813459, -283436948, -799401099, (jA)this)[jA.ooklij("taxykg", -733626393, -1754731848, -1754731845, -1754731844, -827297271, 966136094, -693064327)[3]]);
    }

    public void z() {
        if (jA.ooklij("gdyag", -733626397, -1754731855, -1754731784, -1754731783, -733626397, -733626397, -733626397, (AtomicBoolean)((AtomicBoolean)((Object)jA.ooklij("lcjtzjk", -733626399, -1754731848, -1754731847, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("xxdmih", -733626393, -1754731848, -1754731859, -1754731844, -733626393, -733626393, -733626393)[1]])), (boolean)jA.ooklij("pybbrzkn", -733626393, -1754731848, -1754731857, -1754731856, -733626393, -733626393, -733626393)[2], (boolean)jA.ooklij("fjxnbo", -733626393, -1754731848, -1754731857, -1754731856, -733626393, -733626393, -733626393)[3]) == false) {
            jA.ooklij("rtij", -733626388, -1754731862, -1754731782, -1754731860, 320781364, 1683944137, -1398640255, (Logger)((Logger)jA.ooklij("yarvasdm", -733626393, -1754731848, -1754731849, -1754731846, 1035112562, 1849778162, 977528240)[jA.ooklij("gdyag", -733626393, -1754731848, -1754731859, -1754731844, -178768182, -1941953470, -538383799)[2]]), (String)((Object)jA.ooklij("buelo", -733626393, -1754731848, -1754731864, -1754731863, 859936117, -1227815777, -2017330726)[0]));
            return;
        }
        jA.ooklij("pybbrzkn", -733626397, -1754731855, -1754731854, -1754731853, -733626397, -733626397, -733626397, (AtomicBoolean)((AtomicBoolean)((Object)jA.ooklij("hnclvwat", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("fjxnbo", -733626393, -1754731848, -1754731859, -1754731844, -733626393, -733626393, -733626393)[3]])), (boolean)jA.ooklij("taxykg", -733626393, -1754731848, -1754731857, -1754731856, -733626393, -733626393, -733626393)[4]);
        CallSite callSite = jA.ooklij("hnclvwat", -733626387, -1754731868, -1754731858, -1754731781, -733626387, -733626387, -733626387);
        CallSite callSite2 = jA.ooklij("rtij", -733626397, -1754731780, -1754731887, -1754731779, -733626397, -733626397, -733626397, (vu)((vu)((Object)jA.ooklij("awrrbypv", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("idrsznfj", -733626393, -1754731848, -1754731859, -1754731844, -733626393, -733626393, -733626393)[4]])));
        vu vu2 = (vu)((Object)jA.ooklij("fjxnbo", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("buelo", -733626393, -1754731848, -1754731859, -1754731844, -733626393, -733626393, -733626393)[5]]);
        jA.ooklij("xxdmih", -733626387, -1754731871, -1754731870, -1754731869, -733626387, -733626387, -733626387, (Object)vu2);
        Supplier<Object> supplier = vu2::i;
        AtomicBoolean atomicBoolean = (AtomicBoolean)((Object)jA.ooklij("rtij", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("gdyag", -733626393, -1754731848, -1754731859, -1754731844, -733626393, -733626393, -733626393)[6]]);
        jA.ooklij("rtij", -733626387, -1754731871, -1754731870, -1754731869, -733626387, -733626387, -733626387, (Object)atomicBoolean);
        jS jS2 = new jS(supplier, atomicBoolean::get, this::t, (long)jA.ooklij("awrrbypv", -733626397, -1754731868, -1754731887, -1754731778, -733626397, -733626397, -733626397, (jf)((Object)callSite)));
        CallSite callSite3 = jA.ooklij("buelo", -733626397, -1754731848, -1754731849, -1754731777, -733626397, -733626397, -733626397, (jA)this, (EventLoopGroup)callSite2, (jf)((Object)callSite), (jS)jS2);
        Supplier<Object> supplier2 = () -> jA.N((Bootstrap)callSite3, (jf)((Object)callSite));
        vy vy2 = (vy)((Object)jA.ooklij("taxykg", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("gdyag", -733626393, -1754731848, -1754731859, -1754731844, -733626393, -733626393, -733626393)[7]]);
        AtomicBoolean atomicBoolean2 = (AtomicBoolean)((Object)jA.ooklij("rtij", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("taxykg", -733626393, -1754731848, -1754731851, -1754731844, -733626393, -733626393, -733626393)[0]]);
        jA.ooklij("gdyag", -733626387, -1754731871, -1754731870, -1754731869, -733626387, -733626387, -733626387, (Object)atomicBoolean2);
        BooleanSupplier booleanSupplier = atomicBoolean2::get;
        vu vu3 = (vu)((Object)jA.ooklij("lcjtzjk", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("lcjtzjk", -733626393, -1754731848, -1754731851, -1754731844, -733626393, -733626393, -733626393)[1]]);
        jA.ooklij("taxykg", -733626387, -1754731871, -1754731870, -1754731869, -733626387, -733626387, -733626387, (Object)vu3);
        jC jC2 = new jC(supplier2, vy2, jS2, booleanSupplier, vu3::y);
        jA.ooklij("xwncbbf", -733626397, -1754731901, -1754731854, -1754731792, -733626397, -733626397, -733626397, (AtomicReference)((AtomicReference)((Object)jA.ooklij("awrrbypv", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("xwncbbf", -733626393, -1754731848, -1754731887, -1754731844, -733626393, -733626393, -733626393)[0]])), (Object)jC2);
        jA.ooklij("taxykg", -733626397, -1754731901, -1754731854, -1754731792, -733626397, -733626397, -733626397, (AtomicReference)((AtomicReference)((Object)jA.ooklij("taxykg", -733626399, -1754731848, -1754731847, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("awrrbypv", -733626393, -1754731848, -1754731887, -1754731844, -733626393, -733626393, -733626393)[1]])), (Object)new vL((vy)((Object)jA.ooklij("gdyag", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("rtij", -733626393, -1754731848, -1754731887, -1754731844, -733626393, -733626393, -733626393)[2]]), jS2, (vu)((Object)jA.ooklij("idrsznfj", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("pybbrzkn", -733626393, -1754731848, -1754731887, -1754731844, -733626393, -733626393, -733626393)[3]]), (AtomicBoolean)((Object)jA.ooklij("yarvasdm", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("buelo", -733626393, -1754731848, -1754731887, -1754731844, -733626393, -733626393, -733626393)[4]])));
        jA.ooklij("awrrbypv", -733626397, -1754731791, -1754731849, -1754731850, -733626397, -733626397, -733626397, (jC)jC2);
    }

    public AtomicReference<vL> u() {
        return (AtomicReference)((Object)jA.ooklij("gdyag", -733626399, -1754731848, -1754731847, -1754731846, 2013398859, -23296504, -1059088074, (jA)this)[jA.ooklij("idrsznfj", -733626393, -1754731848, -1754731845, -1754731844, -347843031, -1827419302, 2041957126)[4]]);
    }

    private static /* synthetic */ int u(int n) {
        return -Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 21) ^ 0xCEC84888, 15), 4);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(-Integer.rotateRight(Integer.rotateRight(-n, 17) ^ 0x3592C7E4, 7) ^ 0x18E72304, 28);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{32, -38, -76, -77, -81, -22, -40, 2, -76, 32, 57, -116, 106, 97, -59, 96};
        int n = 0;
        int n2 = 66;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 225;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public vy y() {
        return (vy)((Object)jA.ooklij("gdyag", -733626399, -1754731848, -1754731843, -1754731846, 1992806540, 933338260, -132473385, (jA)this)[jA.ooklij("buelo", -733626393, -1754731848, -1754731845, -1754731844, 1978621576, 530097743, -1455177155)[0]]);
    }

    public List<String> E() {
        return jA.ooklij("rtij", -733626397, -1754731790, -1754731849, -1754731789, 320781364, 1683944137, -1398640255, (vi)((vi)((Object)jA.ooklij("lcjtzjk", -733626399, -1754731848, -1754731843, -1754731846, -1131931543, 1627506509, -494685299, (jA)this)[jA.ooklij("xxdmih", -733626393, -1754731848, -1754731867, -1754731844, 1679465940, -1420803240, -859203481)[4]])));
    }

    public void N(yM<?> yM2, yU yU2, ChannelFutureListener channelFutureListener) {
        if (yM2 == null || yU2 == null) {
            throw new IllegalArgumentException((String)((Object)jA.ooklij("fjxnbo", -733626393, -1754731848, -1754731864, -1754731863, 51698618, 271102980, 262042621)[1]));
        }
        jF jF2 = (jF)((Object)jA.ooklij("awrrbypv", -733626397, -1754731901, -1754731900, -1754731899, -733626397, -733626397, -733626397, (AtomicReference)((AtomicReference)((Object)jA.ooklij("xwncbbf", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("idrsznfj", -733626393, -1754731848, -1754731867, -1754731844, -733626393, -733626393, -733626393)[1]]))));
        if (jF2 == null) {
            return;
        }
        jA.ooklij("xxdmih", -733626397, -1754731897, -1754731849, -1754731888, -733626397, -733626397, -733626397, (jF)jF2, yM2, (yU)yU2, (ChannelFutureListener)channelFutureListener);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(n, 8), 9) ^ 0xAB27B385, 26), 4);
    }

    public void N(yM<LZ> yM2) {
        jA.ooklij("buelo", -733626397, -1754731848, -1754731849, -1754731873, -733626397, -733626397, -733626397, (jA)this, yM2, (yU)((yU)((Object)jA.ooklij("xwncbbf", -733626393, -1754731875, -1754731874, -1754731846, -733626393, -733626393, -733626393)[jA.ooklij("buelo", -733626393, -1754731848, -1754731867, -1754731844, -733626393, -733626393, -733626393)[0]])));
    }

    private static /* synthetic */ String N(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-116, 106, -93, -110, 18, -77, 105, 94, 64, -54, 100, -78, -113, 36, 75, 81};
        int n = 0;
        int n2 = 205;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 169;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ ChannelFuture N(Bootstrap bootstrap, jf jf2) {
        return jA.ooklij("idrsznfj", -733626397, -1754731880, -1754731879, -1754731878, -733626397, -733626397, -733626397, (Bootstrap)bootstrap, (String)((Object)jA.ooklij("xxdmih", -733626397, -1754731868, -1754731867, -1754731866, -733626397, -733626397, -733626397, (jf)jf2)), (int)jA.ooklij("hnclvwat", -733626397, -1754731868, -1754731847, -1754731865, -733626397, -733626397, -733626397, (jf)jf2));
    }

    private Bootstrap N(EventLoopGroup eventLoopGroup, jf jf2, jS jS2) {
        vM vM2 = new vM();
        Supplier<Object> supplier = () -> new jF(this);
        AtomicReference atomicReference = (AtomicReference)((Object)jA.ooklij("idrsznfj", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("gdyag", -733626393, -1754731848, -1754731867, -1754731844, -733626393, -733626393, -733626393)[5]]);
        jA.ooklij("hnclvwat", -733626387, -1754731871, -1754731870, -1754731869, -733626387, -733626387, -733626387, (Object)atomicReference);
        vB vB2 = new vB(jf2, vM2, supplier, atomicReference::set, () -> {
            jA.ooklij("xwncbbf", -733626397, -1754731855, -1754731854, -1754731853, 320781364, 1683944137, -1398640255, (AtomicBoolean)((AtomicBoolean)((Object)jA.ooklij("lcjtzjk", -733626399, -1754731848, -1754731843, -1754731846, 62875131, -1632972918, 141986844, (jA)this)[jA.ooklij("taxykg", -733626393, -1754731848, -1754731842, -1754731844, 2084470672, -1502591246, 536275267)[0]])), (boolean)jA.ooklij("fjxnbo", -733626393, -1754731848, -1754731841, -1754731856, -452214419, -1432585617, 856421760)[0]);
            jA.ooklij("gdyag", -733626397, -1754731852, -1754731851, -1754731850, 320781364, 1683944137, -1398640255, (jS)jS2);
            jA.ooklij("xxdmih", -733626388, -1754731862, -1754731861, -1754731860, 320781364, 1683944137, -1398640255, (Logger)((Logger)jA.ooklij("rtij", -733626393, -1754731848, -1754731849, -1754731846, 1526196510, 2081796652, -233760402)[jA.ooklij("idrsznfj", -733626393, -1754731848, -1754731842, -1754731844, 838463440, -1899191486, 873340026)[1]]), (String)((Object)jA.ooklij("rtij", -733626393, -1754731848, -1754731864, -1754731863, -853799179, -1629450102, -1581433053)[2]));
            jA.ooklij("hnclvwat", -733626397, -1754731848, -1754731841, -1754731850, 320781364, 1683944137, -1398640255, (jA)this);
        });
        return (Bootstrap)jA.ooklij("xwncbbf", -733626397, -1754731880, -1754731903, -1754731902, -733626397, -733626397, -733626397, (Bootstrap)((Bootstrap)jA.ooklij("xwncbbf", -733626397, -1754731880, -1754731889, -1754731904, -733626397, -733626397, -733626397, (Bootstrap)((Bootstrap)jA.ooklij("xxdmih", -733626397, -1754731880, -1754731881, -1754731896, -733626397, -733626397, -733626397, (Bootstrap)((Bootstrap)jA.ooklij("buelo", -733626397, -1754731880, -1754731883, -1754731882, -733626397, -733626397, -733626397, (Bootstrap)new Bootstrap(), (EventLoopGroup)eventLoopGroup)), NioSocketChannel.class)), (ChannelOption)jA.ooklij("rtij", -733626393, -1754731895, -1754731894, -1754731893, -733626393, -733626393, -733626393), (Object)jA.ooklij("xxdmih", -733626387, -1754731892, -1754731891, -1754731890, -733626387, -733626387, -733626387, (boolean)jA.ooklij("pybbrzkn", -733626393, -1754731848, -1754731857, -1754731856, -733626393, -733626393, -733626393)[5]))), (ChannelHandler)vB2);
    }

    public AtomicBoolean N() {
        return (AtomicBoolean)((Object)jA.ooklij("hnclvwat", -733626399, -1754731848, -1754731847, -1754731846, 1458328024, -875362051, -1116218601, (jA)this)[jA.ooklij("rtij", -733626393, -1754731848, -1754731845, -1754731844, 1051060788, -406230150, -1178874075)[6]]);
    }

    public void N(yM<?> yM2, yU yU2) {
        jA.ooklij("xwncbbf", -733626397, -1754731848, -1754731849, -1754731888, -733626397, -733626397, -733626397, (jA)this, yM2, (yU)yU2, null);
    }

    public AtomicReference<jF> W() {
        return (AtomicReference)((Object)jA.ooklij("awrrbypv", -733626399, -1754731848, -1754731843, -1754731846, 987059177, -2094408861, -448001264, (jA)this)[jA.ooklij("rtij", -733626393, -1754731848, -1754731845, -1754731844, -1723307225, -577324648, -648663167)[2]]);
    }

    public boolean R() {
        return (boolean)jA.ooklij("xwncbbf", -733626397, -1754731886, -1754731843, -1754731885, -733626397, -733626397, -733626397, (vy)((vy)((Object)jA.ooklij("xwncbbf", -733626399, -1754731848, -1754731843, -1754731846, -733626399, -733626399, -733626399, (jA)this)[jA.ooklij("gdyag", -733626393, -1754731848, -1754731887, -1754731844, -733626393, -733626393, -733626393)[5]])));
    }

    private static /* synthetic */ void ntfClinit() {
        jA.OOnOsrsI(new String[]{"\u0000.\u0000I\u0087t \r\u00c4\u00f5\u00ad\u00eb\u00ca\u0004\r\u00fa'an\u00bb\u00caTf'\u009d\u00fe\u00a6\u00eb\u00f2\u0012M\u00e9\bro\u00a0\u00df\u0003`.\u0082\u00f4\u00e7\u00f1\u00db\tV\u00e0`bo\u00ba\u00dbK=\u0010\u008a\u00eb\u00e7\u00de\u00dc\u000eV\u00eb.ct\u0097\u00c0W=\u0011\u009f\u00e9\u00a9\u00ef\u0085\u0000,\u0000\u0001\u00cc\u0000?\u0000\nK|\u000f\u0018\u00b9\u00de\u00a5\u00b0\u00d4;\u0000\u0017\u0000\u0001D\u0000;\u0000+mY?\u0003\u00c4\u00ee\u00bc\u00f6\u00d2RA\u00f6!cu\u00a7u]'\u0016\u00c4\u00fa\u00bc\u00f0\u00d3\u0014A\u00b6\u000eto\u00b8n[\u001b\u0007\u008d\u00fe\u00ba\u00fa\u00d0\u001eG\u00007\u0000\u0006~H=\u000b\u0084\u00f5\u0000\u001f\u0000\u0003(\u0011\u0000\u0000$\u0000\u0002\u00b7z\u0000\u0004\u0000\u0002\u00b7k\u0000\u001b\u0000&/t#\u0003\u009d\u00fa\u00e7\u00f3\u00df\u0013E\u00b6\u0000bj\u00b0dLrK\u00a7\u00f1\u00a9\u00e9\u00dfRN\u00f8!g/\u009aeR,\u0001\u009f\u00a0\u0000\n\u0000\u0003j]=\u0000M\u0000\u000ftW$\u0012\u0087\u00fe\u00bc\u00fa\u00da;W\u00ed:re\u0000A\u0000\u0005\u00cbb\u0013K\u00b1\u0000\u0003\u0000\u0001\u0004\u0000*\u0000\nR|\u000f\u0018\u00b9\u00de\u00a5\u00b0\u00c8\u0004\u0000\"\u00005at#\u0003\u009d\u00fa\u00e7\u00f3\u00df\u0013E\u00b6\u001ctr\u00bc'_r+\u00c2\u00d7\u00a1\u00f0\u0091\u0013G\u00ed;y/\u00b6!Y'\f\u008e\u00f7\u00e7\u00dc\u00d6\u001cL\u00f7*lF\u00a0=M;\u0007\u00d0\u0000H\u0000\u0015\u00fat#\u0003\u009d\u00fa\u00e7\u00f3\u00df\u0013E\u00b6\u0000bj\u00e9\u00b1LrK\u00bd\u00003\u0000 \u0012Q&M\u0085\u00fe\u00bc\u00eb\u00c7RA\u00f1.nn\u00b02\u0017\n\n\u008a\u00f5\u00a6\u00fa\u00d22R\u00ed&on\u00ee\u0000&\u0000.\u00a7L(\u0016\u0082\u00f8\u008e\u00f6\u00db\u0011F\u00ea\u001000\u00e1\u00e1Y~\u0004\u00d2\u00ad\u00f9\u00ad\u0089\u001b\u0011\u00a1}5b\u00ec\u00ed\u000ex[\u00d9\u00f9\u00ab\u00ab\u008a\u001b@\u00a1{4\u0000\u000f\u0000\u0001N\u0000!\u0000\u0007\u0080W'\f\u008e\u00f8\u00bc\u0000F\u0000\u0003\u00fc\u0011\u0003\u0000\u0012\u0000\u001f&J.M\u008a\u00eb\u00a9\u00fc\u00d6\u0018\r\u00f5 gg\u00bc'_f\u000e\u0084\u00fc\u00fc\u00f5\u00911M\u00fe(er\u00004\u0000\u0011\u0086Y?\u0003\u00c4\u00f7\u00a9\u00f1\u00d9R`\u00f6 le\u00ed\u0082\u0000\u0001\u0000\u0001\u009a\u0000\u0013\u0000\u0005;J;\r\u0099\u0000\u001a\u0000\u000ek]8\u0017\u0082\u00e9\u00ad\u00d1\u00d1\u0013l\u00ec#l\u0000\u0000\u0000\n\u009d|\u000f\u0018\u00b9\u00de\u00a5\u00b0\u00d4<\u0000\r\u0000\u0001~\u00009\u0000\u0007.Y'\u0006\u0087\u00fe\u00ba\u0000C\u0000\u000ev\u0011\u0005)\u00af\u00dd\u00b2\u00cd\u00fb\u0010\r\u00f3);\u0000E\u0000#\u0013\u0011\u0005\u000b\u0084\u00b4\u00a6\u00fa\u00ca\t[\u00b6,ha\u00e2U]%M\u00ae\u00ed\u00ad\u00f1\u00ca1M\u00f6?Gr\u00e3NHr\u00001\u0000\u001e\u008aWf\f\u008e\u00ef\u00bc\u00e6\u0091\u001eJ\u00f8!ne\u00e0\u00cc{!\u0003\u0085\u00f5\u00ad\u00f3\u00f1\rV\u00f0 n\u0000>\u0000\n\u00e4|\u000f\u0018\u00b9\u00de\u00a5\u00b0\u00c81\u0000\u0002\u0000\u0013\u0012t#\u0003\u009d\u00fa\u00e7\u00f3\u00df\u0013E\u00b6\u0000bj\u00b0*Lr\u0000K\u0000\u0012/\u0011\u0005\b\u008a\u00ed\u00a9\u00b0\u00cb\tK\u00f5`Li\u00a6s\u0003\u0000L\u0000&\u00e4Y?\u0003\u00c4\u00ee\u00bc\u00f6\u00d2RA\u00f6!cu\u00fe\u00fc]'\u0016\u00c4\u00d8\u00a7\u00f2\u00ce\u0011G\u00ed.bl\u00e9\u00c8M=\u0017\u0099\u00fe\u0000\u0011\u0000\u0013\u00b8t#\u0003\u009d\u00fa\u00e7\u00f3\u00df\u0013E\u00b6\u001ctr\u00e5\u008d_r\u0000J\u0000\nR|\u000f\u0018\u00b9\u00de\u00a5\u00b0\u00c8\u0014\u0000-\u0000\u0005pJ&\u0017\u009b\u0000\u0019\u0000\u0011,Y?\u0003\u00c4\u00ee\u00bc\u00f6\u00d2Rm\u00fb%ec\u00f85\u0000/\u0000\u0007cP(\f\u0085\u00fe\u00a4\u00002\u0000\u000b\u001d{\u0019=\u00a5\u00d4\u008c\u00da\u00f2<{\u0000\u0005\u0000\u0001w\u0000\u001d\u0000\u0001Z\u0000@\u0000\r\u00b5W$\u0012\u008a\u00e9\u00ad\u00de\u00d0\u0019q\u00fc;\u0000\t\u0000),Y?\u0003\u00c4\u00ee\u00bc\u00f6\u00d2RA\u00f6!cu\u00fe4]'\u0016\u00c4\u00fa\u00bc\u00f0\u00d3\u0014A\u00b6\u000eto\u00e1/[\u000b\r\u0084\u00f7\u00ad\u00fe\u00d0\u0000<\u0000\u0003\u00e9]=\u0000)\u0000\u00013\u0000\u0016\u0000\u0001\u0086\u0000'\u0000\u001b9t\u0002&\u00ad\u00e1\u009a\u00da\u00d3R[\u00d4tLK\u0091WB\u001b'\u0086\u00b4\u00b1\u00ca\u0085Tt\u0000\u000e\u0000\u0003\u0087\u0011\u001f\u0000\f\u0000\n\u00c5|\u000f\u0018\u00b9\u00de\u00a5\u00b0\u00d4.\u0000\u001e\u0000\u0014\u0087\u0011\u0005\b\u008a\u00ed\u00a9\u00b0\u00d2\u001cL\u00fe`St\u00a7\u00c6V.Y\u0000(\u0000C\u00fat\u0002&\u00ad\u00e1\u009a\u00da\u00d3R[\u00d4tLK\u00c8\u0094B\u001b'\u0086\u00b4\u00b1\u00ca\u00851K\u00f6`ne\u00f8\u00a6Af\u0001\u0083\u00fa\u00a6\u00f1\u00db\u0011\r\u00da'an\u00e2\u00b7T\u000f\u0017\u009f\u00ee\u00ba\u00fa\u00f2\u0014Q\u00ed*ne\u00fe\u00e9\u0011\u001f\u0000D\u0000\n\u00a7|\u000f\u0018\u00b9\u00de\u00a5\u00b0\u00c8\b\u0000\u0015\u0000\u0001k\u0000\u0018\u0000\u0001\u00a8\u0000\u0014\u0000\u0015\u00c4t#\u0003\u009d\u00fa\u00e7\u00f3\u00df\u0013E\u00b6\u001ctr\u00e5\u0082_rK\u00bd\u0000\u0010\u0000\u0001\u0081\u0000G\u0000Y9t \r\u00c4\u00f5\u00ad\u00eb\u00ca\u0004\r\u00fa'an\u00bbtTf'\u009d\u00fe\u00a6\u00eb\u00f2\u0012M\u00e9\bro\u00a0a\u0003\u0005)\u00af\u00dd\u00b2\u00cd\u00fb\u0010\r\u00f3);L\u009eU~30\u00ae\u00f6\u00e7\u00f5\u00edF\u000b\u00d5&o/\u00bbtL=\u001b\u00c4\u00f9\u00a7\u00f0\u00ca\u000eV\u00eb.p/\u0097~W=\u0011\u009f\u00e9\u00a9\u00ef\u0085\u0000B\u0000\u0004>Y;\f\u0000I\u0000\n\r|\u000f\u0018\u00b9\u00de\u00a5\u00b0\u00d4>\u0000\b\u0000\u0002\u0089b\u00005\u0000\u0007MY%\u0017\u008e\u00d4\u00ae\u0000=\u0000\u0014?\u0011\u0005\b\u008a\u00ed\u00a9\u00b0\u00d2\u001cL\u00fe`Ob\u00e6r[=Y\u0000%\u0000\np|\u000f\u0018\u00b9\u00de\u00a5\u00b0\u00c7(\u0000\u0006\u0000\u0001\u00a7\u0000 \u0000\u001c\u00bfWf\f\u008e\u00ef\u00bc\u00e6\u0091\u001fM\u00f6;st\u00fe\u00b7Hf \u0084\u00f4\u00bc\u00ec\u00ca\u000fC\u00e9\u00006\u0000\u0016\u00fcb`.\u0081\u00fa\u00be\u00fe\u0091\u0011C\u00f7(/B\u00ba\u00bbT,\u0003\u0085\u00a0\u0000#\u0000\u0001\u001b\u0000\u0007\u0000\u0001|\u0000\u000b\u0000\u0004/b`4\u00008\u0000Z\u00fat \r\u00c4\u00f5\u00ad\u00eb\u00ca\u0004\r\u00fa'an\u00e2\u00b7Tf!\u0083\u00fa\u00a6\u00f1\u00db\u0011m\u00e9;io\u00e2\u00e9t#\u0003\u009d\u00fa\u00e7\u00f3\u00df\u0013E\u00b6\u0000bj\u00e9\u00b1LrK\u00a7\u00f2\u00a7\u00b0\u00d0\u0018V\u00ed6/b\u00e3\u00bdL:\u0016\u0099\u00fa\u00b8\u00b0\u00ff\u001fQ\u00ed=ac\u00f8\u0090W&\u0016\u0098\u00ef\u00ba\u00fe\u00ceF\u0000\u001c\u0000\n\u00c5|\u000f\u0018\u00b9\u00de\u00a5\u00b0\u00d4\u001b\u0000+\u0000\u0003/\u0011\u0013\u0000O\u0000*(\u0011\u0005\b\u008a\u00ed\u00a9\u00b0\u00cb\tK\u00f5`co\u00bbcM;\u0010\u008e\u00f5\u00bc\u00b0\u00fd\u0012O\u00e9#et\u00b4bT,$\u009e\u00ef\u00bd\u00ed\u00dbF\u0000:\u0000I1t \r\u00c4\u00f5\u00ad\u00eb\u00ca\u0004\r\u00fa'an\u00bb|Tf!\u0083\u00fa\u00a6\u00f1\u00db\u0011j\u00f8!dl\u00b0k\u0003`.\u0082\u00f4\u00e7\u00f1\u00db\tV\u00e0`bo\u00bamK=\u0010\u008a\u00eb\u00e7\u00de\u00dc\u000eV\u00eb.ct\u0097vW=\u0011\u009f\u00e9\u00a9\u00ef\u0085\u0000N\u0000<\u0087t#\u0003\u009d\u00fa\u00e7\u00f3\u00df\u0013E\u00b6\u0000bj\u00b0\u00ccLrK\u00a7\u00f1\u00a9\u00e9\u00dfRW\u00ed&l/\u00b6\u00c0V*\u0017\u0099\u00e9\u00ad\u00f1\u00caRa\u00f6\"pl\u00b0\u00dbY+\u000e\u008e\u00dd\u00bd\u00eb\u00cb\u000fG\u00a2\u00000\u00009\u00fet#\u0003\u009d\u00fa\u00e7\u00f3\u00df\u0013E\u00b6\fla\u00ff\u00a5\u0003`.\u0082\u00f4\u00e7\u00f1\u00db\tV\u00e0`bo\u00e3\u00a2K=\u0010\u008a\u00eb\u00e7\u00de\u00dc\u000eV\u00eb.ct\u00ce\u00b9W=\u0011\u009f\u00e9\u00a9\u00ef\u0085"});
        jA.j();
        jA.n();
        jA.T();
        jA.v();
        jA.s();
        jA.N[0] = LogManager.getLogger(String.class);
    }

    private static /* synthetic */ CallSite ooklij(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lIlpl[n2 ^ 0x9768EAB8];
        int n9 = n8 >>> 16;
        String string2 = jA.I1nnlp(lljntIi.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x9768EAB8);
        n8 = lIlpl[n3 ^ 0x9768EAB8];
        int n10 = n8 >>> 16;
        String string3 = jA.I1nnlp(lljntIi.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x9768EAB8);
        n8 = lIlpl[n4 ^ 0x9768EAB8];
        int n11 = n8 >>> 16;
        String string4 = jA.I1nnlp(lljntIi.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x9768EAB8);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xD445BF55) + -178;
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

    private static /* synthetic */ void OOnOsrsI(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[80];
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
        lljntIi = stringBuilder.toString();
        lIlpl = nArray;
    }

    private static /* synthetic */ String I1nnlp(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-47, 5, -58, 61, -42, -104, -105, 7, -64, 126, -22, 95, -113, -56, 50, 3};
        byte[] byArray3 = new byte[]{-97, -8, 26, 116, -51, 82, 41, -28, -49, 110, 41, 47, 28, 56, 40, 101};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite lOrik0ktO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = lIlpl[n2 ^ 0x9768EAB8];
        int n7 = n6 >>> 16;
        String string2 = jA.I1nnlp(lljntIi.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x9768EAB8);
        n6 = lIlpl[n3 ^ 0x9768EAB8];
        int n8 = n6 >>> 16;
        String string3 = jA.I1nnlp(lljntIi.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x9768EAB8);
        n6 = lIlpl[n4 ^ 0x9768EAB8];
        int n9 = n6 >>> 16;
        String string4 = jA.I1nnlp(lljntIi.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x9768EAB8);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xD445BF55) + -178;
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

    private static /* synthetic */ CallSite lIjsqiktj(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = lIlpl[n2 ^ 0x9768EAB8];
        int n10 = n9 >>> 16;
        String string2 = jA.I1nnlp(lljntIi.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x9768EAB8);
        n9 = lIlpl[n3 ^ 0x9768EAB8];
        int n11 = n9 >>> 16;
        String string3 = jA.I1nnlp(lljntIi.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x9768EAB8);
        n9 = lIlpl[n4 ^ 0x9768EAB8];
        int n12 = n9 >>> 16;
        String string4 = jA.I1nnlp(lljntIi.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x9768EAB8);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xD445BF55) + -178;
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

    private static /* synthetic */ CallSite Ilt0nm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = lIlpl[n2 ^ 0x9768EAB8];
        int n7 = n6 >>> 16;
        String string2 = jA.I1nnlp(lljntIi.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x9768EAB8);
        n6 = lIlpl[n3 ^ 0x9768EAB8];
        int n8 = n6 >>> 16;
        String string3 = jA.I1nnlp(lljntIi.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x9768EAB8);
        n6 = lIlpl[n4 ^ 0x9768EAB8];
        int n9 = n6 >>> 16;
        String string4 = jA.I1nnlp(lljntIi.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x9768EAB8);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xD445BF55) + -178;
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
