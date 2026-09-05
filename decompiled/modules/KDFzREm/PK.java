/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NCW
 *  KDFzREm.NCz
 *  KDFzREm.NNKE
 *  KDFzREm.NNNwS
 *  KDFzREm.NNYH
 *  KDFzREm.NNeZ
 *  KDFzREm.NNuU
 *  KDFzREm.NQl
 *  KDFzREm.NQo
 *  KDFzREm.NbL
 *  KDFzREm.Nbx
 *  KDFzREm.NkG
 *  KDFzREm.Nkq
 *  KDFzREm.Nww
 *  org.apache.commons.lang3.RandomUtils
 */
package KDFzREm;

import KDFzREm.NCW;
import KDFzREm.NCz;
import KDFzREm.NNKE;
import KDFzREm.NNNwS;
import KDFzREm.NNYH;
import KDFzREm.NNeZ;
import KDFzREm.NNuU;
import KDFzREm.NQl;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.Nbx;
import KDFzREm.NkG;
import KDFzREm.Nkq;
import KDFzREm.Nww;
import KDFzREm.Rs;
import KDFzREm.Ru;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.dS;
import KDFzREm.km;
import KDFzREm.lG;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.ll;
import KDFzREm.uF;
import KDFzREm.wy;
import KDFzREm.zl;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.SwitchBootstraps;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.RandomUtils;

