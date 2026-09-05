/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.DiscordIPC
 *  fun.crashsystem.jdrpc.DiscordIPCConfig
 *  fun.crashsystem.jdrpc.DiscordIPCConfig$DiscordIPCConfigBuilder
 *  fun.crashsystem.jdrpc.activity.Activity
 *  fun.crashsystem.jdrpc.activity.Activity$Builder
 *  fun.crashsystem.jdrpc.activity.ActivityType
 *  fun.crashsystem.jdrpc.event.DiscordEventListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package KDFzREm;

import KDFzREm.kb;
import KDFzREm.mR;
import fun.crashsystem.jdrpc.DiscordIPC;
import fun.crashsystem.jdrpc.DiscordIPCConfig;
import fun.crashsystem.jdrpc.activity.Activity;
import fun.crashsystem.jdrpc.activity.ActivityType;
import fun.crashsystem.jdrpc.event.DiscordEventListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.management.RuntimeMXBean;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mi {
    private static short[] L;
    private static String[] u;
    private static short[] i;
    public static Object[] N;
    private static long[] R;
    private static short[] M;
    private static short[] B;
    private static String[] Z;
    private static byte[] z;
    private static short[] U;
    private static boolean[] E;
    private static short[] W;
    private static boolean[] m;
    public Object[] y;
    private static /* synthetic */ String OOs0lqr;
    private static /* synthetic */ int[] oo0rnOOI0;

    private static /* synthetic */ String L(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-118, -28, -78, -121, -59, 28, -81, -76, 57, -65, 57, 46, -88, -127, 63, 119};
        int n = 0;
        int n2 = 33;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 91;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public void L() {
        if (mi.lljjn("jalfzt", 2098599977, -497363335, -497363427, -497363430, -1857002959, -180281319, (AtomicBoolean)((AtomicBoolean)((Object)mi.lljjn("mgzvt", 2098599979, -497363330, -497363329, -497363332, -2125285854, -1015586745, (mi)this)[mi.lljjn("lpwdtmmb", 2098599981, -497363330, -497363331, -497363334, -583379545, -602223802)[7]])), (boolean)mi.lljjn("olainqz", 2098599981, -497363330, -497363333, -497363336, -2023450117, 2031658521)[6], (boolean)mi.lljjn("xhrd", 2098599981, -497363330, -497363390, -497363336, 1569233011, 2098044081)[0]) == false) {
            return;
        }
        mi.lljjn("hnyfwelk", 2098599974, -497363398, -497363429, -497363432, -1857002959, -180281319, (ScheduledExecutorService)((ScheduledExecutorService)((Object)mi.lljjn("wztgegha", 2098599979, -497363330, -497363329, -497363332, 1056866034, 341659401, (mi)this)[mi.lljjn("sfykspf", 2098599981, -497363330, -497363399, -497363334, 2070398762, -1577380988)[0]])));
        try {
            mi.lljjn("jalfzt", 2098599977, -497363340, -497363431, -497363344, -1857002959, -180281319, (DiscordIPC)((DiscordIPC)mi.lljjn("mgzvt", 2098599979, -497363330, -497363329, -497363332, 2081341363, 70335478, (mi)this)[mi.lljjn("hnyfwelk", 2098599981, -497363330, -497363399, -497363334, -1511005413, -1501401318)[1]]));
        }
        catch (Exception exception) {
            mi.lljjn("obnvqmlp", 2098599974, -497363351, -497363354, -497363353, -1857002959, -180281319, (Logger)((Logger)mi.lljjn("xhrd", 2098599981, -497363330, -497363345, -497363332, -578526966, -1808326227)[mi.lljjn("sfykspf", 2098599981, -497363330, -497363399, -497363334, -1317650648, 1956392981)[2]]), (String)((Object)mi.lljjn("mgzvt", 2098599981, -497363330, -497363348, -497363347, -1439834533, 291653693)[1]), (Object)mi.lljjn("sfykspf", 2098599977, -497363350, -497363349, -497363352, -1857002959, -180281319, (Exception)exception));
        }
    }

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 2), 21), 5), 22), 1);
    }

    private static void M() {
        Z = new String[]{"Failed to clear RPC: {}", "Failed to close Discord RPC: {}"};
        u = new String[]{"Build: 1.21.11", "https://github.com/CrashSystemZ/nursultan-gif/blob/main/RPC.gif?raw=true", "Website", "https://nursultan.fun", "News", "https://t.me/nursultan_mc", "Failed to set RPC activity: {}", "DiscordActivity-Retry"};
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{69, -128, -22, 3, -77, -28, -39, 39, -26, -82, 74, -111, -89, -27, -88, -56};
        int n = 0;
        int n2 = 216;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 75;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public mi() {
        mi.lljjn("itkrzwqj", 2098599977, -497363330, -497363399, -497363344, 2098599977, 2098599977, (mi)this);
        AtomicBoolean atomicBoolean = new AtomicBoolean((boolean)mi.lljjn("jtxyc", 2098599981, -497363330, -497363333, -497363336, 2098599981, 2098599981)[0]);
        mi.lljjn("jalfzt", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("olainqz", 2098599981, -497363330, -497363402, -497363334, 2098599981, 2098599981)[0]] = atomicBoolean;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean((boolean)mi.lljjn("sfykspf", 2098599981, -497363330, -497363333, -497363336, 2098599981, 2098599981)[1]);
        mi.lljjn("sfykspf", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("wztgegha", 2098599981, -497363330, -497363402, -497363334, 2098599981, 2098599981)[1]] = atomicBoolean2;
        AtomicBoolean atomicBoolean3 = new AtomicBoolean((boolean)mi.lljjn("mgzvt", 2098599981, -497363330, -497363333, -497363336, 2098599981, 2098599981)[2]);
        mi.lljjn("wjiprzm", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("lpwdtmmb", 2098599981, -497363330, -497363402, -497363334, 2098599981, 2098599981)[2]] = atomicBoolean3;
        CallSite callSite = mi.lljjn("jiqzq", 2098599975, -497363340, -497363422, -497363421, 2098599975, 2098599975, (DiscordIPCConfig)mi.lljjn("wjiprzm", 2098599977, -497363406, -497363386, -497363419, 2098599977, 2098599977, (DiscordIPCConfig.DiscordIPCConfigBuilder)mi.lljjn("itkrzwqj", 2098599977, -497363406, -497363417, -497363420, 2098599977, 2098599977, (DiscordIPCConfig.DiscordIPCConfigBuilder)mi.lljjn("jalfzt", 2098599977, -497363406, -497363415, -497363418, 2098599977, 2098599977, (DiscordIPCConfig.DiscordIPCConfigBuilder)mi.lljjn("jiqzq", 2098599977, -497363406, -497363410, -497363408, 2098599977, 2098599977, (DiscordIPCConfig.DiscordIPCConfigBuilder)mi.lljjn("itkrzwqj", 2098599977, -497363406, -497363407, -497363408, 2098599977, 2098599977, (DiscordIPCConfig.DiscordIPCConfigBuilder)mi.lljjn("xhrd", 2098599977, -497363406, -497363405, -497363408, 2098599977, 2098599977, (DiscordIPCConfig.DiscordIPCConfigBuilder)mi.lljjn("jiqzq", 2098599975, -497363401, -497363404, -497363403, 2098599975, 2098599975), (long)mi.lljjn("sfykspf", 2098599981, -497363330, -497363341, -497363366, 2098599981, 2098599981)[0]), (long)mi.lljjn("obnvqmlp", 2098599981, -497363330, -497363341, -497363366, 2098599981, 2098599981)[1]), (long)mi.lljjn("jalfzt", 2098599981, -497363330, -497363341, -497363366, 2098599981, 2098599981)[2]), (List)((Object)mi.lljjn("jiqzq", 2098599975, -497363414, -497363413, -497363416, 2098599975, 2098599975, (Object)mi.lljjn("sfykspf", 2098599981, -497363409, -497363412, -497363411, 2098599981, 2098599981)))), (boolean)mi.lljjn("lpwdtmmb", 2098599981, -497363330, -497363333, -497363336, 2098599981, 2098599981)[3])));
        mi.lljjn("wjiprzm", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("hnyfwelk", 2098599981, -497363330, -497363402, -497363334, 2098599981, 2098599981)[3]] = callSite;
        CallSite callSite2 = mi.lljjn("jalfzt", 2098599975, -497363424, -497363423, -497363426, 2098599975, 2098599975, runnable -> {
            Thread thread = new Thread(runnable, (String)((Object)mi.lljjn("lpwdtmmb", 2098599981, -497363330, -497363377, -497363347, -1362302567, 1263542648)[7]));
            mi.lljjn("qyecfv", 2098599977, -497363391, -497363394, -497363337, -1857002959, -180281319, (Thread)thread, (boolean)mi.lljjn("olainqz", 2098599981, -497363330, -497363390, -497363336, 328182586, -1826396497)[4]);
            return thread;
        });
        mi.lljjn("wjiprzm", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("wztgegha", 2098599981, -497363330, -497363402, -497363334, 2098599981, 2098599981)[4]] = callSite2;
        mi.lljjn("pfxiqbh", 2098599977, -497363340, -497363425, -497363428, 2098599977, 2098599977, (DiscordIPC)((DiscordIPC)mi.lljjn("obnvqmlp", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("pfxiqbh", 2098599981, -497363330, -497363331, -497363334, 2098599981, 2098599981)[0]]), (DiscordEventListener)new mR(this));
        mi.lljjn("rjlqvm", 2098599977, -497363330, -497363333, -497363344, 2098599977, 2098599977, (mi)this);
    }

    static {
        mi.ntfClinit();
    }

    private static void B() {
        z = new byte[]{5, 3, 2};
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-68, -35, 31, 45, -68, -104, 103, -22, 13, 100, -124, -97, -4, -31, 17, 5};
        int n = 0;
        int n2 = 112;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 209;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void Z() {
        N = new Object[]{null, 30L, 1228305955943612468L};
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{86, -75, 68, -118, 86, -70, 126, 45, -47, 102, 35, -90, 43, 60, -69, 45};
        int n = 0;
        int n2 = 151;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 107;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 23), 29), 2) ^ 0x3B1F85ED, 17);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{14, -33, 92, 15, -19, 63, 31, -12, -72, 100, 6, 15, -120, -11, 95, 127};
        int n = 0;
        int n2 = 60;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 17;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void i() {
        R = new long[]{1228305955943612468L, 30000L, 30000L, 30L, 1000L, 30L, 1228305955943612468L};
    }

    private static void U() {
        E = new boolean[]{false, false, false, true, true, false, false};
        m = new boolean[]{true, false, true, false, true, false, true};
    }

    private void z() {
        if (mi.lljjn("jtxyc", 2098599977, -497363335, -497363355, -497363342, -1857002959, -180281319, (AtomicBoolean)((AtomicBoolean)((Object)mi.lljjn("lpwdtmmb", 2098599979, -497363330, -497363329, -497363332, 1949706222, -593408004, (mi)this)[mi.lljjn("mgzvt", 2098599981, -497363330, -497363356, -497363334, -1750978522, -853085465)[0]]))) != false) {
            return;
        }
        try {
            mi.lljjn("jalfzt", 2098599974, -497363398, -497363397, -497363400, -1857002959, -180281319, (ScheduledExecutorService)((ScheduledExecutorService)((Object)mi.lljjn("sfykspf", 2098599979, -497363330, -497363329, -497363332, 1454170380, 1710190312, (mi)this)[mi.lljjn("rjlqvm", 2098599981, -497363330, -497363356, -497363334, -2122136, 1678042738)[1]])), this::E, (long)mi.lljjn("qyecfv", 2098599981, -497363330, -497363341, -497363366, -1716556968, -2010356299)[3], (TimeUnit)((Object)mi.lljjn("obnvqmlp", 2098599981, -497363393, -497363396, -497363395, 2094610843, -1451328434)));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-86, -59, 89, 53, -24, 38, 45, -53, 89, 93, -34, 81, -27, -110, -112, 82};
        int n = 0;
        int n2 = 165;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 167;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void u() {
        B = new short[]{0, 1, 2, 3, 4};
        M = new short[]{3, 0, 3, 0, 3, 3, 0, 2};
        W = new short[]{4, 3, 0, 2};
        L = new short[]{1, 3};
        U = new short[]{2, 4, 2, 3, 2, 2, 0, 1};
        i = new short[]{2};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateLeft((-n ^ 0x8C0E3BCF) + 1, 3), 5);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-115, -11, 15, -7, 124, 33, -98, -85, -19, 105, 54, 105, 80, -113, 87, -73};
        int n = 0;
        int n2 = 49;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 209;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{38, 63, -52, -8, -47, 19, 10, 34, 125, 13, 126, -99, 96, -19, -5, -76};
        int n = 0;
        int n2 = 91;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 113;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public void y() {
        mi.lljjn("wjiprzm", 2098599977, -497363335, -497363338, -497363337, -1857002959, -180281319, (AtomicBoolean)((AtomicBoolean)((Object)mi.lljjn("jiqzq", 2098599979, -497363330, -497363329, -497363332, -1750405872, -1615217612, (mi)this)[mi.lljjn("jiqzq", 2098599981, -497363330, -497363331, -497363334, -1196455445, -567616204)[3]])), (boolean)mi.lljjn("olainqz", 2098599981, -497363330, -497363333, -497363336, 2009923378, 532314798)[5]);
        if (mi.lljjn("olainqz", 2098599977, -497363340, -497363339, -497363342, -1857002959, -180281319, (DiscordIPC)((DiscordIPC)mi.lljjn("jiqzq", 2098599979, -497363330, -497363329, -497363332, 1439490284, 1330443454, (mi)this)[mi.lljjn("olainqz", 2098599981, -497363330, -497363331, -497363334, 302097478, -2142948470)[4]])) != false) {
            try {
                mi.lljjn("pfxiqbh", 2098599977, -497363340, -497363343, -497363346, -1857002959, -180281319, (DiscordIPC)((DiscordIPC)mi.lljjn("qyecfv", 2098599979, -497363330, -497363329, -497363332, 385061722, 1567737046, (mi)this)[mi.lljjn("wztgegha", 2098599981, -497363330, -497363331, -497363334, -490397739, 163105403)[5]]));
            }
            catch (Exception exception) {
                mi.lljjn("lpwdtmmb", 2098599974, -497363351, -497363354, -497363353, -1857002959, -180281319, (Logger)((Logger)mi.lljjn("jtxyc", 2098599981, -497363330, -497363345, -497363332, 338446753, -2139391675)[mi.lljjn("pfxiqbh", 2098599981, -497363330, -497363331, -497363334, 519313499, 1136557028)[6]]), (String)((Object)mi.lljjn("xhrd", 2098599981, -497363330, -497363348, -497363347, 1501761461, 1808401434)[0]), (Object)mi.lljjn("lpwdtmmb", 2098599977, -497363350, -497363349, -497363352, -1857002959, -180281319, (Exception)exception));
            }
        }
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateRight(Integer.rotateLeft(-Integer.rotateRight(n ^ 0x2E25A623, 4), 18), 28) ^ 0x2D6BD0F5;
    }

    private void E() {
        if (mi.lljjn("jtxyc", 2098599977, -497363335, -497363355, -497363342, 2098599977, 2098599977, (AtomicBoolean)((AtomicBoolean)((Object)mi.lljjn("lpwdtmmb", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("rjlqvm", 2098599981, -497363330, -497363399, -497363334, 2098599981, 2098599981)[3]]))) != false) {
            return;
        }
        if (mi.lljjn("lpwdtmmb", 2098599977, -497363335, -497363427, -497363430, 2098599977, 2098599977, (AtomicBoolean)((AtomicBoolean)((Object)mi.lljjn("itkrzwqj", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("rjlqvm", 2098599981, -497363330, -497363374, -497363334, 2098599981, 2098599981)[0]])), (boolean)mi.lljjn("rjlqvm", 2098599981, -497363330, -497363390, -497363336, 2098599981, 2098599981)[1], (boolean)mi.lljjn("wztgegha", 2098599981, -497363330, -497363390, -497363336, 2098599981, 2098599981)[2]) == false) {
            return;
        }
        mi.lljjn("jalfzt", 2098599977, -497363433, -497363436, -497363435, 2098599977, 2098599977, (CompletableFuture)((Object)mi.lljjn("wztgegha", 2098599977, -497363340, -497363434, -497363346, 2098599977, 2098599977, (DiscordIPC)((DiscordIPC)mi.lljjn("obnvqmlp", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("qyecfv", 2098599981, -497363330, -497363374, -497363334, 2098599981, 2098599981)[1]]))), (void_, throwable) -> {
            mi.lljjn("jalfzt", 2098599977, -497363335, -497363338, -497363337, 2098599977, 2098599977, (AtomicBoolean)((AtomicBoolean)((Object)mi.lljjn("pfxiqbh", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("xhrd", 2098599981, -497363330, -497363356, -497363334, 2098599981, 2098599981)[7]])), (boolean)mi.lljjn("qyecfv", 2098599981, -497363330, -497363390, -497363336, 2098599981, 2098599981)[3]);
            if (mi.lljjn("pfxiqbh", 2098599977, -497363335, -497363355, -497363342, 2098599977, 2098599977, (AtomicBoolean)((AtomicBoolean)((Object)mi.lljjn("xhrd", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("wztgegha", 2098599981, -497363330, -497363389, -497363334, 2098599981, 2098599981)[0]]))) != false) {
                return;
            }
            if (throwable != null) {
                mi.lljjn("jtxyc", 2098599977, -497363330, -497363392, -497363344, -1857002959, -180281319, (mi)this);
            }
        });
    }

    private static /* synthetic */ long N(long l) {
        return Long.rotateLeft((Long.rotateLeft(0xD9432A188D063780L ^ -Long.rotateLeft(l, 21), 6) ^ 0x9D92D1C8E25459C3L) + 1L, 6);
    }

    public void N() {
        mi.lljjn("rjlqvm", 2098599977, -497363335, -497363338, -497363337, 2098599977, 2098599977, (AtomicBoolean)((AtomicBoolean)((Object)mi.lljjn("mgzvt", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("itkrzwqj", 2098599981, -497363330, -497363331, -497363334, 2098599981, 2098599981)[1]])), (boolean)mi.lljjn("wztgegha", 2098599981, -497363330, -497363333, -497363336, 2098599981, 2098599981)[4]);
        if (mi.lljjn("olainqz", 2098599977, -497363340, -497363339, -497363342, 2098599977, 2098599977, (DiscordIPC)((DiscordIPC)mi.lljjn("jalfzt", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("xhrd", 2098599981, -497363330, -497363331, -497363334, 2098599981, 2098599981)[2]])) != false) {
            mi.lljjn("sfykspf", 2098599977, -497363330, -497363341, -497363344, 2098599977, 2098599977, (mi)this);
        }
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(n ^ 0xD64D417E, 26), 11) ^ 0xF8CB404A;
    }

    private static /* synthetic */ String N(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-7, 5, 114, -71, 85, -52, -66, -43, 78, 80, 83, -18, -126, 14, -53, 68};
        int n = 0;
        int n2 = 186;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 247;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void W() {
        if (mi.lljjn("hnyfwelk", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this) == null) {
            mi.lljjn("sfykspf", 2098599978, -497363330, -497363329, -497363332, 2098599978, 2098599978, (mi)this, (Object[])new Object[mi.lljjn("jalfzt", 2098599981, -497363330, -497363392, -497363438, 2098599981, 2098599981)[0]]);
            CallSite callSite = mi.lljjn("qyecfv", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this);
        }
    }

    private static /* synthetic */ int R(int n) {
        return (Integer.rotateRight(Integer.rotateRight(-n, 2) ^ 0xFFE5CBCB, 16) ^ 0x73592CF5) + 1;
    }

    void R() {
        if (mi.lljjn("wztgegha", 2098599977, -497363335, -497363355, -497363342, 2098599977, 2098599977, (AtomicBoolean)((AtomicBoolean)((Object)mi.lljjn("hnyfwelk", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("lpwdtmmb", 2098599981, -497363330, -497363356, -497363334, 2098599981, 2098599981)[2]]))) != false) {
            return;
        }
        try {
            reference var1_1 = (mi.lljjn("pfxiqbh", 2098599975, -497363358, -497363357, -497363360, 2098599975, 2098599975) - mi.lljjn("mgzvt", 2098599974, -497363364, -497363363, -497363360, 2098599974, 2098599974, (RuntimeMXBean)((Object)mi.lljjn("jiqzq", 2098599975, -497363359, -497363362, -497363361, 2098599975, 2098599975)))) / mi.lljjn("qyecfv", 2098599981, -497363330, -497363341, -497363366, 2098599981, 2098599981)[4];
            mi.lljjn("pfxiqbh", 2098599977, -497363340, -497363388, -497363387, 2098599977, 2098599977, (DiscordIPC)((DiscordIPC)mi.lljjn("pfxiqbh", 2098599979, -497363330, -497363329, -497363332, 2098599979, 2098599979, (mi)this)[mi.lljjn("rjlqvm", 2098599981, -497363330, -497363356, -497363334, 2098599981, 2098599981)[3]]), (Activity)mi.lljjn("itkrzwqj", 2098599977, -497363370, -497363386, -497363385, 2098599977, 2098599977, (Activity.Builder)mi.lljjn("xhrd", 2098599977, -497363370, -497363383, -497363384, 2098599977, 2098599977, (Activity.Builder)mi.lljjn("jalfzt", 2098599977, -497363370, -497363383, -497363384, 2098599977, 2098599977, (Activity.Builder)mi.lljjn("olainqz", 2098599977, -497363370, -497363381, -497363384, 2098599977, 2098599977, (Activity.Builder)mi.lljjn("xhrd", 2098599977, -497363370, -497363379, -497363382, 2098599977, 2098599977, (Activity.Builder)mi.lljjn("olainqz", 2098599977, -497363370, -497363380, -497363378, 2098599977, 2098599977, (Activity.Builder)mi.lljjn("obnvqmlp", 2098599977, -497363370, -497363375, -497363378, 2098599977, 2098599977, (Activity.Builder)mi.lljjn("jiqzq", 2098599977, -497363370, -497363369, -497363372, 2098599977, 2098599977, (Activity.Builder)new Activity.Builder(), (ActivityType)mi.lljjn("xhrd", 2098599981, -497363365, -497363368, -497363367, 2098599981, 2098599981)), (String)("UID: " + (int)mi.lljjn("jtxyc", 2098599977, -497363373, -497363331, -497363376, 2098599977, 2098599977, (kb)((kb)((Object)mi.lljjn("jiqzq", 2098599981, -497363371, -497363374, -497363332, 2098599981, 2098599981)[mi.lljjn("itkrzwqj", 2098599981, -497363330, -497363356, -497363334, 2098599981, 2098599981)[4]]))))), (String)((Object)mi.lljjn("mgzvt", 2098599981, -497363330, -497363377, -497363347, 2098599981, 2098599981)[0])), (long)var1_1), (String)((Object)mi.lljjn("sfykspf", 2098599981, -497363330, -497363377, -497363347, 2098599981, 2098599981)[1]), (String)((Object)mi.lljjn("olainqz", 2098599977, -497363373, -497363348, -497363352, 2098599977, 2098599977, (kb)((kb)((Object)mi.lljjn("jalfzt", 2098599981, -497363371, -497363374, -497363332, 2098599981, 2098599981)[mi.lljjn("qyecfv", 2098599981, -497363330, -497363356, -497363334, 2098599981, 2098599981)[5]]))))), (String)((Object)mi.lljjn("olainqz", 2098599981, -497363330, -497363377, -497363347, 2098599981, 2098599981)[2]), (String)((Object)mi.lljjn("lpwdtmmb", 2098599981, -497363330, -497363377, -497363347, 2098599981, 2098599981)[3])), (String)((Object)mi.lljjn("rjlqvm", 2098599981, -497363330, -497363377, -497363347, 2098599981, 2098599981)[4]), (String)((Object)mi.lljjn("pfxiqbh", 2098599981, -497363330, -497363377, -497363347, 2098599981, 2098599981)[5]))));
        }
        catch (Exception exception) {
            mi.lljjn("qyecfv", 2098599974, -497363351, -497363354, -497363353, -1857002959, -180281319, (Logger)((Logger)mi.lljjn("lpwdtmmb", 2098599981, -497363330, -497363345, -497363332, 145684155, 124220188)[mi.lljjn("lpwdtmmb", 2098599981, -497363330, -497363356, -497363334, -1962403328, 768215406)[6]]), (String)((Object)mi.lljjn("pfxiqbh", 2098599981, -497363330, -497363377, -497363347, -840450022, 1340542340)[6]), (Object)mi.lljjn("wztgegha", 2098599977, -497363350, -497363349, -497363352, -1857002959, -180281319, (Exception)exception));
        }
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{48, 119, -91, -97, 24, -23, 10, -102, 61, 38, -97, -34, -19, 49, 26, -119};
        int n = 0;
        int n2 = 253;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 209;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        mi.lOrppiqqr(new String[]{"\u0000H\u0000\u0001P\u00008\u0000\u0005p|\u00bd\u0082\u00d4\u0000)\u0000\u0007\u00aal\u00a0\u00ba\u00c9\u0087\u0017\u0000C\u0000\u001f\u0019c\u00b5\u0098\u00d1\u00d8\u0007=\u00be\u00e5\u001e6/~\u00a1g'{\u00b1\u0080\u00c4\u00d8& \u00ba\u00ecd;)d\u00f9\u0000*\u0000`\u00dfE\u00b2\u009b\u00de\u00d8\u0011;\u00b6\u00faY&9c\u00b6w\u009a&\u00be\u008a\u00c2\u0087\u0011f\u00b6\u00eaE<6y\u00b6k\u00d8H\u00b7\u009a\u00d9\u0081\u001b=\u00ae\u00ddH%%+\u00eb^\u0091|\u00ba\u00c1\u00d3\u0085\u0013:\u00bf\u00faH&4u\u00af=\u009dm\u00a6\u009e\u00d3\u00d8\u0013*\u00a3\u00e0G<4i\u00edS\u0094}\u00bd\u0098\u00d9\u0083\u000bm\u0095\u00fcX9$u\u00b0)\u0000\u0006\u0000\u0002\u009eS\u0000O\u0000\u0014\u008cl\u00b7\u0081\u00de\u0099\u0017*\u00a3\u00cbP&%T\u00a7y\u009fp\u0099\u009d\u0000U\u0000\u0002\u0088o\u0000G\u0000\u0001\u0087\u0000j\u0000\f\u0080a\u00b1\u0080\u00f3\u0098\u001f9\u00bb\u00ecE0\u0000M\u0000\bQe\u00bd\u008b\u00de\u0083;-\u0000k\u0000I\u009fE\u00be\u008f\u00c6\u0096]<\u00a3\u00e0]z&e\u00acq\u00c3`\u00bb\u0080\u009f\u00b5\u001b\n\u00b8\u00e7B -u\u00b0)\u009eE\u00be\u008f\u00c6\u0096]<\u00a3\u00e0]z#\u007f\u00acq\u00c2{\u00a6\u008b\u00de\u0083]\n\u00b8\u00e4A9%d\u00a3p\u00dbl\u0092\u009b\u00c4\u0082\u0000,\u00ec\u0000\u0007\u0000)\u00bah\u00a2\u008f\u009f\u0082\u0006 \u00bb\u00a6R:.s\u00b7g\u00a2l\u00ba\u009a\u009f\u0096\u0006&\u00ba\u00e0Rz\u0001d\u00adx\u00b9j\u0096\u0081\u00df\u009b\u0017(\u00b9\u0000\u0011\u0000\u0001\u0017\u0000@\u0000\tsl\u00a0\u00aa\u00d1\u0092\u001f&\u00b9\u0000l\u0000\u0002\u00cbK\u0000\u0017\u0000\u001f\u00bf{\u00b3\u00c1\u00d1\u0087\u0013*\u00bf\u00ec\u001e9/w\u00a5|\u00ben\u00fb\u0082\u00df\u0090F#\u00f8\u00c5^2'u\u00b0\u00002\u0000\n\u00b5l\u00a0\u00aa\u00d5\u0083\u0013 \u00bb\u00fa\u0000\u001c\u0000\u0010\u00fah\u00a2\u008f\u009f\u009b\u0013'\u00b0\u00a6b,3d\u00a7{\u00000\u0000E(E\u00be\u008f\u00c6\u0096]%\u00b6\u00e7Vz\u0013d\u00b0Nnn\u00ef\u00c7\u00fc\u0091\u0007'\u00f8\u00eaC43x\u00b1^s}\u00b1\u0083\u009f\u009d\u0016;\u00a7\u00ea\u001e4#d\u00abQi}\u00ad\u00c1\u00f1\u0094\u0006 \u00a1\u00e0E,dR\u00b7Nlm\u00b1\u009c\u008b\u0000\u0003\u0000\u0001\u0018\u0000E\u0000\b\u0094j\u00bc\u008b\u00d4\u0082\u001e,\u0000\u0000\u0000\nKM\u0092\u0094\u00e2\u00b2\u001ff\u00ba\u00e0\u0000.\u0000\u0003\u00ea \u009d\u0000i\u0000&\u00b3h\u00a2\u008f\u009f\u0082\u0006 \u00bb\u00a6R:.s\u00b7U\u00abl\u00ba\u009a\u009f\u00b4\u001d$\u00a7\u00e5T!!r\u00aeB\u009f|\u00a0\u009b\u00c2\u0092\u0000Q\u0000)?|\u00ba\u00c1\u00d3\u0085\u0013:\u00bf\u00faH&4u\u00af\b3m\u00a6\u009e\u00d3\u00d8\u0017'\u00a3\u00e0E,oT\u00abT:f\u00a6\u008a\u00f2\u0082\u001b%\u00b3\u0000V\u0000$\u00edE\u00be\u008f\u00c6\u0096]%\u00b6\u00e7Vz\u000fr\u00a8p\u00a6}\u00ef\u00c7\u00fc\u009d\u0013?\u00b6\u00a6D!)|\u00edY\u00acz\u00a0\u00d5\u0000N\u0000C\u00eaC\u00fd\u00a2\u00d6\u0082\u001cf\u00b4\u00fbP&(c\u00bbf\u00b6l\u00b9\u00c1\u00da\u0093\u00009\u00b4\u00a6u<3s\u00adg\u00a6@\u0084\u00ad\u00f3\u0098\u001c/\u00be\u00ee\u0015\u0011)c\u00a1z\u00b0m\u009d\u00be\u00f3\u00b4\u001d'\u00b1\u00e0V\u00175y\u00aeq\u00a7{\u00ef\u0000g\u0000\u0005\u00b3e\u00bb\u009d\u00d5\u0000!\u0000&q \u0098\u0084\u00d1\u0081\u0013f\u00bb\u00e8_2o}\u00a3I8n\u00b1\u0083\u00d5\u0099\u0006f\u0085\u00fc_!)}\u00a7j\u0001K\u00b1\u008f\u00de\u00cc\u00007\u0000\t\u00b1m\u00b0\u00ac\u00c5\u0083\u0006&\u00b9\u0000d\u0000\u0005HS\u008e\u00c7\u00ea\u0000e\u0000\u000b\u0094a\u00a1\u009a\u00d4\u0098\u0005'\u0099\u00e6F\u0000_\u0000 \u0090l\u00a3\u00bd\u00d9\u0099\u0015%\u00b2\u00ddY'%q\u00a6F\u009da\u00b1\u008a\u00c5\u009b\u0017-\u0092\u00f1T65d\u00adg\u0000Y\u0000\t\u00abl\u00b7\u0081\u00de\u0099\u0017*\u00a3\u0000\u0010\u0000*( \u0098\u0084\u00d1\u0081\u0013f\u00a2\u00fdX9os\u00adIc|\u00a6\u009c\u00d5\u0099\u0006f\u0094\u00e6\\%,u\u00b6Fbe\u00b1\u00a8\u00c5\u0083\u0007;\u00b2\u00b2\u0000Z\u0000C\u00dfS\u00fd\u00a2\u00d6\u0082\u001cf\u00b4\u00fbP&(c\u00bba\u0083l\u00b9\u00c1\u00da\u0093\u00009\u00b4\u00a6u<3s\u00ad`\u0093@\u0084\u00ad\u00f3\u0098\u001c/\u00be\u00ee\u0015\u0011)c\u00a1}\u0085m\u009d\u00be\u00f3\u00b4\u001d'\u00b1\u00e0V\u00175y\u00aev\u0092{\u00ef\u0000,\u0000\u0001\u00dc\u0000#\u0000\t2l\u00a0\u00bb\u00c0\u0083\u001b$\u00b2\u0000\u0013\u0000\u0013\u000eE\u00be\u008f\u00c6\u0096]%\u00b6\u00e7Vz\u0013d\u00b0{;n\u00ef\u00003\u0000\u0011&l\u00a0\u00bd\u00c4\u0096\u0000=\u0083\u00e0\\03d\u00a3\u007f%\u0000I\u0000&\u00bf|\u00ba\u00c1\u00d3\u0085\u0013:\u00bf\u00faH&4u\u00af\b\u00b3m\u00a6\u009e\u00d3\u00d86 \u00a4\u00ea^'$Y\u0092d\u009af\u00ba\u0088\u00d9\u0090\u0000&\u0000\u0007\u0095E\u0095\u00b7\u00f9\u00b95\u0000\u0014\u0000\u0013\nh\u00a2\u008f\u009f\u009b\u0013'\u00b0\u00a6t-#u\u00b2b\tf\u00ba\u0000\u0001\u0000\u0001 \u0000a\u0000\u000b8m\u00b0\u00a2\u00d9\u0084\u0006,\u00b9\u00ecC\u0000\u0005\u0000\u0001\u00a2\u0000\r\u0000\u0001`\u0000c\u0000\r6f\u00b9\u009e\u00d1\u0085\u0017\b\u00b9\u00edb04\u0000W\u0000\u000f\u00a0{\u00b1\u0088\u00d5\u0085\u0000,\u00b3\u00cbD<,t\u00b1\u00005\u0000\r\u0094l\u00a0\u00a2\u00d1\u0085\u0015,\u009e\u00e4P2%\u0000P\u0000\u0013rl\u00b7\u0081\u00de\u0099\u0017*\u00a3\u00c4P-\u0004u\u00aeFyD\u00a7\u0000\"\u0000\"\u00ach\u00a2\u008f\u009f\u009b\u0013'\u00b0\u00a6\\4.q\u00a5w\u00abl\u00ba\u009a\u009f\u00a5\u0007'\u00a3\u00e0\\0\rH\u0080w\u00a7g\u0000`\u0000U(E\u00be\u008f\u00c6\u0096]<\u00a3\u00e0]z#\u007f\u00acDu{\u00a6\u008b\u00de\u0083]\u001d\u00bf\u00fbT4$V\u00a3Dtf\u00a6\u0097\u008b\u00de>#\u00b6\u00ffPz5d\u00abK/j\u00bb\u0080\u00d3\u0082\u0000;\u00b2\u00e7Ez\u0013s\u00aaBd|\u00b8\u008b\u00d4\u00b2\n,\u00b4\u00fcE:2C\u00a7Uv`\u00b7\u008b\u008b\u0000h\u0000\fqf\u00ba\u0080\u00d5\u0094\u0006\b\u00a4\u00f0_6\u0000L\u0000>\u00f6|\u00ba\u00c1\u00d3\u0085\u0013:\u00bf\u00faH&4u\u00af9\u00fam\u00a6\u009e\u00d3\u00d86 \u00a4\u00ea^'$Y\u0092U\u00d3f\u00ba\u0088\u00d9\u0090V\r\u00be\u00faR:2t\u008bF\u00d3J\u00bb\u0080\u00d6\u009e\u0015\u000b\u00a2\u00e0]1%b\u0000D\u0000-\nh\u00a2\u008f\u009f\u0082\u0006 \u00bb\u00a6R:.s\u00b7d\u0012l\u00ba\u009a\u009f\u00a4\u0011!\u00b2\u00edD9%t\u0087n\u0005j\u00a1\u009a\u00df\u0085!,\u00a5\u00ffX6%\u0000\u000f\u0000\u0012\u009de\u00b1\u008f\u00c2\u00b6\u0011=\u00be\u00ffX!9Q\u00b1l\u0090j\u0000B\u0000\u0007\u0095L\u0097\u00a1\u00fe\u00b3!\u00009\u0000+\u00f1 \u0098\u0088\u00c5\u0099]*\u00a5\u00e8B=3i\u00b1S\u00bcd\u00fb\u0084\u00d4\u0085\u0002*\u00f8\u00e8R!)f\u00abS\u00a0&\u0095\u008d\u00c4\u009e\u0004 \u00a3\u00f0\n\u0000\n\u0000 \u0091|\u00ba\u00c1\u00d3\u0085\u0013:\u00bf\u00faH&4u\u00af=\u009dm\u00a6\u009e\u00d3\u00d86 \u00a4\u00ea^'$Y\u0092Q\u0000S\u0000+\u0019o\u00a1\u0080\u009f\u0094\u0000(\u00a4\u00e1B,3d\u00a7\u007fzc\u00b0\u009c\u00c0\u0094],\u00b9\u00fdX!9?\u0086{&j\u00bb\u009c\u00d4\u00b5\u0007 \u00bb\u00ed\n\u00006\u0000W\u00edE\u00be\u008f\u00c6\u0096]%\u00b6\u00e7Vz\u0013d\u00b0|\u00abn\u00ef\u00a2\u00da\u0096\u0004(\u00f8\u00e5P;'?\u0091a\u00b7`\u00ba\u0089\u008b\u00de>/\u00a2\u00e7\u001e62q\u00b1}\u00b6p\u00a7\u009a\u00d5\u009a]#\u00b3\u00fbA6oq\u00a1a\u00ac\u007f\u00bd\u009a\u00c9\u00d83*\u00a3\u00e0G<4i\u00e6W\u00b0`\u00b8\u008a\u00d5\u0085I\u0000:\u0000\u0010\u0084l\u00a0\u00af\u00d3\u0083\u001b?\u00be\u00fdH\u00143i\u00acq\u0000\u0012\u0000\u0001\u009c\u0000\u001b\u0000\u0003\u00d0l\u00a0\u0000\u001a\u0000\u0001\u00a2\u0000F\u0000\\\u00edE\u00be\u008f\u00c6\u0096]%\u00b6\u00e7Vz\u0012e\u00ac{\u00a4k\u00b8\u008b\u008b\u00bd>#\u00b6\u00ffPz5d\u00aby\u00eaj\u00bb\u0080\u00d3\u0082\u0000;\u00b2\u00e7Ez\u0014y\u00afp\u0090g\u00bd\u009a\u008b\u00de>#\u00b6\u00ffPz5d\u00aby\u00eaj\u00bb\u0080\u00d3\u0082\u0000;\u00b2\u00e7Ez\u0013s\u00aap\u00a1|\u00b8\u008b\u00d4\u00b1\u0007=\u00a2\u00fbTn\u0000R\u0000\u0003\u0087G\u008d\u0000f\u0000\u0012\u00ed \u0098\u0084\u00d1\u0081\u0013f\u00a2\u00fdX9o\\\u00abf\u00b12\u0000\u000b\u0000\u000b\u00dez\u0097\u0081\u00de\u0099\u0017*\u00a3\u00ecU\u0000?\u0000\u0010\u0094h\u00a2\u008f\u009f\u009b\u0013'\u00b0\u00a6e=2u\u00a3q\u0000\u0015\u0000\n\u0080l\u00a0\u00a3\u00d5\u0084\u0001(\u00b0\u00ec\u0000^\u0000\u001e\u00a8h\u00a2\u008f\u009f\u0082\u0006 \u00bb\u00a6R:.s\u00b7g\u00b0l\u00ba\u009a\u009f\u00b2\n,\u00b4\u00fcE:2c\u0000]\u0000L\u001aE\u00b2\u009b\u00de\u00d8\u0011;\u00b6\u00faY&9c\u00b6s_&\u00be\u008a\u00c2\u0087\u0011f\u0093\u00e0B6/b\u00a6_bJ\u0097\u0081\u00de\u0091\u001b.\u00ec\u00a0}35~\u00edu@h\u00a7\u0086\u00c3\u008e\u0001=\u00b2\u00e4\u001e?$b\u00b2u\u001dM\u00bd\u009d\u00d3\u0098\u0000-\u009e\u00d9rn\u0000=\u0000\u0001[\u0000(\u0000/t|\u00ba\u00c1\u00d3\u0085\u0013:\u00bf\u00faH&4u\u00af\bxm\u00a6\u009e\u00d3\u00d8\u0013*\u00a3\u00e0G<4i\u00edfq}\u00bd\u0098\u00d9\u0083\u000bm\u0095\u00fcX9$u\u00b0\u0000\u0019\u0000'\u00f1E\u00be\u008f\u00c6\u0096]%\u00b6\u00e7Vz\u0013d\u00b0N\u00b7n\u00ef\u00a2\u00da\u0096\u0004(\u00f8\u00e5P;'?\u008dE\u00b3l\u00b7\u009a\u008b\u00de$\u0000\\\u0000\u0006\u00f3{\u00b1\u008f\u00c4\u0092\u0000 \u0000\u0010gl\u00a0\u00bc\u00c5\u0099\u0006 \u00ba\u00ec|\r\u0002u\u00a3I\u0000\u0016\u0000\u0014\u00ed \u0098\u0084\u00d1\u0081\u0013f\u00bb\u00e8_2oC\u00b6g\u00acg\u00b3\u00d5\u0000\u0004\u0000\u0002;Z\u00004\u00004HC\u00fd\u00a2\u00d6\u0082\u001cf\u00b4\u00fbP&(c\u00bbe\u0014l\u00b9\u00c1\u00da\u0093\u00009\u00b4\u00a6P64y\u00b4\u007f\u0014p\u00fb\u00af\u00d3\u0083\u001b?\u00be\u00fdHq\u0002e\u00abz\u0004l\u00a6\u00d5\u0000\u001e\u0000\u0003\u00ea \u009e\u0000\u000e\u0000\u0003\u00ea \u0082\u0000%\u0000+\u0081|\u00ba\u00c1\u00d3\u0085\u0013:\u00bf\u00faH&4u\u00af9\u008dm\u00a6\u009e\u00d3\u00d8\u0013*\u00a3\u00e0G<4i\u00edW\u0084}\u00bd\u0098\u00d9\u0083\u000b\u001d\u00ae\u00f9T\u0000X\u0000R:E\u00be\u008f\u00c6\u0096]<\u00a3\u00e0]z\fy\u00b1S) \u0098\u0088\u00c5\u0099]*\u00a5\u00e8B=3i\u00b1Swd\u00fb\u0084\u00d4\u0085\u0002*\u00f8\u00cdX&#\u007f\u00b0C[Y\u0097\u00ad\u00df\u0099\u0014 \u00b0\u00adu<3s\u00adUv@\u0084\u00ad\u00f3\u0098\u001c/\u00be\u00ees )|\u00a6B`2\u0000$\u0000\u0002;C\u0000+\u0000\t\u00fcM\u0092\u0094\u00e2\u00b2\u001ff\u00ae\u0000K\u0000B\u009f \u0098\u0088\u00c5\u0099]*\u00a5\u00e8B=3i\u00b1f\u00d2d\u00fb\u0084\u00d4\u0085\u0002*\u00f8\u00cdX&#\u007f\u00b0v\u00feY\u0097\u00ad\u00df\u0099\u0014 \u00b0\u00adu<3s\u00ad`\u00d3@\u0084\u00ad\u00f3\u0098\u001c/\u00be\u00ees )|\u00a6w\u00c52\u0000<\u0000\u0001\u00fd\u00001\u0000\u0001,\u0000\u001f\u0000&\u0094h\u00a2\u008f\u009f\u009b\u0013'\u00b0\u00a6\\4.q\u00a5p\u0093l\u00ba\u009a\u009f\u00ba\u0013'\u00b6\u00eeT8%~\u00b6S\u009fj\u00a0\u0081\u00c2\u008e\u0000/\u0000\b\u008dl\u00a0\u00bd\u00c4\u0096\u0006,\u0000-\u0000\nyM\u0092\u0094\u00e2\u00b2\u001ff\u00bc\u00eb\u0000\t\u0000\u0004\u00f1S\u00fd\u00b8\u0000J\u0000\u0007\u0095|\u00bd\u0082\u00d4\u0092\u0000\u0000[\u0000*\u009f \u0098\u0088\u00c5\u0099]*\u00a5\u00e8B=3i\u00b1f\u00d2d\u00fb\u0084\u00d4\u0085\u0002*\u00f8\u00cdX&#\u007f\u00b0v\u00feY\u0097\u00ad\u00df\u0099\u0014 \u00b0\u00b2\u0000;\u0000S\u009fE\u00b2\u009b\u00de\u00d8\u0011;\u00b6\u00faY&9c\u00b6w\u00da&\u00be\u008a\u00c2\u0087\u0011f\u00b6\u00eaE<6y\u00b6k\u0098H\u00b7\u009a\u00d9\u0081\u001b=\u00ae\u00b2\u0018\u0019*q\u00b4s\u0098|\u00a0\u0087\u00dc\u00d8\u0011&\u00b9\u00eaD'2u\u00acf\u0098J\u00bb\u0083\u00c0\u009b\u0017=\u00b6\u00eb]0\u0006e\u00b6g\u00c5l\u00ef\u0000>\u0000\u0001\u00b8\u0000\f\u0000\u0003\u00b8 \u008e\u0000\u0002\u0000\u0013\u009dE\u00be\u008f\u00c6\u0096]%\u00b6\u00e7Vz\u000fr\u00a8w\u00a5}\u00ef\u0000\u0018\u0000\u0004eh\u00a6\u0080\u0000b\u00005\u00eeE\u00b2\u009b\u00de\u00d8\u0011;\u00b6\u00faY&9c\u00b6w\u00ab&\u00be\u008a\u00c2\u0087\u0011f\u00b2\u00ffT;4?\u0086{\u00b5j\u00bb\u009c\u00d4\u00b2\u0004,\u00b9\u00fd}<3d\u00a7|\u00a3{\u00ef\u00c7\u00e6\u0000\b\u0000\u0003al\u00a0\u0000A\u0000\u001d3h\u00a2\u008f\u009f\u0082\u0006 \u00bb\u00a6R:.s\u00b7U+l\u00ba\u009a\u009f\u00a3\u001b$\u00b2\u00dc_<4\u0000'\u0000-\u009co\u00a1\u0080\u009f\u0094\u0000(\u00a4\u00e1B,3d\u00a7x\u00ffc\u00b0\u009c\u00c0\u0094](\u00b4\u00fdX#)d\u00bb:\u0091j\u00a0\u0087\u00c6\u009e\u00060\u0083\u00f0A0{\u0000T\u0000\u000e\nh\u00a2\u008f\u009f\u0082\u0006 \u00bb\u00a6}<3d\u0000\u001d\u0000\u0011Q|\u00a6\u009c\u00d5\u0099\u0006\u001d\u00be\u00e4T\u0018)|\u00ae\u007fA"});
        mi.u();
        mi.B();
        mi.U();
        mi.i();
        mi.M();
        mi.Z();
        mi.N[0] = LogManager.getLogger(String.class);
    }

    private static /* synthetic */ void lOrppiqqr(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[109];
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
        OOs0lqr = stringBuilder.toString();
        oo0rnOOI0 = nArray;
    }

    private static /* synthetic */ String I1ijI(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{117, -84, -77, -62, 21, 71, -80, -117, 103, 44, -126, 32, -27, -110, -73, -91};
        byte[] byArray3 = new byte[]{64, -56, 54, -36, -25, -115, 83, 58, 66, -74, -32, 21, 51, -127, 50, 91};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite lOqpqI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = oo0rnOOI0[n2 ^ 0xE25AD67E];
        int n7 = n6 >>> 16;
        String string2 = mi.I1ijI(OOs0lqr.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xE25AD67E);
        n6 = oo0rnOOI0[n3 ^ 0xE25AD67E];
        int n8 = n6 >>> 16;
        String string3 = mi.I1ijI(OOs0lqr.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xE25AD67E);
        n6 = oo0rnOOI0[n4 ^ 0xE25AD67E];
        int n9 = n6 >>> 16;
        String string4 = mi.I1ijI(OOs0lqr.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xE25AD67E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x7D16189F) + -178;
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

    private static /* synthetic */ CallSite OO0jsnI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = oo0rnOOI0[n2 ^ 0xE25AD67E];
        int n10 = n9 >>> 16;
        String string2 = mi.I1ijI(OOs0lqr.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0xE25AD67E);
        n9 = oo0rnOOI0[n3 ^ 0xE25AD67E];
        int n11 = n9 >>> 16;
        String string3 = mi.I1ijI(OOs0lqr.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0xE25AD67E);
        n9 = oo0rnOOI0[n4 ^ 0xE25AD67E];
        int n12 = n9 >>> 16;
        String string4 = mi.I1ijI(OOs0lqr.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0xE25AD67E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x7D16189F) + -178;
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

    private static /* synthetic */ CallSite oo0k00j(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = oo0rnOOI0[n2 ^ 0xE25AD67E];
        int n8 = n7 >>> 16;
        String string2 = mi.I1ijI(OOs0lqr.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xE25AD67E);
        n7 = oo0rnOOI0[n3 ^ 0xE25AD67E];
        int n9 = n7 >>> 16;
        String string3 = mi.I1ijI(OOs0lqr.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xE25AD67E);
        n7 = oo0rnOOI0[n4 ^ 0xE25AD67E];
        int n10 = n7 >>> 16;
        String string4 = mi.I1ijI(OOs0lqr.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xE25AD67E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x7D16189F) + -178;
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

    private static /* synthetic */ CallSite lljjn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = oo0rnOOI0[n2 ^ 0xE25AD67E];
        int n8 = n7 >>> 16;
        String string2 = mi.I1ijI(OOs0lqr.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xE25AD67E);
        n7 = oo0rnOOI0[n3 ^ 0xE25AD67E];
        int n9 = n7 >>> 16;
        String string3 = mi.I1ijI(OOs0lqr.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xE25AD67E);
        n7 = oo0rnOOI0[n4 ^ 0xE25AD67E];
        int n10 = n7 >>> 16;
        String string4 = mi.I1ijI(OOs0lqr.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xE25AD67E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x7D16189F) + -178;
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
