/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NAN
 *  KDFzREm.NNBM
 *  KDFzREm.NNNpr
 *  KDFzREm.NNNwd
 *  KDFzREm.NNuU
 *  KDFzREm.NNzU
 */
package KDFzREm;

import KDFzREm.MX;
import KDFzREm.Mp;
import KDFzREm.NAN;
import KDFzREm.NNBM;
import KDFzREm.NNNpr;
import KDFzREm.NNNwd;
import KDFzREm.NNuU;
import KDFzREm.NNzU;
import KDFzREm.Rs;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.lj;
import KDFzREm.lv;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

@UZ(L="AutoAccept", y=UR.PLAYER, N=Uz.AUTO)
public class Pq
extends UM {
    public Object[] L;
    private static boolean[] i;
    private static short[] R;
    private static short[] M;
    private static String[] B;
    private static short[] Z;
    private static String[] z;
    private static short[] U;
    private static short[] W;
    private static short[] m;
    private static String[] P;
    private static boolean[] s;
    public Object[] u;
    private static boolean[] T;
    private static byte[] b;
    private static boolean[] j;
    private static /* synthetic */ String Ilsrnr0;
    private static /* synthetic */ int[] l1nqtpIjp;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(-Integer.rotateLeft((Integer.rotateRight(n, 17) ^ 0x73F4C9E7) + 1, 27), 5);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{74, 13, 0, 82, -19, -110, -126, 127, -116, -70, -16, -81, 7, 78, 57, 81};
        int n = 0;
        int n2 = 115;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 237;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void P() {
        CallSite callSite;
        if (Pq.I1n0rni0("teet", -93109306, -1774800971, -1774800989, -1774800975, -93109306, -93109306, -93109306, (Pq)this) == null) {
            Pq.I1n0rni0("aylazs", -93109305, -1774800971, -1774800989, -1774800975, -93109305, -93109305, -93109305, (Pq)this, (Object[])new Object[Pq.I1n0rni0("nvyqpit", -93109312, -1774800971, -1774801011, -1774801012, -93109312, -93109312, -93109312)[4]]);
            callSite = Pq.I1n0rni0("gnndopb", -93109306, -1774800971, -1774800989, -1774800975, -93109306, -93109306, -93109306, (Pq)this);
        }
        if (Pq.I1n0rni0("hwexrkh", -93109306, -1774800971, -1774800967, -1774800975, -93109306, -93109306, -93109306, (Pq)this) == null) {
            Pq.I1n0rni0("vpuo", -93109305, -1774800971, -1774800967, -1774800975, -93109305, -93109305, -93109305, (Pq)this, (Object[])new Object[Pq.I1n0rni0("yakki", -93109312, -1774800971, -1774801011, -1774801012, -93109312, -93109312, -93109312)[5]]);
            callSite = Pq.I1n0rni0("gnndopb", -93109306, -1774800971, -1774800967, -1774800975, -93109306, -93109306, -93109306, (Pq)this);
        }
    }

    private boolean P(String string) {
        block6: {
            block5: {
                Pq.I1n0rni0("wegl", -93109308, -1774800971, -1774800991, -1774800992, -93109308, -93109308, -93109308, (Pq)this);
                if (Pq.I1n0rni0("wegl", -93109308, -1774800979, -1774800976, -1774800986, -93109308, -93109308, -93109308, (lv)((lv)((Object)Pq.I1n0rni0("rcygtieh", -93109306, -1774800971, -1774800989, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("yakki", -93109312, -1774800971, -1774801009, -1774800973, -93109312, -93109312, -93109312)[1]]))) == false) break block5;
                if (Pq.I1n0rni0("wegl", -93109308, -1774800982, -1774800998, -1774801019, 285071238, -2022185428, -1063707322, (String)string, (CharSequence)((Object)Pq.I1n0rni0("yakki", -93109312, -1774800971, -1774800972, -1774800981, -1975678991, -2120299173, 126602831)[6])) != false) break block6;
            }
            return (boolean)Pq.I1n0rni0("nvyqpit", -93109312, -1774800971, -1774800963, -1774801017, -93109312, -93109312, -93109312)[1];
        }
        CallSite callSite = Pq.I1n0rni0("dxwwak", -93109308, -1774800980, -1774800977, -1774800978, 285071238, -2022185428, -1063707322, (Pattern)((Pattern)((Object)Pq.I1n0rni0("rcygtieh", -93109306, -1774800971, -1774800967, -1774800975, -1457939380, 1083778051, 1249304931, (Pq)this)[Pq.I1n0rni0("aylazs", -93109312, -1774800971, -1774801009, -1774800973, -1883640458, -222218634, -868735953)[2]])), (CharSequence)string);
        if (Pq.I1n0rni0("dxwwak", -93109308, -1774800983, -1774801018, -1774800986, 285071238, -2022185428, -1063707322, (Matcher)((Object)callSite)) == false) {
            return (boolean)Pq.I1n0rni0("hwexrkh", -93109312, -1774800971, -1774800963, -1774801017, -964643231, -1240657944, -350652595)[2];
        }
        CallSite callSite2 = Pq.I1n0rni0("dxwwak", -93109308, -1774800983, -1774801024, -1774801021, 285071238, -2022185428, -1063707322, (Matcher)((Object)callSite), (int)Pq.I1n0rni0("abel", -93109312, -1774800971, -1774800963, -1774801017, -1718580177, -1703814706, 1807423647)[3]);
        if (Pq.I1n0rni0("gnndopb", -93109308, -1774800993, -1774800994, -1774800986, 285071238, -2022185428, -1063707322, (Boolean)((Boolean)((Object)Pq.I1n0rni0("vpuo", -93109308, -1774800995, -1774800963, -1774800996, 285071238, -2022185428, -1063707322, (lT)((lT)((Object)Pq.I1n0rni0("gnndopb", -93109306, -1774800971, -1774800967, -1774800975, 1381015753, 687118343, 1337156498, (Pq)this)[Pq.I1n0rni0("gnndopb", -93109312, -1774800971, -1774800990, -1774800973, -1651565997, -132186410, -946027266)[0]])))))) != false && Pq.I1n0rni0("rcygtieh", -93109308, -1774800971, -1774801022, -1774800997, 285071238, -2022185428, -1063707322, (Pq)this, (String)((Object)callSite2)) == false) {
            return (boolean)Pq.I1n0rni0("abel", -93109312, -1774800971, -1774800963, -1774801017, 566161630, 1462863186, -958644351)[4];
        }
        Pq.I1n0rni0("aylazs", -93109302, -1774800999, -1774801000, -1774800969, 285071238, -2022185428, -1063707322, (String)("/duel team accept " + (String)((Object)callSite2)));
        return (boolean)Pq.I1n0rni0("dxwwak", -93109312, -1774800971, -1774801020, -1774801017, -1922353261, 257740649, -1405121522)[0];
    }

    private static void T() {
        z = new String[]{"teleport-request", "command-duel-request", "clan-invite-request", "accept"};
        B = new String[]{"friends-accept-only", "\u043f\u0440\u043e\u0441\u0438\u0442 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f", "\u0445\u043e\u0447\u0435\u0442 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f", "\u0418\u0433\u0440\u043e\u043a\\s+(\\S+)\\s+\u043f\u0440\u0438\u0433\u043b\u0430\u0448\u0430\u0435\u0442 \u0432\u0430\u0441 \u0432 \u0441\u0432\u043e\u044e \u0434\u0443\u044d\u043b\u044c\u043d\u0443\u044e \u043a\u043e\u043c\u0430\u043d\u0434\u0443", "\\[\u2694]\\s*(\\S+)\\s+\u043f\u0440\u0438\u0433\u043b\u0430\u0448\u0430\u0435\u0442\\s+\u0412\u0430\u0441\\s+\u0432\\s+\u043a\u043b\u0430\u043d", "|", "\u0434\u0443\u044d\u043b\u044c\u043d\u0443\u044e \u043a\u043e\u043c\u0430\u043d\u0434\u0443", "\u043f\u0440\u0438\u0433\u043b\u0430\u0448\u0430\u0435\u0442 \u0412\u0430\u0441 \u0432 \u043a\u043b\u0430\u043d"};
        P = new String[]{" ", "/tpaccept"};
    }

    private static /* synthetic */ String T(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{40, 64, 2, 69, 45, 99, -84, 14, 73, -116, -38, 46, 92, 41, -125, 19};
        int n = 0;
        int n2 = 86;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 197;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public Pq() {
        Pq.I1n0rni0("gnndopb", -93109308, -1774800971, -1774800991, -1774800992, -93109308, -93109308, -93109308, (Pq)this);
        lv lv2 = new lv((String)((Object)Pq.I1n0rni0("dxwwak", -93109312, -1774800971, -1774800923, -1774800981, -93109312, -93109312, -93109312)[0]), (boolean)Pq.I1n0rni0("teet", -93109312, -1774800971, -1774800924, -1774801017, -93109312, -93109312, -93109312)[0]);
        Pq.I1n0rni0("dxwwak", -93109306, -1774800971, -1774800989, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("rcygtieh", -93109312, -1774800971, -1774800921, -1774800973, -93109312, -93109312, -93109312)[0]] = lv2;
        lv lv3 = new lv((String)((Object)Pq.I1n0rni0("nvyqpit", -93109312, -1774800971, -1774800923, -1774800981, -93109312, -93109312, -93109312)[1]), (boolean)Pq.I1n0rni0("abel", -93109312, -1774800971, -1774800924, -1774801017, -93109312, -93109312, -93109312)[1]);
        Pq.I1n0rni0("dxwwak", -93109306, -1774800971, -1774800989, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("gnndopb", -93109312, -1774800971, -1774800921, -1774800973, -93109312, -93109312, -93109312)[1]] = lv3;
        lv lv4 = new lv((String)((Object)Pq.I1n0rni0("gnndopb", -93109312, -1774800971, -1774800923, -1774800981, -93109312, -93109312, -93109312)[2]), (boolean)Pq.I1n0rni0("teet", -93109312, -1774800971, -1774800924, -1774801017, -93109312, -93109312, -93109312)[2]);
        Pq.I1n0rni0("nvyqpit", -93109306, -1774800971, -1774800967, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("dxwwak", -93109312, -1774800971, -1774800922, -1774800973, -93109312, -93109312, -93109312)[0]] = lv4;
        lv[] lvArray = new lv[Pq.I1n0rni0("nvyqpit", -93109312, -1774800971, -1774801011, -1774801012, -93109312, -93109312, -93109312)[0]];
        lvArray[Pq.I1n0rni0("teet", -93109312, -1774800971, -1774800924, -1774801017, -93109312, -93109312, -93109312)[3]] = (lv)((Object)Pq.I1n0rni0("abel", -93109306, -1774800971, -1774800989, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("abel", -93109312, -1774800971, -1774800922, -1774800973, -93109312, -93109312, -93109312)[1]]);
        lvArray[Pq.I1n0rni0("yakki", -93109312, -1774800971, -1774800924, -1774801017, -93109312, -93109312, -93109312)[4]] = (lv)((Object)Pq.I1n0rni0("nvyqpit", -93109306, -1774800971, -1774800989, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("hwexrkh", -93109312, -1774800971, -1774800922, -1774800973, -93109312, -93109312, -93109312)[2]]);
        lvArray[Pq.I1n0rni0("vpuo", -93109312, -1774800971, -1774801011, -1774801012, -93109312, -93109312, -93109312)[1]] = (lv)((Object)Pq.I1n0rni0("vpuo", -93109306, -1774800971, -1774800967, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("vpuo", -93109312, -1774800971, -1774800922, -1774800973, -93109312, -93109312, -93109312)[3]]);
        CallSite callSite = Pq.I1n0rni0("hwexrkh", -93109302, -1774800927, -1774800970, -1774800928, -93109302, -93109302, -93109302, (lY)this, (String)((Object)Pq.I1n0rni0("vpuo", -93109312, -1774800971, -1774800923, -1774800981, -93109312, -93109312, -93109312)[3]), (lv[])lvArray);
        Pq.I1n0rni0("hwexrkh", -93109306, -1774800971, -1774800967, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("gnndopb", -93109312, -1774800971, -1774800922, -1774800973, -93109312, -93109312, -93109312)[4]] = callSite;
        lT lT2 = (lT)((Object)Pq.I1n0rni0("hwexrkh", -93109308, -1774800995, -1774801000, -1774800926, -93109308, -93109308, -93109308, (lT)((Object)Pq.I1n0rni0("wegl", -93109302, -1774800927, -1774801000, -1774800925, -93109302, -93109302, -93109302, (lY)this, (String)((Object)Pq.I1n0rni0("yakki", -93109312, -1774800971, -1774800972, -1774800981, -93109312, -93109312, -93109312)[0]), (boolean)Pq.I1n0rni0("yakki", -93109312, -1774800971, -1774800924, -1774801017, -93109312, -93109312, -93109312)[5])), lw2 -> {
            Pq.I1n0rni0("gnndopb", -93109308, -1774800971, -1774800991, -1774800992, 285071238, -2022185428, -1063707322, (Pq)this);
            return (boolean)(Pq.I1n0rni0("dxwwak", -93109301, -1774801015, -1774801016, -1774800986, 285071238, -2022185428, -1063707322, (List)((List)((Object)Pq.I1n0rni0("aylazs", -93109308, -1774801010, -1774800963, -1774800996, 285071238, -2022185428, -1063707322, (lj)((lj)((Object)Pq.I1n0rni0("teet", -93109306, -1774800971, -1774800967, -1774800975, -1484363626, 663758746, -1437514812, (Pq)this)[Pq.I1n0rni0("aylazs", -93109312, -1774800971, -1774800990, -1774800973, 1819025691, 530871516, 2037902939)[7]])))))) == false ? Pq.I1n0rni0("abel", -93109312, -1774800971, -1774801023, -1774801017, -2077386800, 966047386, -244631355)[5] : Pq.I1n0rni0("dxwwak", -93109312, -1774800971, -1774801023, -1774801017, -259415372, -1088698390, 2025941988)[6]);
        }));
        Pq.I1n0rni0("hwexrkh", -93109306, -1774800971, -1774800967, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("rcygtieh", -93109312, -1774800971, -1774800922, -1774800973, -93109312, -93109312, -93109312)[5]] = lT2;
        String[] stringArray = new String[Pq.I1n0rni0("rcygtieh", -93109312, -1774800971, -1774801011, -1774801012, -93109312, -93109312, -93109312)[2]];
        stringArray[Pq.I1n0rni0("rcygtieh", -93109312, -1774800971, -1774800924, -1774801017, -93109312, -93109312, -93109312)[6]] = Pq.I1n0rni0("hwexrkh", -93109312, -1774800971, -1774800972, -1774800981, -93109312, -93109312, -93109312)[1];
        stringArray[Pq.I1n0rni0("abel", -93109312, -1774800971, -1774800963, -1774801017, -93109312, -93109312, -93109312)[0]] = Pq.I1n0rni0("hwexrkh", -93109312, -1774800971, -1774800972, -1774800981, -93109312, -93109312, -93109312)[2];
        String[] stringArray2 = stringArray;
        Pq.I1n0rni0("abel", -93109306, -1774800971, -1774800967, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("abel", -93109312, -1774800971, -1774800985, -1774800973, -93109312, -93109312, -93109312)[0]] = stringArray2;
        CallSite callSite2 = Pq.I1n0rni0("nvyqpit", -93109302, -1774800980, -1774800915, -1774800916, -93109302, -93109302, -93109302, (String)((Object)Pq.I1n0rni0("abel", -93109312, -1774800971, -1774800972, -1774800981, -93109312, -93109312, -93109312)[3]));
        Pq.I1n0rni0("nvyqpit", -93109306, -1774800971, -1774800967, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("nvyqpit", -93109312, -1774800971, -1774800985, -1774800973, -93109312, -93109312, -93109312)[1]] = callSite2;
        CallSite callSite3 = Pq.I1n0rni0("gnndopb", -93109302, -1774800980, -1774800915, -1774800916, -93109302, -93109302, -93109302, (String)((Object)Pq.I1n0rni0("rcygtieh", -93109312, -1774800971, -1774800972, -1774800981, -93109312, -93109312, -93109312)[4]));
        Pq.I1n0rni0("abel", -93109306, -1774800971, -1774800967, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("vpuo", -93109312, -1774800971, -1774800976, -1774800973, -93109312, -93109312, -93109312)[0]] = callSite3;
        CallSite callSite4 = Pq.I1n0rni0("dxwwak", -93109302, -1774800980, -1774800915, -1774800919, -93109302, -93109302, -93109302, (String)(".*(" + (String)((Object)Pq.I1n0rni0("teet", -93109302, -1774800982, -1774800913, -1774800914, -93109302, -93109302, -93109302, (CharSequence)((Object)Pq.I1n0rni0("yakki", -93109312, -1774800971, -1774800972, -1774800981, -93109312, -93109312, -93109312)[5]), (CharSequence[])((String[])Pq.I1n0rni0("vpuo", -93109306, -1774800971, -1774800967, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("wegl", -93109312, -1774800971, -1774800976, -1774800973, -93109312, -93109312, -93109312)[1]]))) + ").*"), (int)Pq.I1n0rni0("abel", -93109312, -1774800971, -1774801011, -1774801012, -93109312, -93109312, -93109312)[3]);
        Pq.I1n0rni0("rcygtieh", -93109306, -1774800971, -1774800967, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("hwexrkh", -93109312, -1774800971, -1774800976, -1774800973, -93109312, -93109312, -93109312)[2]] = callSite4;
    }

    static {
        Pq.ntfClinit();
    }

    private void B(String string) {
        if (Pq.I1n0rni0("nvyqpit", -93109308, -1774800971, -1774800991, -1774800997, -93109308, -93109308, -93109308, (Pq)this, (String)string) != false) {
            return;
        }
        if (Pq.I1n0rni0("aylazs", -93109308, -1774800971, -1774800985, -1774800997, -93109308, -93109308, -93109308, (Pq)this, (String)string) != false) {
            return;
        }
        Pq.I1n0rni0("hwexrkh", -93109308, -1774800971, -1774800963, -1774800969, -93109308, -93109308, -93109308, (Pq)this, (String)string);
    }

    @Override
    public boolean Z() {
        Pq.I1n0rni0("abel", -93109308, -1774800965, -1774800966, -1774800987, -93109308, -93109308, -93109308, (NNNpr)Pq.I1n0rni0("rcygtieh", -93109308, -1774800962, -1774800967, -1774800968, -93109308, -93109308, -93109308, (NNzU)Pq.I1n0rni0("nvyqpit", -93109308, -1774800964, -1774800963, -1774800961, -93109308, -93109308, -93109308, (NNBM)((NNBM)Pq.I1n0rni0("yakki", -93109306, -1774800974, -1774800963, -1774800975, -93109306, -93109306, -93109306, (NNuU)((NNuU)Pq.I1n0rni0("vpuo", -93109306, -1774800971, -1774800970, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("rcygtieh", -93109312, -1774800971, -1774800976, -1774800973, -93109312, -93109312, -93109312)[3]]))[Pq.I1n0rni0("wegl", -93109312, -1774800971, -1774800976, -1774800973, -93109312, -93109312, -93109312)[4]]))), this::B);
        return (boolean)Pq.I1n0rni0("teet", -93109307, -1774800988, -1774800985, -1774800986, -93109307, -93109307, -93109307, (UM)this);
    }

    private boolean Z(String string) {
        block6: {
            block5: {
                Pq.I1n0rni0("dxwwak", -93109308, -1774800971, -1774800991, -1774800992, -93109308, -93109308, -93109308, (Pq)this);
                if (Pq.I1n0rni0("rcygtieh", -93109308, -1774800979, -1774800976, -1774800986, -93109308, -93109308, -93109308, (lv)((lv)((Object)Pq.I1n0rni0("wegl", -93109306, -1774800971, -1774800967, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("teet", -93109312, -1774800971, -1774800990, -1774800973, -93109312, -93109312, -93109312)[1]]))) == false) break block5;
                if (Pq.I1n0rni0("gnndopb", -93109308, -1774800982, -1774800998, -1774801019, 285071238, -2022185428, -1063707322, (String)string, (CharSequence)((Object)Pq.I1n0rni0("rcygtieh", -93109312, -1774800971, -1774800972, -1774800981, -304821069, 1072800620, 645904729)[7])) != false) break block6;
            }
            return (boolean)Pq.I1n0rni0("nvyqpit", -93109312, -1774800971, -1774801020, -1774801017, -93109312, -93109312, -93109312)[1];
        }
        CallSite callSite = Pq.I1n0rni0("rcygtieh", -93109308, -1774800980, -1774800977, -1774800978, 285071238, -2022185428, -1063707322, (Pattern)((Pattern)((Object)Pq.I1n0rni0("wegl", -93109306, -1774800971, -1774800967, -1774800975, -92559124, -1689981620, 1376563426, (Pq)this)[Pq.I1n0rni0("teet", -93109312, -1774800971, -1774800990, -1774800973, -1758447959, 1790620242, 2119400994)[2]])), (CharSequence)string);
        if (Pq.I1n0rni0("gnndopb", -93109308, -1774800983, -1774801018, -1774800986, 285071238, -2022185428, -1063707322, (Matcher)((Object)callSite)) == false) {
            return (boolean)Pq.I1n0rni0("vpuo", -93109312, -1774800971, -1774801020, -1774801017, 1118838201, -1111777704, 754380014)[2];
        }
        CallSite callSite2 = Pq.I1n0rni0("nvyqpit", -93109308, -1774800983, -1774801024, -1774801021, 285071238, -2022185428, -1063707322, (Matcher)((Object)callSite), (int)Pq.I1n0rni0("yakki", -93109312, -1774800971, -1774801023, -1774801017, 1989483963, 1750868749, -1640926582)[0]);
        if (Pq.I1n0rni0("nvyqpit", -93109308, -1774800993, -1774800994, -1774800986, 285071238, -2022185428, -1063707322, (Boolean)((Boolean)((Object)Pq.I1n0rni0("yakki", -93109308, -1774800995, -1774800963, -1774800996, 285071238, -2022185428, -1063707322, (lT)((lT)((Object)Pq.I1n0rni0("gnndopb", -93109306, -1774800971, -1774800967, -1774800975, -466841013, -1562821937, 1721713820, (Pq)this)[Pq.I1n0rni0("hwexrkh", -93109312, -1774800971, -1774800990, -1774800973, 1064731080, -31888019, 85920812)[3]])))))) != false && Pq.I1n0rni0("aylazs", -93109308, -1774800971, -1774801022, -1774800997, 285071238, -2022185428, -1063707322, (Pq)this, (String)((Object)callSite2)) == false) {
            return (boolean)Pq.I1n0rni0("nvyqpit", -93109312, -1774800971, -1774801023, -1774801017, 1587329249, 221358179, 1589208880)[1];
        }
        Pq.I1n0rni0("teet", -93109302, -1774800999, -1774801000, -1774800969, 285071238, -2022185428, -1063707322, (String)("/clan accept " + (String)((Object)callSite2)));
        return (boolean)Pq.I1n0rni0("yakki", -93109312, -1774800971, -1774801023, -1774801017, 333074582, -795783205, -1086769450)[2];
    }

    private void i(String string) {
        Pq.I1n0rni0("teet", -93109308, -1774800971, -1774800991, -1774800992, -93109308, -93109308, -93109308, (Pq)this);
        if (Pq.I1n0rni0("abel", -93109308, -1774800979, -1774800976, -1774800986, -93109308, -93109308, -93109308, (lv)((lv)((Object)Pq.I1n0rni0("vpuo", -93109306, -1774800971, -1774800989, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("rcygtieh", -93109312, -1774800971, -1774800990, -1774800973, -93109312, -93109312, -93109312)[4]]))) == false) {
            return;
        }
        CallSite callSite = Pq.I1n0rni0("yakki", -93109308, -1774800980, -1774800977, -1774800978, -93109308, -93109308, -93109308, (Pattern)((Pattern)((Object)Pq.I1n0rni0("teet", -93109306, -1774800971, -1774800967, -1774800975, -93109306, -93109306, -93109306, (Pq)this)[Pq.I1n0rni0("dxwwak", -93109312, -1774800971, -1774800990, -1774800973, -93109312, -93109312, -93109312)[5]])), (CharSequence)string);
        if (Pq.I1n0rni0("abel", -93109308, -1774800983, -1774800984, -1774800986, -93109308, -93109308, -93109308, (Matcher)((Object)callSite)) == false) {
            return;
        }
        if (Pq.I1n0rni0("abel", -93109301, -1774801008, -1774801005, -1774801006, 285071238, -2022185428, -1063707322, (Stream)((Object)Pq.I1n0rni0("yakki", -93109302, -1774801001, -1774801002, -1774801007, 285071238, -2022185428, -1063707322, (Object[])Pq.I1n0rni0("gnndopb", -93109308, -1774800982, -1774801003, -1774801004, 285071238, -2022185428, -1063707322, (String)string, (String)((Object)Pq.I1n0rni0("rcygtieh", -93109312, -1774800971, -1774800991, -1774800981, 274016659, -443888425, -475507813)[0])))), this::n) != false) {
            if (Pq.I1n0rni0("abel", -93109308, -1774800993, -1774800994, -1774800986, 285071238, -2022185428, -1063707322, (Boolean)((Boolean)((Object)Pq.I1n0rni0("vpuo", -93109308, -1774800995, -1774800963, -1774800996, 285071238, -2022185428, -1063707322, (lT)((lT)((Object)Pq.I1n0rni0("yakki", -93109306, -1774800971, -1774800967, -1774800975, -631183865, -1328665590, -641103379, (Pq)this)[Pq.I1n0rni0("yakki", -93109312, -1774800971, -1774800990, -1774800973, -1916532540, -307774268, 1536313922)[6]])))))) != false) {
                return;
            }
        }
        Pq.I1n0rni0("teet", -93109302, -1774800999, -1774801000, -1774800969, 285071238, -2022185428, -1063707322, (String)((Object)Pq.I1n0rni0("rcygtieh", -93109312, -1774800971, -1774800991, -1774800981, -1013925220, 408318691, -502307261)[1]));
    }

    private static /* synthetic */ String b(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-78, -59, -31, -41, -48, -119, 71, -14, -9, 48, -59, 25, -17, 62, 74, -83};
        int n = 0;
        int n2 = 118;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 213;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        m = new short[]{0, 1};
        R = new short[]{0, 0, 1, 0, 1, 2};
        Z = new short[]{3, 4};
        U = new short[]{5, 3, 6, 0, 6};
        M = new short[]{0, 1, 4};
        W = new short[]{2, 0, 5, 2, 0, 6, 2, 1};
    }

    private static /* synthetic */ String s(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{9, 115, -125, -78, -85, -40, 68, -31, 41, 124, 15, 53, -40, 28, 122, -124};
        int n = 0;
        int n2 = 213;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 253;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void s() {
        j = new boolean[]{true, false, false, false, true, true, false};
        i = new boolean[]{true, false, false, true, false};
        T = new boolean[]{true, false, false};
        s = new boolean[]{true, false, true, true, false, true, false};
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean n(String string) {
        CallSite callSite;
        if (Pq.I1n0rni0("aylazs", -93109308, -1774800904, -1774800967, -1774800997, 285071238, -2022185428, -1063707322, (MX)((Object)Pq.I1n0rni0("rcygtieh", -93109302, -1774800897, -1774800898, -1774800903, 285071238, -2022185428, -1063707322)), (String)string) == false && Pq.I1n0rni0("abel", -93109308, -1774800902, -1774800970, -1774800997, 285071238, -2022185428, -1063707322, (Mp)((Object)Pq.I1n0rni0("nvyqpit", -93109302, -1774800897, -1774801000, -1774800901, 285071238, -2022185428, -1063707322)), (String)string) == false) {
            callSite = Pq.I1n0rni0("dxwwak", -93109312, -1774800971, -1774801023, -1774801017, -43922747, -1657073715, -1734773904)[4];
            return (boolean)callSite;
        }
        callSite = Pq.I1n0rni0("nvyqpit", -93109312, -1774800971, -1774801023, -1774801017, 1913628610, -2011888367, -2089790010)[3];
        return (boolean)callSite;
    }

    private static void m() {
        b = new byte[]{3, 2, 2, 32, 2, 7};
    }

    private static /* synthetic */ String m(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-61, -61, 37, -103, 27, 72, 0, 34, -117, -87, -120, -75, 103, 122, 53, -62};
        int n = 0;
        int n2 = 162;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 185;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String t(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{106, 61, 7, -17, -123, -39, -28, 97, -38, 114, -7, 63, 49, 1, -106, 123};
        int n = 0;
        int n2 = 139;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 83;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String v(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-51, -109, 123, -112, -33, 112, 18, 106, -54, 75, -69, -88, 68, -112, 91, -23};
        int n = 0;
        int n2 = 208;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 241;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String j(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-60, 35, -95, 47, -63, -87, 68, 84, 46, -34, -104, -57, -14, 26, -108, 41};
        int n = 0;
        int n2 = 12;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 61;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-33, -94, 59, -90, -53, -68, -25, -89, 127, -35, -20, 112, 49, 54, -26, 60};
        int n = 0;
        int n2 = 254;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 25;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{46, 104, 40, 51, -94, -73, 120, 55, 97, -8, -103, -18, 126, 50, -18, 24};
        int n = 0;
        int n2 = 180;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 121;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{12, -63, -127, -65, 2, -58, -118, 104, 5, -92, -61, -56, 38, -73, 19, -102};
        int n = 0;
        int n2 = 208;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 245;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return (Integer.rotateRight(-Integer.rotateLeft(Integer.rotateLeft(n, 5), 10), 30) ^ 0xE4A64069) + 1 ^ 0xC1572A91;
    }

    private /* synthetic */ void y(String string) {
        Pq.I1n0rni0("abel", -93109308, -1774800971, -1774800972, -1774800969, 285071238, -2022185428, -1063707322, (Pq)this, (String)string);
    }

    private static /* synthetic */ int y(int n) {
        return (Integer.rotateRight((Integer.rotateLeft(n, 24) ^ 0x9A353669) + 1, 1) ^ 0x47386DC3) + 1 ^ 0x2810BD7D;
    }

    private static /* synthetic */ String E(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-68, 42, 115, 4, 45, -5, 125, 69, -29, 65, -114, 35, 19, 60, -73, 20};
        int n = 0;
        int n2 = 169;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 225;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(n ^ 0x887271C1, 27) ^ 0x6EC21666, 31), 31) ^ 0x5408577B;
    }

    @uF
    public void N(Rs rs) {
        CallSite callSite;
        if (Pq.I1n0rni0("gnndopb", -93109302, -1774801013, -1774800989, -1774800986, 285071238, -2022185428, -1063707322) != false || !((callSite = Pq.I1n0rni0("vpuo", -93109308, -1774801014, -1774800989, -1774800907, 285071238, -2022185428, -1063707322, (Rs)rs)) instanceof NNNwd)) {
            return;
        }
        NNNwd nNNwd = (NNNwd)callSite;
        callSite = Pq.I1n0rni0("hwexrkh", -93109302, -1774800909, -1774801000, -1774800910, 285071238, -2022185428, -1063707322, (String)((Object)Pq.I1n0rni0("vpuo", -93109301, -1774800906, -1774800911, -1774800912, 285071238, -2022185428, -1063707322, (NAN)Pq.I1n0rni0("wegl", -93109308, -1774800908, -1774801000, -1774800905, 285071238, -2022185428, -1063707322, (NNNwd)nNNwd))));
        Pq.I1n0rni0("abel", -93109308, -1774800974, -1774800899, -1774800900, 285071238, -2022185428, -1063707322, (NNuU)((NNuU)Pq.I1n0rni0("dxwwak", -93109306, -1774800971, -1774800970, -1774800975, 989929202, -382060645, -989512992, (Pq)this)[Pq.I1n0rni0("teet", -93109312, -1774800971, -1774801009, -1774800973, 59029323, 1134564739, 217675835)[0]]), () -> this.y((String)((Object)callSite)));
    }

    private static /* synthetic */ String W(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-112, -6, -69, 112, 2, -38, -79, 40, -35, -35, 102, 89, -49, -79, 21, 96};
        int n = 0;
        int n2 = 168;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            ++n2;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-24, 101, 33, -27, 114, 24, -63, -8, -24, -24, 0, -106, 17, -81, 26, 13};
        int n = 0;
        int n2 = 230;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 157;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Ilsrnr0 = "coX\u00f0\u00f0'\u00c3EaC\u00e1\u00b6>\u00d2\u00cf\n\u00ca\u0015h\u00dee^%\u007faA\u00f4\u00fc9\u00c8\u00deaC\u00e1\u00b6>\u00d2\u00cf\n\u00ca&\u007f\u00cba_\u00eaJeA\u00d3\u00ed9\u00cf\u00c8\u0001\u00dcoZ\u00ec\u00fc*\u00c8\u00f0\u0007\u0089\u0012h\u007fDs\u00fa\u00cb\u000e\u00cb\u0089(\u00ab)z\u00dd5)y\u00cb\u00dd\r\u00dc\u00f4#\u0088H@\u00e1;\u00f6\u00d6aA\u00e3\u00f1.\u00d4\nL~\u00c4\u00df1\u00f4\u00e3\u000b\u00ca\u000bT\u0082LL9Ta\u001a\u00ec\u00f8%\u00c1\u00895\u0091\u0015d\u00d7g\u001d\u0003nKq\u00c6\u00e3\u0019\u00e3\u00cbI\u0089\u00116\u0090Lm\u001cdzg\u00c5\u00f4d\u00ca\u00cc]\u00db1\u009c)y\u00cb\u00dd\r\u00dc\u00f4#\u0088HC\u00f8N\u001d\u0005[y\u00ea\u00f8=\u00c7\u0089\n\u0084\tj\u0096OD2HcA\u00bb\u00b0\u0007\u00cc\u00c7\u0010\u0084Hx\u00cdiJw^tG\u00e5\u00f8&\u0089\u00f5\u0012\u0097\u0002l\u00d4;!S\u008cDs\u00fa\u00cb\u000e\u00cb\u0089(\u00a4)\u00a4L_\u00e1\u00ef*\u0089\u00ca\u0007\u008b\u0000\"\u00eatT\u00ff\u00e2g\u000e\u00a9\u00d5!\u00c7\u00d0\u0007\u00ca\u000bl\u00d7g\t\u00c5\u00f8r\\\u00ee\u00fep\u000fbexP\u00e3\u00ec?\u00c3\u0007L_\u00e1\u00ef*\u0089\u00ca\u0007\u008b\u0000\"\u00ebuHdNbY\u00e5\u00a2b\u00f0c)y\u00cb\u00dd\r\u00dc\u00f4#\u0088HC\u00f8C\u001dRL~\u00c4\u00df1\u00f4\u00e3\u000b\u00ca\u000bT\u0082LL\u00f7\fa\u001a\u00ec\u00f8%\u00c1\u00895\u0091\u0015d\u00d7g\u001d\u00ccSL~\u00c4\u00df1\u00f4\u00e3\u000b\u00ca\u000bY\u0082cDs\u00fa\u00cb\u000e\u00cb\u0089(\u00ab)}\u00cb\u0096L_\u00e1\u00ef*\u0089\u00ca\u0007\u008b\u0000\"\u00fahG\u00eb\u00edeD\u00f5\u00fc%\u00c5\u00c3]\u00be+g\u00d8vG\u00b6\u00d2a[\u00e7\u00b6\b\u00ce\u00c7\u0014\u00b6\u0002|\u00cceH\u00fa\u00db;\u001c\u00cc\u00f3*\u00d0\u00c7I\u0089\u0006c\u00de/u\u00ed\u00cci[\u00e7\u00a2^\u00efDs\u00fa\u00cb\u000e\u00cb\u0089+\u0095\u0007)y\u00ea\u00f8=\u00c7\u0089\n\u0084\tj\u0096OD`JcA\u00bb5L_\u00e1\u00ef*\u0089\u00ca\u0007\u008b\u0000\"\u00eatT1sg\u000e\u00c9\u00b0\u0007\u00cc\u00c7\u0010\u0084Hx\u00cdiJwoeR\u00e5\u00e1d\u00f6\u00c7\u0012\u0091\u0002\u007f\u00d7;\u00ba)y\u00cb\u00dd\r\u00dc\u00f4#\u0088HC\u00f7NV*\u00a9\u00c7o[\u00f4\u00f8\"\u00c8\u00d5\u00dc^\u00c7Ds\u00fa\u00cb\u000e\u00cb\u0089(\u00ab\u0012XKDs\u00fa\u00cb\u000e\u00cb\u0089\n\u0093tB\u0007L_\u00e1\u00ef*\u0089\u00ca\u0007\u008b\u0000\"\u00eatTcAg\u000e\u00a9\u00d5!\u00c7\u00d0\u0007\u00ca\u0012y\u00d0l\txJgP\u00f8\u00b6\u001b\u00c7\u00d2\u0012\u0080\u0015c\u00821Ds\u00fa\u00cb\u000e\u00cb\u0089(\u00b5\u000f\u00f0Ds\u00fa\u00cb\u000e\u00cb\u0089\u001fi\u00e2\u00a4L_\u00e1\u00ef*\u0089\u00d3\u0012\u008c\u000b\"\u00dfuH\u00f5\u00f8iZ\u00ee\u00b6\u001b\u00d4\u00c3\u0002\u008c\u0004l\u00cde\u001d\u00bf\u00d6\u0096L_\u00e1\u00ef*\u0089\u00ca\u0007\u008b\u0000\"\u00fahG\u00eb\u00edeD\u00f5\u00fc%\u00c5\u00c3]\u00cc+g\u00d8vG\u00b6\u00cbt\\\u00ec\u00b69\u00c3\u00c1\u0003\u009dH@\u00d8tE\u00f1\u00dbr\u000ecL_\u00e1\u00ef*\u0089\u00ca\u0007\u008b\u0000\"\u00fahGx\u0018eD\u00f5\u00fc%\u00c5\u00c3]\u00cc=fDs\u00fa\u00cb\u000e\u00cb\u0089\n\u008eRI\u001c\u00cc\u00f3*\u00d0\u00c7I\u0089\u0006c\u00de/u\u00e2\bi[\u00e7\u00a2waC\u00e1\u00b6>\u00d2\u00cf\n\u00ca+d\u00cat\u00a4L_\u00e1\u00ef*\u0089\u00d3\u0012\u008c\u000b\"\u00dfuH\u00f5\u00f8iZ\u00ee\u00b6\u001b\u00d4\u00c3\u0002\u008c\u0004l\u00cde\u001d\u00bf\u00c0Kq\u00c6\u00e3\u0019\u00e3\u00cbI\u0089\u00106\n)c\u00b4tG\u00e5\u00f8&\u00d1o\\\u00eevL_\u00e1\u00ef*\u0089\u00ca\u0007\u008b\u0000\"\u00f6bL=Nt\u000eQ\u00caVDs\u00fa\u00cb\u000e\u00cb\u0089\u0011\u0087\u0000L_\u00e1\u00ef*\u0089\u00ca\u0007\u008b\u0000\"\u00eatT\u00ffFg\u000e\u00a9\u00c3\u0000)y\u00cb\u00dd\r\u00dc\u00f4#\u0088H@\u00c9;\u00be\u00efDs\u00fa\u00cb\u000e\u00cb\u00894\u0096\u00f5Ds\u00fa\u00cb\u000e\u00cb\u0089\n\u008f\u00d9sL_\u00e1\u00ef*\u0089\u00ca\u0007\u008b\u0000\"\u00eatT\u00ffFg\u000ewaC\u00e1\u00b6>\u00d2\u00cf\n\u00ca\u0015h\u00dee^wPaA\u00e3\u00f1.\u00d4\u00c2oG\u00c5\u00f8(\u00ce\u007fDs\u00fa\u00cb\u000e\u00cb\u00893\u00a8\u00d9Ds\u00fa\u00cb\u000e\u00cb\u0089+\u00bd\u00ef)o`}\u001cL_\u00e1\u00ef*\u0089\u00ca\u0007\u008b\u0000\"\u00eatTcZg\u000e\u00a9\u00c2\u0007\u00cc\u00c7\u0010\u0084Ha\u00d8nA%gtG\u00e9\u00f7,\u009d\u00a1i[\u00e4cDs\u00fa\u00cb\u000e\u00cb\u0089\u0011\u00bc\u00ffaA\u00e3\u00f1.\u00d5\u0093)y\u00cb\u00dd\r\u00dc\u00f4#\u0088HC\u00f7zs\u00a2\u00fbsp\u00ed\u00e9?\u00dfKDs\u00fa\u00cb\u000e\u00cb\u0089\n\u00b1\u00ee8pY\u00e9\u00edHaC\u00e1\u00b6>\u00d2\u00cf\n\u00ca\u0014y\u00cbeG5\rSA\u00f2\u00fc*\u00cbcL_\u00e1\u00ef*\u0089\u00d3\u0012\u008c\u000b\"\u00dfuHi?iZ\u00ee\u00b6\b\u00c9\u00c8\u0015\u0090\nh\u00cb;\u000f\\\u009cL_\u00e1\u00ef*\u0089\u00ca\u0007\u008b\u0000\"\u00eatT\u00f0\u00dag\u000e\u00a9\u00cf\u00f5Ds\u00fa\u00cb\u000e\u00cb\u0089(\u00ab\u001dX\n)y\u00ea\u00f8=\u00c7\u0089\n\u0084\tj\u0096SR*KnR\u00bb\u0095\u0014o[\u00e5\u00d4*\u00d2\u00c5\u000edDs\u00fa\u00cb\u000e\u00cb\u0089(\u00ab%@ErZ\u00f5\u00e9w\u00d1aC\u00e1\u00b6'\u00c7\u00c8\u0001\u00ca%b\u00d6lC\u00f8\u00d5v\u00efZ\u0000Ds\u00fa\u00cb\u000e\u00cb\u00896\u0094\u00ceaC\u00e1\u00b6'\u00c7\u00c8\u0001\u00ca4y\u00cbiH\u00f1";
        l1nqtpIjp = new int[]{83361802, 83165185, 76742677, 60358657, 56033299, 81985537, 14548994, 36110348, 41943041, 80871436, 70582288, 78118924, 57278465, 34340881, 23920653, 64552967, 74645536, 65011722, 72744961, 66322435, 66584577, 55181315, 0x1110001, 10420225, 36896778, 458775, 6225927, 44236851, 63045655, 70123527, 61800467, 84017168, 72810501, 66650151, 0x1E0010, 55377926, 11534382, 73138199, 80281609, 42074145, 72089610, 30015508, 82051089, 3604492, 57409546, 35979265, 58064917, 35454984, 47579163, 66519041, 83230722, 0x4200004, 29294593, 81657861, 50003989, 42008577, 0x1120001, 37552130, 6160385, 61079562, 51380238, 71630855, 69468170, 60424202, 19988495, 4390925, 10551311, 0xE0000B, 3014665, 78905364, 40632331, 15400998, 18022407, 18481175, 41353225, 57344001, 0x50000E, 65667082, 59441166, 29360138, 0xA00001, 36044801, 61734913, 80216065, 49348618, 6684729, 20971565, 52297772, 7, 37683245, 55771140, 24772677, 31326254};
        Pq.b();
        Pq.m();
        Pq.s();
        Pq.T();
    }

    private static /* synthetic */ String l1npO(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{88, -26, 112, 108, 117, -44, -29, -54, 19, -97, 34, 119, 69, -4, -20, 122};
        byte[] byArray3 = new byte[]{120, -6, -14, 95, 22, -118, -90, 104, 76, 4, 58, -10, -113, -122, 127, -109};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite l10mjIOp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = l1nqtpIjp[n2 ^ 0x9636AFB5];
        int n9 = n8 >>> 16;
        String string2 = Pq.l1npO(Ilsrnr0.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x9636AFB5);
        n8 = l1nqtpIjp[n3 ^ 0x9636AFB5];
        int n10 = n8 >>> 16;
        String string3 = Pq.l1npO(Ilsrnr0.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x9636AFB5);
        n8 = l1nqtpIjp[n4 ^ 0x9636AFB5];
        int n11 = n8 >>> 16;
        String string4 = Pq.l1npO(Ilsrnr0.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x9636AFB5);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xFA734372) + -178;
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

    private static /* synthetic */ void l1nlkOipr(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[93];
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
        Ilsrnr0 = stringBuilder.toString();
        l1nqtpIjp = nArray;
    }

    private static /* synthetic */ CallSite I1n0rni0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = l1nqtpIjp[n2 ^ 0x9636AFB5];
        int n9 = n8 >>> 16;
        String string2 = Pq.l1npO(Ilsrnr0.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x9636AFB5);
        n8 = l1nqtpIjp[n3 ^ 0x9636AFB5];
        int n10 = n8 >>> 16;
        String string3 = Pq.l1npO(Ilsrnr0.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x9636AFB5);
        n8 = l1nqtpIjp[n4 ^ 0x9636AFB5];
        int n11 = n8 >>> 16;
        String string4 = Pq.l1npO(Ilsrnr0.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x9636AFB5);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xFA734372) + -178;
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