@UZ(L="AutoArmor", y=UR.PLAYER, N=Uz.AUTO)
public class PK
extends UM {
    public Object[] L;
    private static boolean[] u;
    private static float[] i;
    private static boolean[] R;
    private static short[] M;
    private static short[] B;
    private static String[] Z;
    private static short[] z;
    private static boolean[] U;
    private static short[] W;
    private static byte[] m;
    private static short[] P;
    private static boolean[] s;
    private static short[] T;
    private static short[] b;
    private static /* synthetic */ String oomOOs;
    private static /* synthetic */ int[] oor0nl;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight((n ^ 0xD43A1315) + 1 ^ 0x4B69ED01, 26) ^ 0x6B451754;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean P() {
        CallSite callSite;
        if (PK.IIstI("gqcnuo", 1027108738, -1727513859, -1727513860, -1727513857, 910341240, -2114127796, 1329717802, (NkG)((NkG)PK.IIstI("svqacmr", 1027108738, -1727513861, -1727513862, -1727513877, 1482629820, 658951809, -843343050, (NNNwS)((NNNwS)PK.IIstI("gqcnuo", 1027108738, -1727513864, -1727513882, -1727513877, -1318969327, -1147173512, -2130799888, (NNuU)((NNuU)PK.IIstI("hkfpoo", 1027108738, -1727513879, -1727513881, -1727513877, 1449271197, -170831380, -1327272188, (PK)this)[PK.IIstI("hkfpoo", 1027108740, -1727513879, -1727513882, -1727513863, 860711585, -1364217691, -1083664426)[4]]))[PK.IIstI("nkscx", 1027108740, -1727513879, -1727513882, -1727513863, 1812765954, 817192734, -796796022)[5]]))[PK.IIstI("gqcnuo", 1027108740, -1727513879, -1727513882, -1727513863, -1459168045, -484182729, 1184755725)[6]])) == false) {
            if (!((NNYH)PK.IIstI("nkscx", 1027108738, -1727513864, -1727513858, -1727513877, -1718354507, 983237406, 376982698, (NNuU)((NNuU)PK.IIstI("siburgcn", 1027108738, -1727513879, -1727513881, -1727513877, 1545831692, 476404548, -1278559140, (PK)this)[PK.IIstI("svqacmr", 1027108740, -1727513879, -1727513882, -1727513863, 1707247093, -1232894113, -782648298)[7]]))[PK.IIstI("gqcnuo", 1027108740, -1727513879, -1727513871, -1727513863, -825650632, 1300504070, 1326334390)[0]] instanceof NNKE)) {
                callSite = PK.IIstI("afopsu", 1027108740, -1727513879, -1727513872, -1727513873, -1357329812, 1963725987, 123520222)[4];
                return (boolean)callSite;
            }
        }
        callSite = PK.IIstI("fetao", 1027108740, -1727513879, -1727513872, -1727513873, -797993705, 1583673551, -1009915205)[5];
        return (boolean)callSite;
    }

    private static void T() {
        m = new byte[]{20, 8, 6, 4, 5};
    }

    public PK() {
        PK.IIstI("afopsu", 1027108736, -1727513879, -1727513878, -1727513866, 1027108736, 1027108736, 1027108736, (PK)this);
        CallSite callSite = PK.IIstI("svqacmr", 1027108750, -1727513921, -1727513870, -1727513922, 1027108750, 1027108750, 1027108750, (lY)this, (String)((Object)PK.IIstI("afopsu", 1027108740, -1727513879, -1727513926, -1727513923, 1027108740, 1027108740, 1027108740)[0]), (lG)new lG((float)PK.IIstI("mhttwc", 1027108740, -1727513879, -1727513917, -1727513924, 1027108740, 1027108740, 1027108740)[0], (float)PK.IIstI("svqacmr", 1027108740, -1727513879, -1727513917, -1727513924, 1027108740, 1027108740, 1027108740)[1]), (lG)new lG((float)PK.IIstI("nkscx", 1027108740, -1727513879, -1727513917, -1727513924, 1027108740, 1027108740, 1027108740)[2], (float)PK.IIstI("fetao", 1027108740, -1727513879, -1727513917, -1727513924, 1027108740, 1027108740, 1027108740)[3]), (float)PK.IIstI("nkscx", 1027108740, -1727513879, -1727513917, -1727513924, 1027108740, 1027108740, 1027108740)[4]);
        PK.IIstI("afopsu", 1027108738, -1727513879, -1727513880, -1727513877, 1027108738, 1027108738, 1027108738, (PK)this)[PK.IIstI("fetao", 1027108740, -1727513879, -1727513935, -1727513863, 1027108740, 1027108740, 1027108740)[0]] = callSite;
        CallSite callSite2 = PK.IIstI("siburgcn", 1027108750, -1727513921, -1727513870, -1727513933, 1027108750, 1027108750, 1027108750, (lY)this, (String)((Object)PK.IIstI("mhttwc", 1027108740, -1727513879, -1727513926, -1727513923, 1027108740, 1027108740, 1027108740)[1]), (boolean)PK.IIstI("svqacmr", 1027108740, -1727513879, -1727513936, -1727513873, 1027108740, 1027108740, 1027108740)[0]);
        PK.IIstI("hkfpoo", 1027108738, -1727513879, -1727513880, -1727513877, 1027108738, 1027108738, 1027108738, (PK)this)[PK.IIstI("afopsu", 1027108740, -1727513879, -1727513935, -1727513863, 1027108740, 1027108740, 1027108740)[1]] = callSite2;
        CallSite callSite3 = PK.IIstI("siburgcn", 1027108750, -1727513921, -1727513870, -1727513933, 1027108750, 1027108750, 1027108750, (lY)this, (String)((Object)PK.IIstI("svqacmr", 1027108740, -1727513879, -1727513926, -1727513923, 1027108740, 1027108740, 1027108740)[2]), (boolean)PK.IIstI("hkfpoo", 1027108740, -1727513879, -1727513936, -1727513873, 1027108740, 1027108740, 1027108740)[1]);
        PK.IIstI("nkscx", 1027108738, -1727513879, -1727513880, -1727513877, 1027108738, 1027108738, 1027108738, (PK)this)[PK.IIstI("fetao", 1027108740, -1727513879, -1727513935, -1727513863, 1027108740, 1027108740, 1027108740)[2]] = callSite3;
        km km2 = new km();
        PK.IIstI("dimtn", 1027108738, -1727513879, -1727513880, -1727513877, 1027108738, 1027108738, 1027108738, (PK)this)[PK.IIstI("mhttwc", 1027108740, -1727513879, -1727513935, -1727513863, 1027108740, 1027108740, 1027108740)[3]] = km2;
    }

    static {
        PK.ntfClinit();
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 10), 27), 24), 29), 21);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{91, -118, 57, -97, 31, -20, -46, 21, -124, 69, -11, -8, 87, -47, -128, -100};
        int n = 0;
        int n2 = 174;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 237;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        i = new float[]{0.0f, 10.0f, 2.0f, 5.0f, 1.0f};
    }

    private static void s() {
        U = new boolean[]{false, false, false};
        s = new boolean[]{true, true, false, true, true, false, false};
        u = new boolean[]{false, true};
        R = new boolean[]{false, false, false, true, false, false, false};
    }

    private static void n() {
        M = new short[]{0, 1, 2, 3};
        W = new short[]{4, 0, 4};
        z = new short[]{4, 4, 0, 3, 2, 0, 4, 1};
        b = new short[]{1, 3, 4, 2};
        T = new short[]{4, 3, 5, 4, 0, 4, 3, 0};
        B = new short[]{3, 0, 4, 0, 4};
        P = new short[]{0, 0, 5, 3};
    }

    private void m() {
        if (PK.IIstI("dimtn", 1027108738, -1727513879, -1727513880, -1727513877, 1027108738, 1027108738, 1027108738, (PK)this) == null) {
            PK.IIstI("gqcnuo", 1027108739, -1727513879, -1727513880, -1727513877, 1027108739, 1027108739, 1027108739, (PK)this, (Object[])new Object[PK.IIstI("siburgcn", 1027108740, -1727513879, -1727513878, -1727513875, 1027108740, 1027108740, 1027108740)[2]]);
            CallSite callSite = PK.IIstI("nkscx", 1027108738, -1727513879, -1727513880, -1727513877, 1027108738, 1027108738, 1027108738, (PK)this);
            callSite[PK.IIstI("hkfpoo", 1027108740, -1727513879, -1727513878, -1727513875, 1027108740, 1027108740, 1027108740)[3]] = PK.IIstI("hkfpoo", 1027108750, -1727513874, -1727513887, -1727513888, 1027108750, 1027108750, 1027108750, (boolean)PK.IIstI("siburgcn", 1027108740, -1727513879, -1727513876, -1727513873, 1027108740, 1027108740, 1027108740)[5]);
            callSite[PK.IIstI("mhttwc", 1027108740, -1727513879, -1727513878, -1727513875, 1027108740, 1027108740, 1027108740)[4]] = PK.IIstI("nkscx", 1027108750, -1727513885, -1727513887, -1727513886, 1027108750, 1027108750, 1027108750, (int)PK.IIstI("gqcnuo", 1027108740, -1727513879, -1727513876, -1727513873, 1027108740, 1027108740, 1027108740)[6]);
        }
    }

    private void v() {
        PK.IIstI("nkscx", 1027108736, -1727513879, -1727513878, -1727513866, -309354380, 122761803, -477037880, (PK)this);
        CallSite callSite = PK.IIstI("mhttwc", 1027108750, -1727513885, -1727513887, -1727513886, -309354380, 122761803, -477037880, (int)PK.IIstI("svqacmr", 1027108736, -1727513950, -1727513928, -1727513925, -309354380, 122761803, -477037880, (RandomUtils)PK.IIstI("hkfpoo", 1027108750, -1727513950, -1727513947, -1727513948, -309354380, 122761803, -477037880), (int)PK.IIstI("fetao", 1027108736, -1727513946, -1727513870, -1727513927, -309354380, 122761803, -477037880, (lG)((lG)((Object)PK.IIstI("siburgcn", 1027108736, -1727513945, -1727513917, -1727513918, -309354380, 122761803, -477037880, (ll)((ll)((Object)PK.IIstI("nkscx", 1027108738, -1727513879, -1727513880, -1727513877, -2075752470, -1088750431, -175804367, (PK)this)[PK.IIstI("nkscx", 1027108740, -1727513879, -1727513907, -1727513863, -187045681, 219664212, 1312820777)[0]])))))), (int)((int)PK.IIstI("nkscx", 1027108736, -1727513946, -1727513880, -1727513927, -309354380, 122761803, -477037880, (lG)((lG)((Object)PK.IIstI("siburgcn", 1027108736, -1727513945, -1727513917, -1727513918, -309354380, 122761803, -477037880, (ll)((ll)((Object)PK.IIstI("dimtn", 1027108738, -1727513879, -1727513880, -1727513877, 1746737223, -1827915108, -677237910, (PK)this)[PK.IIstI("hkfpoo", 1027108740, -1727513879, -1727513907, -1727513863, 1323670679, -829961810, -194000126)[1]])))))))));
        PK.IIstI("nkscx", 1027108738, -1727513879, -1727513880, -1727513877, 404914744, -2086884781, -344243326, (PK)this)[PK.IIstI("siburgcn", 1027108740, -1727513879, -1727513907, -1727513863, 1489362696, 1722615139, 943996680)[2]] = callSite;
    }

    private static void j() {
        Z = new String[]{"delay-in-ticks", "swap-only-while-standing", "swap-only-while-inventory-open"};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{3, -8, -36, -90, 39, -112, -70, -97, -12, 28, 64, 30, 40, 116, 127, 100};
        int n = 0;
        int n2 = 97;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 191;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(-n, 27), 18) ^ 0xBE8EC18C, 19) ^ 0xF149E057;
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft((n ^ 0xA3AF4577) + 1, 4) ^ 0x197BBB1C, 15), 29);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{40, 94, 15, 6, 75, 70, -15, 78, -23, 116, -85, 58, -100, 79, -19, 91};
        int n = 0;
        int n2 = 187;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 127;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void N(NCz nCz) {
        PK.IIstI("gqcnuo", 1027108736, -1727513879, -1727513878, -1727513866, -309354380, 122761803, -477037880, (PK)this);
        if (PK.IIstI("hkfpoo", 1027108736, -1727513958, -1727513870, -1727513939, -309354380, 122761803, -477037880, (NCz)nCz) != false) {
            return;
        }
        if (PK.IIstI("nkscx", 1027108751, -1727513902, -1727513956, -1727513900, -309354380, 122761803, -477037880, (Stream)((Object)PK.IIstI("hkfpoo", 1027108751, -1727513914, -1727513904, -1727513901, -309354380, 122761803, -477037880, (List)((Object)PK.IIstI("gqcnuo", 1027108736, -1727513958, -1727513880, -1727513955, -309354380, 122761803, -477037880, (NCz)nCz)))), nQo -> (boolean)(PK.IIstI("siburgcn", 1027108736, -1727513883, -1727513876, -1727513884, -309354380, 122761803, -477037880, (NQo)nQo) == false ? PK.IIstI("siburgcn", 1027108740, -1727513879, -1727513876, -1727513873, -2094210601, -644100768, -1091119983)[3] : PK.IIstI("siburgcn", 1027108740, -1727513879, -1727513876, -1727513873, 2066757969, -1593217414, -705412956)[4])) != false) {
            CallSite callSite = PK.IIstI("afopsu", 1027108750, -1727513874, -1727513887, -1727513888, -309354380, 122761803, -477037880, (boolean)PK.IIstI("afopsu", 1027108740, -1727513879, -1727513872, -1727513873, 540118170, 1816329686, -748992403)[3]);
            PK.IIstI("siburgcn", 1027108738, -1727513879, -1727513880, -1727513877, -1661460626, -333048230, -256516201, (PK)this)[PK.IIstI("mhttwc", 1027108740, -1727513879, -1727513882, -1727513863, 146398052, 1048708819, 1215496856)[3]] = callSite;
        }
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 9), 27), 14) ^ 0xD75AF38A, 10) ^ 0xEACDC06F;
    }

    private void N(int n, wy wy2) {
        if (PK.IIstI("siburgcn", 1027108750, -1727513892, -1727513919, -1727513937, -309354380, 122761803, -477037880, n) != false) {
            PK.IIstI("dimtn", 1027108750, -1727513976, -1727513870, -1727513973, -309354380, 122761803, -477037880, n);
            PK.IIstI("afopsu", 1027108750, -1727513969, -1727513870, -1727513970, -309354380, 122761803, -477037880, (NbL)PK.IIstI("fetao", 1027108740, -1727513974, -1727513971, -1727513972, -1570406819, 691146516, -1854757634));
            PK.IIstI("hkfpoo", 1027108750, -1727513976, -1727513917, -1727513866, -309354380, 122761803, -477037880);
            return;
        }
        if (PK.IIstI("hkfpoo", 1027108736, -1727513883, -1727513876, -1727513884, -309354380, 122761803, -477037880, (NQo)PK.IIstI("mhttwc", 1027108736, -1727513861, -1727513984, -1727513981, -309354380, 122761803, -477037880, (NNNwS)((NNNwS)PK.IIstI("mhttwc", 1027108738, -1727513864, -1727513882, -1727513877, 816743940, -88129671, 1939877252, (NNuU)((NNuU)PK.IIstI("svqacmr", 1027108738, -1727513879, -1727513881, -1727513877, -466956683, 257001538, -1998721899, (PK)this)[PK.IIstI("siburgcn", 1027108740, -1727513879, -1727513871, -1727513863, 1241082025, 1412737638, -2100598795)[1]]))[PK.IIstI("hkfpoo", 1027108740, -1727513879, -1727513871, -1727513863, 1148167122, -865411571, -1033298060)[2]]), (Nbx)PK.IIstI("nkscx", 1027108736, -1727513916, -1727513881, -1727513983, -309354380, 122761803, -477037880, (wy)wy2))) != false) {
            PK.IIstI("hkfpoo", 1027108736, -1727513906, -1727513881, -1727513866, -309354380, 122761803, -477037880, (zl)((Object)PK.IIstI("gqcnuo", 1027108736, -1727513906, -1727513870, -1727513977, -309354380, 122761803, -477037880, (zl)((Object)PK.IIstI("gqcnuo", 1027108750, -1727513908, -1727513878, -1727513905, -309354380, 122761803, -477037880)), (int)PK.IIstI("afopsu", 1027108740, -1727513879, -1727513872, -1727513873, -1164868965, -850444566, 1934953631)[6], (int)n, (int)PK.IIstI("hkfpoo", 1027108740, -1727513879, -1727513919, -1727513873, -1531776439, -1877249275, -1296453248)[0], (Nkq)PK.IIstI("mhttwc", 1027108740, -1727513982, -1727513979, -1727513980, 1078310841, -187002351, -87714763))));
            return;
        }
        reference var3_3 = PK.IIstI("hkfpoo", 1027108736, -1727513960, -1727513870, -1727513939, -309354380, 122761803, -477037880, (Nww)PK.IIstI("dimtn", 1027108736, -1727513861, -1727513978, -1727513959, -309354380, 122761803, -477037880, (NNNwS)((NNNwS)PK.IIstI("gqcnuo", 1027108738, -1727513864, -1727513882, -1727513877, 12089285, 1300902873, 549345197, (NNuU)((NNuU)PK.IIstI("gqcnuo", 1027108738, -1727513879, -1727513881, -1727513877, -738500951, -1086744121, -773309707, (PK)this)[PK.IIstI("nkscx", 1027108740, -1727513879, -1727513871, -1727513863, 574437415, -1160899729, 26008350)[3]]))[PK.IIstI("fetao", 1027108740, -1727513879, -1727513871, -1727513863, 1807059485, -1098045798, 2114111261)[4]]))) % PK.IIstI("siburgcn", 1027108740, -1727513879, -1727513878, -1727513875, 460196691, -746209837, 608562674)[1] + PK.IIstI("fetao", 1027108740, -1727513879, -1727513919, -1727513873, 684824306, 322963904, -971164408)[1];
        PK.IIstI("afopsu", 1027108736, -1727513906, -1727513881, -1727513866, -309354380, 122761803, -477037880, (zl)((Object)PK.IIstI("dimtn", 1027108736, -1727513906, -1727513870, -1727513977, -309354380, 122761803, -477037880, (zl)((Object)PK.IIstI("fetao", 1027108736, -1727513906, -1727513870, -1727513977, -309354380, 122761803, -477037880, (zl)((Object)PK.IIstI("dimtn", 1027108736, -1727513906, -1727513870, -1727513977, -309354380, 122761803, -477037880, (zl)((Object)PK.IIstI("afopsu", 1027108750, -1727513908, -1727513878, -1727513905, -309354380, 122761803, -477037880)), (int)PK.IIstI("dimtn", 1027108740, -1727513879, -1727513876, -1727513873, 376317639, -84923340, -1173572837)[0], (int)n, (int)var3_3, (Nkq)PK.IIstI("fetao", 1027108740, -1727513982, -1727513957, -1727513980, -549169423, -1027417363, -2138757332))), (int)PK.IIstI("afopsu", 1027108740, -1727513879, -1727513876, -1727513873, 746378405, 45401739, -1786973839)[1], (int)PK.IIstI("afopsu", 1027108736, -1727513916, -1727513870, -1727513939, -309354380, 122761803, -477037880, (wy)wy2), (int)var3_3, (Nkq)PK.IIstI("svqacmr", 1027108740, -1727513982, -1727513957, -1727513980, 1369697903, 1523353077, -1157322837))), (int)PK.IIstI("mhttwc", 1027108740, -1727513879, -1727513876, -1727513873, -1275719402, -1748225459, -2019366340)[2], (int)n, (int)var3_3, (Nkq)PK.IIstI("svqacmr", 1027108740, -1727513982, -1727513957, -1727513980, -1786785581, -652218502, 795510309))));
    }

    @uF
    public void N(Ru ru) {
        PK.IIstI("fetao", 1027108736, -1727513879, -1727513878, -1727513866, -309354380, 122761803, -477037880, (PK)this);
        if (PK.IIstI("nkscx", 1027108738, -1727513861, -1727513912, -1727513857, 1030041235, -1192394569, 707444750, (NNNwS)((NNNwS)PK.IIstI("fetao", 1027108738, -1727513864, -1727513882, -1727513877, -1120141216, 1654139180, 1562518362, (NNuU)((NNuU)PK.IIstI("siburgcn", 1027108738, -1727513879, -1727513881, -1727513877, 1770191994, 2096681406, -444118258, (PK)this)[PK.IIstI("mhttwc", 1027108740, -1727513879, -1727513911, -1727513863, 1050794373, 735870816, 1434459445)[1]]))[PK.IIstI("gqcnuo", 1027108740, -1727513879, -1727513911, -1727513863, -1211497777, -2086675652, 1410884240)[2]])) % PK.IIstI("mhttwc", 1027108740, -1727513879, -1727513878, -1727513875, 1817717451, 1496039269, -1070303438)[0] == false) {
            CallSite callSite = PK.IIstI("mhttwc", 1027108750, -1727513874, -1727513887, -1727513888, -309354380, 122761803, -477037880, (boolean)PK.IIstI("nkscx", 1027108740, -1727513879, -1727513872, -1727513873, -1588492393, 276461700, 1794993097)[1]);
            PK.IIstI("dimtn", 1027108738, -1727513879, -1727513880, -1727513877, 834274011, 148888717, -2129784041, (PK)this)[PK.IIstI("hkfpoo", 1027108740, -1727513879, -1727513909, -1727513863, 1317499408, -105367058, 1336953235)[0]] = callSite;
        }
        if (PK.IIstI("nkscx", 1027108736, -1727513874, -1727513910, -1727513884, -309354380, 122761803, -477037880, (Boolean)((Boolean)((Object)PK.IIstI("fetao", 1027108738, -1727513879, -1727513880, -1727513877, 1004896054, -1674238699, -930597127, (PK)this)[PK.IIstI("svqacmr", 1027108740, -1727513879, -1727513909, -1727513863, -718084438, 7985957, -1746130736)[1]]))) == false || PK.IIstI("afopsu", 1027108736, -1727513879, -1727513907, -1727513884, -309354380, 122761803, -477037880, (PK)this) == false) {
            return;
        }
        if (PK.IIstI("nkscx", 1027108736, -1727513906, -1727513919, -1727513884, -309354380, 122761803, -477037880, (zl)((Object)PK.IIstI("fetao", 1027108750, -1727513908, -1727513878, -1727513905, -309354380, 122761803, -477037880))) != false) {
            return;
        }
        if (!((NNYH)PK.IIstI("nkscx", 1027108738, -1727513864, -1727513858, -1727513877, -1482566549, -720054601, -537597355, (NNuU)((NNuU)PK.IIstI("dimtn", 1027108738, -1727513879, -1727513881, -1727513877, 883232246, 1375109592, 1146889718, (PK)this)[PK.IIstI("hkfpoo", 1027108740, -1727513879, -1727513909, -1727513863, -1808573230, 711440789, -1914634002)[2]]))[PK.IIstI("mhttwc", 1027108740, -1727513879, -1727513909, -1727513863, -1663483742, -1944104949, 1568787524)[3]] instanceof NNeZ)) {
            if (PK.IIstI("svqacmr", 1027108736, -1727513874, -1727513910, -1727513884, -309354380, 122761803, -477037880, (Boolean)((Boolean)((Object)PK.IIstI("gqcnuo", 1027108736, -1727513920, -1727513917, -1727513918, -309354380, 122761803, -477037880, (lT)((lT)((Object)PK.IIstI("hkfpoo", 1027108738, -1727513879, -1727513880, -1727513877, -353164842, -1232798412, -714048333, (PK)this)[PK.IIstI("afopsu", 1027108740, -1727513879, -1727513909, -1727513863, -158961803, -1945114708, 759059502)[4]])))))) != false) {
                return;
            }
        }
        if (PK.IIstI("dimtn", 1027108736, -1727513861, -1727513915, -1727513884, -309354380, 122761803, -477037880, (NNNwS)((NNNwS)PK.IIstI("dimtn", 1027108738, -1727513864, -1727513882, -1727513877, -1704974145, 523778492, 1567102877, (NNuU)((NNuU)PK.IIstI("siburgcn", 1027108738, -1727513879, -1727513881, -1727513877, -1966539833, 2069467591, -1883195068, (PK)this)[PK.IIstI("hkfpoo", 1027108740, -1727513879, -1727513909, -1727513863, -1909152178, -787501140, 726708317)[5]]))[PK.IIstI("siburgcn", 1027108740, -1727513879, -1727513909, -1727513863, -643979781, -1117791396, 1239909429)[6]])) != false) {
            if (PK.IIstI("siburgcn", 1027108736, -1727513874, -1727513910, -1727513884, -309354380, 122761803, -477037880, (Boolean)((Boolean)((Object)PK.IIstI("nkscx", 1027108736, -1727513920, -1727513917, -1727513918, -309354380, 122761803, -477037880, (lT)((lT)((Object)PK.IIstI("fetao", 1027108738, -1727513879, -1727513880, -1727513877, 2030075671, 338873377, -765309833, (PK)this)[PK.IIstI("gqcnuo", 1027108740, -1727513879, -1727513909, -1727513863, 1628926659, -70860423, 562860329)[7]])))))) != false) {
                return;
            }
        }
        ArrayList arrayList = new ArrayList(PK.IIstI("hkfpoo", 1027108750, -1727513914, -1727513895, -1727513896, -309354380, 122761803, -477037880, (Object)((Object)((wy)((Object)PK.IIstI("fetao", 1027108740, -1727513916, -1727513913, -1727513877, 1486740930, -2088220964, 923288139)[PK.IIstI("svqacmr", 1027108740, -1727513879, -1727513860, -1727513863, 1087817547, -1521553403, 1816375050)[0]]))), (Object)((Object)((wy)((Object)PK.IIstI("mhttwc", 1027108740, -1727513916, -1727513913, -1727513877, 265745548, -444169791, -680907389)[PK.IIstI("dimtn", 1027108740, -1727513879, -1727513860, -1727513863, -1611689517, 1665695961, 1176201437)[1]]))), (Object)((Object)((wy)((Object)PK.IIstI("mhttwc", 1027108740, -1727513916, -1727513913, -1727513877, -935150349, -1396657514, -1053724772)[PK.IIstI("mhttwc", 1027108740, -1727513879, -1727513860, -1727513863, 1285500303, 1334892987, 1810587536)[2]])))));
        if (PK.IIstI("gqcnuo", 1027108750, -1727513892, -1727513881, -1727513889, -309354380, 122761803, -477037880, (NQl)PK.IIstI("siburgcn", 1027108740, -1727513893, -1727513894, -1727513891, 1484705461, -1296274451, -1714584225)) == false) {
            PK.IIstI("siburgcn", 1027108751, -1727513914, -1727513890, -1727513903, -309354380, 122761803, -477037880, arrayList, (Object)((Object)((wy)((Object)PK.IIstI("gqcnuo", 1027108740, -1727513916, -1727513913, -1727513877, 75669947, -209735473, -1430223841)[PK.IIstI("afopsu", 1027108740, -1727513879, -1727513860, -1727513863, -1355084176, -1253650728, -753223114)[3]]))));
        }
        if (PK.IIstI("fetao", 1027108751, -1727513902, -1727513899, -1727513900, -309354380, 122761803, -477037880, (Stream)((Object)PK.IIstI("afopsu", 1027108751, -1727513914, -1727513904, -1727513901, -309354380, 122761803, -477037880, arrayList)), wy2 -> (boolean)PK.IIstI("svqacmr", 1027108736, -1727513868, -1727513865, -1727513884, -309354380, 122761803, -477037880, (Optional)((Object)PK.IIstI("svqacmr", 1027108750, -1727513869, -1727513870, -1727513867, -309354380, 122761803, -477037880, (wy)((Object)wy2))))) != false) {
            CallSite callSite = PK.IIstI("gqcnuo", 1027108750, -1727513874, -1727513887, -1727513888, -309354380, 122761803, -477037880, (boolean)PK.IIstI("gqcnuo", 1027108740, -1727513879, -1727513872, -1727513873, 858810433, 1483848770, -1643072955)[2]);
            PK.IIstI("fetao", 1027108738, -1727513879, -1727513880, -1727513877, -2021694002, 298556650, 390199167, (PK)this)[PK.IIstI("nkscx", 1027108740, -1727513879, -1727513882, -1727513863, -692464601, 537948431, 1975360521)[0]] = callSite;
            return;
        }
        CallSite callSite = PK.IIstI("mhttwc", 1027108751, -1727513914, -1727513897, -1727513898, -309354380, 122761803, -477037880, arrayList);
        while (PK.IIstI("mhttwc", 1027108751, -1727513943, -1727513944, -1727513884, -309354380, 122761803, -477037880, (Iterator)((Object)callSite)) != false) {
            wy wy3 = (wy)((Object)PK.IIstI("gqcnuo", 1027108751, -1727513943, -1727513941, -1727513918, -309354380, 122761803, -477037880, (Iterator)((Object)callSite)));
            if (PK.IIstI("siburgcn", 1027108736, -1727513940, -1727513870, -1727513937, -309354380, 122761803, -477037880, (km)((km)((Object)PK.IIstI("afopsu", 1027108738, -1727513879, -1727513880, -1727513877, 1860318281, 593608451, -1211304461, (PK)this)[PK.IIstI("siburgcn", 1027108740, -1727513879, -1727513882, -1727513863, -1804882017, 1763654824, -733627461)[1]])), (int)PK.IIstI("hkfpoo", 1027108736, -1727513885, -1727513942, -1727513939, -309354380, 122761803, -477037880, (Integer)((Object)PK.IIstI("mhttwc", 1027108738, -1727513879, -1727513880, -1727513877, 605463880, 734957666, -1275909250, (PK)this)[PK.IIstI("fetao", 1027108740, -1727513879, -1727513882, -1727513863, -565698827, 1138935233, -1064130471)[2]]))) == false) continue;
            PK.IIstI("gqcnuo", 1027108736, -1727513868, -1727513938, -1727513951, -309354380, 122761803, -477037880, (Optional)((Object)PK.IIstI("siburgcn", 1027108750, -1727513869, -1727513870, -1727513867, -309354380, 122761803, -477037880, (wy)wy3)), dS2 -> {
                PK.IIstI("mhttwc", 1027108736, -1727513879, -1727513878, -1727513866, -309354380, 122761803, -477037880, (PK)this);
                PK.IIstI("dimtn", 1027108736, -1727513879, -1727513870, -1727513949, -309354380, 122761803, -477037880, (PK)this, (int)PK.IIstI("hkfpoo", 1027108736, -1727513952, -1727513881, -1727513939, -309354380, 122761803, -477037880, (dS)dS2), (wy)wy3);
                PK.IIstI("dimtn", 1027108736, -1727513879, -1727513858, -1727513866, -309354380, 122761803, -477037880, (PK)this);
                PK.IIstI("dimtn", 1027108736, -1727513940, -1727513881, -1727513866, -309354380, 122761803, -477037880, (km)((km)((Object)PK.IIstI("svqacmr", 1027108738, -1727513879, -1727513880, -1727513877, -22519019, 1633762562, -2120185616, (PK)this)[PK.IIstI("nkscx", 1027108740, -1727513879, -1727513907, -1727513863, -1241147860, -647548672, 1559695352)[3]])));
            });
        }
    }

    @uF
    private void N(Rs rs) {
        PK.IIstI("afopsu", 1027108736, -1727513879, -1727513878, -1727513866, -309354380, 122761803, -477037880, (PK)this);
        CallSite callSite = PK.IIstI("dimtn", 1027108736, -1727513934, -1727513919, -1727513931, -309354380, 122761803, -477037880, (Rs)rs);
        PK.IIstI("hkfpoo", 1027108750, -1727513932, -1727513929, -1727513930, -309354380, 122761803, -477037880, (Object)callSite);
        CallSite callSite2 = callSite;
        CallSite callSite3 = PK.IIstI("hkfpoo", 1027108740, -1727513879, -1727513936, -1727513873, 1331033575, -800300633, 28193722)[2];
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{NCz.class, NCW.class}, (Object)callSite2, (int)callSite3)) {
            case 0: {
                NCz nCz = (NCz)callSite2;
                PK.IIstI("svqacmr", 1027108736, -1727513879, -1727513870, -1727513975, -309354380, 122761803, -477037880, (PK)this, (NCz)nCz);
                break;
            }
            case 1: {
                NCW nCW = (NCW)callSite2;
                CallSite callSite4 = PK.IIstI("mhttwc", 1027108750, -1727513874, -1727513887, -1727513888, -309354380, 122761803, -477037880, (boolean)PK.IIstI("mhttwc", 1027108740, -1727513879, -1727513872, -1727513873, 1579748694, 1273507197, -908837865)[0]);
                PK.IIstI("fetao", 1027108738, -1727513879, -1727513880, -1727513877, 1132750234, -1898545607, -1367004368, (PK)this)[PK.IIstI("siburgcn", 1027108740, -1727513879, -1727513911, -1727513863, -1500625726, -165674250, -596731388)[0]] = callSite4;
                break;
            }
        }
    }

    private static /* synthetic */ void ntfClinit() {
        oomOOs = "\u0095\fZAf\b+\u00b9/\u000fR/z:\u0014j&hf3/\u001a\u00bdlnu72trnRLX\u001c\u0014\u0086E,\u0016\u0010#xo\u00d3\u0003X}N\u001f\u0003\u00fbN\u0010V\n!Nuy)\u000b\u00batK\u000btfj;A\u00b8a/^q\u000eb>\u00f7\u00003%Kv;\u0018\u00b5/-X0&/\u001b\u00f0\t\"}s'\u0016\u0004\u00b5v \u00162 n3\u00bd,%tb\u007f.U\u00fdL+X( /!\u00e6\n+1Ku)\u001a\u00ef!&hf36\u000f\u00bagnp05e3\u00c69(\u0003X}N\u001f\u0003\u00fbN6N\u00de\u000e7Kv;\u0018\u00b5/-X0&/\u001d\u00cd\u0082\"ybnac\u000bUCZ <\u0091mnU\u0007zL>\u00c2=&1k}4\t\u00fbS5K7/go\u00f9b\u000bUCZ <\u0091mnU\nz\u00a3\u0003X}N\u001f\u0003\u00fbd\u0012\u00ea\u0005(nRm},\u000f\u00fbu5P2nI Mr&jhna\u000e\u0013\u00f3cnRm},\u000f\u00fbu5P2ns \u00d1.&s(O.\u001c\u00b1a,\u0002\u00bd\u0003X}N\u001f\u0003\u00fbN*H\u0099nW\u00f1nD'm\"jos>1\u00e71t\rfL\u000eWNP\u0011*\u0092z\u0013|3nN?Y_nRLX\u001c\u0014\u0086E,\u0016$-;\u00b8\u009b(nH\u0016\"oru(\u000b\u009ao/w+-l\u00d1.{kx\u0005Y\u00e39p\u00bd\u0003X}N\u001f\u0003\u00fbR2\u0015\u000bUCZ <\u0091mnw\u000f-;}rInRLX\u001c\u0014\u0086E,\u0016\u00106wo\u0015nRLX\u001c\u0014\u0086E,\u0016$-;InX\u00c0\u001d7Kv;\u0018\u00b5/-X0&/\u0016\u00fd\u0087+{fra\u00b0\u000bUCZ <\u0091mnN'z)\u0018\b\u00f91\u007f(i.\u0007\u00b8/\u000eI*(o:\u0003\u00f4|\u0015\u000e7]r\u000btfj;A\u00a1t(Uq'u:\u00f1..qi3\u0019\u0001\u00bas4T;3;}\u00c4{/v\u0003X}N\u001f\u0003\u00fbw\u0018(\u0003X}N\u001f\u0003\u00fbd3(\u0003X}N\u001f\u0003\u00fbz-\u00b3&hf3/\u001a\u00bdlnv.5i;\f\u00b8+\u0085\"jos>1\u00e21p\u0001\u0099nRm},\u000f\u00fbu5P2nL=\u0011\u00c5|b\u0003X}N\u001f\u0003\u00fbk,\u001f(qky;\u0000\u0082a-L;c\u000eRLX\u001c\u0014\u0086E,\u0016)8;}\u00f5\u00fc\u0003X}N\u001f\u0003\u00fbN\u0010Xc\u000bUCZ <\u0091mnw<9;}\u00ef\u0000\u0003X}N\u001f\u0003\u00fbN\u0010Ve\u00e1K\u000bUCZ <\u0091mnw<\r;}~\u000b&hf3/\u001a\u00bdlnp*$r5\u00e6\u000e56v\u0003X}N\u001f\u0003\u00fbl*\u0002#z\u00ec\u000btfj;A\u00b8a/^q\u000eb>\u00c6\u00d43%b\u0003X}N\u001f\u0003\u00fby\u0011&pcs7'\u00bat\"(\u000btfj;A\u00b8a/^q\u000eb>Mc3%.P0\u000f\u00a2anU?/g{gb-{dha\u0017\u000b&mIy\"\u001a\u00bd\u00b3&hf3/\u001a\u00bdlnv<+e7\u0016\u00aa/\u0018f\u001d*\u0003X}N\u001f\u0003\u00fbP\n\u00cd\u009b3lb}7r\u0001H)gJ}.\r\u00bc\r4[jl.\u0017K\u0005.{kx\u0005X\u00e41s\u00f1\u000btfj;A\u00a1t(Uq'u:\u0001\u00ad.qi3\n\u001c\u00b1d(Z?5eoK\u0083,&rry\u0015\br\u000btfj;A\u00b8a/^q\u000eb>\u00f793%.F\u00f1)mb\u007f/\u001c\u00b1\u00fa\u0003X}N\u001f\u0003\u00fbN*~\u00b0nRLX\u001c\u0014\u0086E,\u0016\u0010\u0000Co(\u0003X}N\u001f\u0003\u00fbN\u000fL\u000b\u00d9\"fs\u0015t\u00fc\u0003X}N\u001f\u0003\u00fbN\u000fw)\u0012\u00f1nRhn=A\u00b5p Z6$/7\r\u00b4*qiou\u0002\u00b5n&\nq\u0013a:\u0006\u00b6*Ksu6\u001d\u00ef\u00fd\fZAf\b+\u00b9/\u000fh2zb\u0003X}N\u001f\u0003\u00fbd\u0002\t&hf36\u000f\u00bagn{1.l1I\r/\u0003X}N\u001f\u0003\u00fbl-\u0092\u0003X}N\u001f\u0003\u00fbw8\u001b.{kx)1\u00e47'Xmr1e\u00c1M\"'c/?W\u00b68y\n:q9f\u0091O~/>~<[\u00b5K\u000bUCZ <\u0091mnU\u0007zL>I\u0015&1k}4\t\u00fbS5K7/god(\u0003X}N\u001f\u0003\u00fbl\u0006\u0002\u0012\nD\u0012R1\u0002s(p\u001dU\u0092)\rr\u001a\u0007z\u0006m\u000ehrk'\u00fe.{kx\u0005Y\u00e39u\u009f\u000eW.U\u00f9+rJ}.\r\u00bc\u0000\u0003X}N\u001f\u0003\u00fbw\u000fT\u000e!\u001d\u00173\u007fsu9(\u00bde-]-\u001e00\u001b\u0005u/4$h\u000f\u00e3by\nfu86LPr.7yl\u000f\u00b0e'\n= e\u0014)jQ}6\u001b\u00b1\u00995y(}*\u000f\u00b7h$\u0016=.m9\u00cc\u009841k}4\t\u00e7/\u0013X0%o9\u00f6\u0082.rte\fZAf\b+\u00b9/\u000f[\u0012z6\u0003X}N\u001f\u0003\u00fbN#u\u00denRm},\u000f\u00fbl W9nO6\u00c9\u0093$j<\u00d7.{kx\u0005[\u00ec0y6\u0003X}N\u001f\u0003\u00fbN\u0002C\r3{u}.\u0001\u00a6I\u000bUCZ <\u0091mnw\u001d;;}\u00c4K\u0003X}N\u001f\u0003\u00fbl\u0006\u009f\u000e7Q\u00a3\u0003X}N\u001f\u0003\u00fbl\u0015\u00ea\u000btfj;A\u00b8a/^q\u0012t&\u000b\u00df %\u009c&hf3/\u001a\u00bdlnJ*3e5\u00ce\u00d9\u0014juy;\u0003\u0010";
        oor0nl = new int[]{55377930, 55115777, 48431123, 98762753, 15794178, 34996225, 55246850, 70713361, 60489735, 28966934, 0x880011, 10747926, 2883595, 20250627, 82640897, 82444289, 851970, 64552972, 65732621, 73138216, 62849035, 57606145, 65667073, 65601537, 55181313, 23330817, 81788938, 23265281, 30408738, 37093394, 57147399, 23396355, 47513601, 57671690, 56033281, 40828940, 45219841, 49676297, 27852814, 36438026, 35061761, 95354890, 50855937, 90177556, 0x10B0001, 72482826, 82706478, 983054, 82509826, 0x400048, 42663947, 17367042, 69206029, 70057994, 25821200, 48234499, 60948501, 56098822, 17563675, 97255447, 81264648, 58327073, 92864520, 15925270, 46333970, 0x3300007, 65339396, 85721096, 20054019, 40173578, 32636932, 3604489, 32899104, 15138826, 41615376, 86245412, 62324744, 66584616, 71827466, 94437386, 28770307, 50266121, 80936965, 20447233, 96010259, 56492034, 47579146, 75759685, 53411841, 53936129, 12189741, 25165834, 63569935, 54001681, 23592974, 50921510, 93388816, 0x222000A, 95092740, 0x555000B, 91488266, 88604685, 35127306, 45285392, 1900559, 38273035, 43384860, 19333131, 80281610, 13, 21299230, 20512780, 26869775, 0x99000B, 24510474, 92143627, 38993938, 56623112};
        PK.n();
        PK.T();
        PK.b();
        PK.s();
        PK.j();
    }

    private static /* synthetic */ void l1k0Oq(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[118];
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
        oomOOs = stringBuilder.toString();
        oor0nl = nArray;
    }

    private static /* synthetic */ String lO00n(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-123, 52, 109, -31, -8, -33, 92, 50, -26, 29, -26, -72, 115, -28, -84, -50};
        byte[] byArray3 = new byte[]{-81, 67, -14, 11, 51, 27, -47, 97, 64, -63, -65, -35, 5, -26, 78, 91};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite llOijmlps(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = oor0nl[n2 ^ 0x99083AE9];
        int n8 = n7 >>> 16;
        String string2 = PK.lO00n(oomOOs.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x99083AE9);
        n7 = oor0nl[n3 ^ 0x99083AE9];
        int n9 = n7 >>> 16;
        String string3 = PK.lO00n(oomOOs.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x99083AE9);
        n7 = oor0nl[n4 ^ 0x99083AE9];
        int n10 = n7 >>> 16;
        String string4 = PK.lO00n(oomOOs.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x99083AE9);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x3D386F36) + -178;
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

    private static /* synthetic */ CallSite OliOIq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = oor0nl[n2 ^ 0x99083AE9];
        int n9 = n8 >>> 16;
        String string2 = PK.lO00n(oomOOs.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x99083AE9);
        n8 = oor0nl[n3 ^ 0x99083AE9];
        int n10 = n8 >>> 16;
        String string3 = PK.lO00n(oomOOs.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x99083AE9);
        n8 = oor0nl[n4 ^ 0x99083AE9];
        int n11 = n8 >>> 16;
        String string4 = PK.lO00n(oomOOs.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x99083AE9);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x3D386F36) + -178;
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

    private static /* synthetic */ CallSite IIstI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = oor0nl[n2 ^ 0x99083AE9];
        int n9 = n8 >>> 16;
        String string2 = PK.lO00n(oomOOs.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x99083AE9);
        n8 = oor0nl[n3 ^ 0x99083AE9];
        int n10 = n8 >>> 16;
        String string3 = PK.lO00n(oomOOs.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x99083AE9);
        n8 = oor0nl[n4 ^ 0x99083AE9];
        int n11 = n8 >>> 16;
        String string4 = PK.lO00n(oomOOs.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x99083AE9);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x3D386F36) + -178;
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
