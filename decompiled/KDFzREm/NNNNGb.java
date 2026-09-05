/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNJg
 *  KDFzREm.NNKE
 *  KDFzREm.NNNwS
 *  KDFzREm.NNPQ
 *  KDFzREm.NNYH
 *  KDFzREm.NNfc
 *  KDFzREm.NNuU
 *  KDFzREm.NQo
 *  KDFzREm.NYj
 *  KDFzREm.NkG
 *  KDFzREm.ow
 */
package KDFzREm;

import KDFzREm.NNJg;
import KDFzREm.NNKE;
import KDFzREm.NNNNGO;
import KDFzREm.NNNNGP;
import KDFzREm.NNNNGQ;
import KDFzREm.NNNNGT;
import KDFzREm.NNNNGU;
import KDFzREm.NNNNGd;
import KDFzREm.NNNNGg;
import KDFzREm.NNNNGl;
import KDFzREm.NNNNGv;
import KDFzREm.NNNwS;
import KDFzREm.NNPQ;
import KDFzREm.NNYH;
import KDFzREm.NNfc;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NYj;
import KDFzREm.NkG;
import KDFzREm.ow;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NNNNGb {
    public static NNNNGU N;
    private static NNuU L;
    private static NNYH u;
    private static NNNNGP i;
    private static boolean R;
    private static NYj M;
    private static double B;
    private static boolean Z;
    private static boolean z;
    private static boolean U;
    private static boolean E;
    static final /* synthetic */ boolean y;

    /*
     * Unable to fully structure code
     */
    public static boolean L(NNYH var0, double var1_1, double var3_2, NNNNGv var5_3) {
        block21: {
            block20: {
                NNNNGb.N(var0);
                if (NNNNGb.i == null) {
                    return false;
                }
                var6_4 = NNNNGb.i.N(var1_1, var3_2);
                if (var6_4 == NNNNGb.M) {
                    return false;
                }
                var7_5 = ((NkG)((NNNwS)NNNNGb.L.T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).M();
                if (NNNNGb.z && var5_3 == NNNNGv.RIGHT && !NNNNGb.U) {
                    NNNNGb.U = true;
                    NNNNGb.i.u();
                    NNNNGb.N(NNNNGb.M, var7_5);
                }
                NNNNGb.M = var6_4;
                if (var6_4 == null) {
                    return false;
                }
                if (NNNNGb.i.y(var6_4)) {
                    return false;
                }
                if (var5_3 != NNNNGv.LEFT) break block20;
                if (!NNNNGb.Z) {
                    return false;
                }
                var8_6 = var6_4.i();
                if (var8_6.R()) {
                    return false;
                }
                if (NNPQ.N((ow)NNNNGb.L.Nt(), (int)340)) ** GOTO lbl-1000
                if (NNPQ.N((ow)NNNNGb.L.Nt(), (int)344)) lbl-1000:
                // 2 sources

                {
                    v0 = true;
                } else {
                    v0 = var9_7 = false;
                }
                if (var7_5.R()) {
                    if (!NNNNGb.N.L || !var9_7) {
                        return false;
                    }
                    NNNNGb.i.N(var6_4, NNNNGv.LEFT, true);
                } else {
                    if (!NNNNGb.N.y) {
                        return false;
                    }
                    if (!NNNNGb.N(var8_6, var7_5)) {
                        return false;
                    }
                    if (var9_7) {
                        NNNNGb.i.N(var6_4, NNNNGv.LEFT, true);
                    } else {
                        if (var7_5.c() + var8_6.c() > var7_5.U()) {
                            return false;
                        }
                        NNNNGb.i.N(var6_4, NNNNGv.LEFT, false);
                        if (!NNNNGb.i.N(var6_4)) {
                            NNNNGb.i.N(var6_4, NNNNGv.LEFT, false);
                        }
                    }
                }
                break block21;
            }
            if (var5_3 == NNNNGv.RIGHT) {
                if (!NNNNGb.z) {
                    return false;
                }
                NNNNGb.N(var6_4, var7_5);
            }
        }
        return false;
    }

    public static boolean y(NNYH nNYH, double d, double d2, NNNNGv nNNNGv) {
        NNNNGb.N(nNYH);
        if (i == null) {
            return false;
        }
        if (nNNNGv == NNNNGv.LEFT) {
            Z = false;
        } else if (nNNNGv == NNNNGv.RIGHT) {
            z = false;
        }
        return false;
    }

    private static NNNNGP y(NNYH nNYH) {
        if (nNYH instanceof NNNNGd) {
            return new NNNNGg((NNNNGd)nNYH);
        }
        if (nNYH instanceof NNKE) {
            return new NNNNGQ((NNKE)nNYH);
        }
        if (nNYH instanceof NNJg) {
            return new NNNNGO((NNJg)nNYH);
        }
        return null;
    }

    public static boolean N(NNYH nNYH, double d, double d2, double d3) {
        NYj nYj;
        boolean bl;
        NNNNGb.N(nNYH);
        if (i == null || R || !NNNNGb.N.u) {
            return false;
        }
        NYj nYj2 = i.N(d, d2);
        if (nYj2 == null || i.y(nYj2)) {
            return false;
        }
        NQo nQo = nYj2.i();
        if (nQo.B() instanceof NNfc) {
            return false;
        }
        double d4 = NNNNGb.N.M.N(d3);
        if (B != 0.0 && Math.signum(d4) != Math.signum(B)) {
            B = 0.0;
        }
        int n = (int)(B += d4);
        B -= (double)n;
        if (n == 0) {
            return true;
        }
        List<NYj> list = i.L();
        int n2 = Math.abs(n);
        boolean bl2 = bl = n < 0;
        if (NNNNGb.N.R.L() && NNNNGb.N(nYj2, list)) {
            boolean bl3 = bl = !bl;
        }
        if (NNNNGb.N.R.y()) {
            boolean bl4 = bl = !bl;
        }
        if (nQo.R()) {
            return true;
        }
        NQo nQo2 = ((NkG)((NNNwS)NNNNGb.L.T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).M();
        if (i.N(nYj2)) {
            if (!NNNNGb.N(nQo, nQo2)) {
                return true;
            }
            if (nQo2.R()) {
                List<NYj> list2;
                if (!bl) {
                    return true;
                }
                while (n2-- > 0 && (list2 = NNNNGb.N(list, nYj2, nQo.c(), true)) != null) {
                    i.N(nYj2, NNNNGv.LEFT, false);
                    for (int i = 0; i < list2.size(); ++i) {
                        NYj nYj3 = list2.get(i);
                        if (i == list2.size() - 1) {
                            NNNNGb.i.N(nYj3, NNNNGv.LEFT, false);
                            continue;
                        }
                        int n3 = nYj3.b_(nYj3.i()) - nYj3.i().c();
                        while (n3-- > 0) {
                            NNNNGb.i.N(nYj3, NNNNGv.RIGHT, false);
                        }
                    }
                }
            } else {
                while (n2-- > 0) {
                    i.N(nYj2, NNNNGv.LEFT, false);
                }
            }
            return true;
        }
        if (!nQo2.R() && NNNNGb.N(nQo, nQo2)) {
            return true;
        }
        if (bl) {
            if (!nQo2.R() && !nYj2.N(nQo2)) {
                return true;
            }
            n2 = Math.min(n2, nQo.c());
            List<NYj> list3 = NNNNGb.N(list, nYj2, n2, false);
            if (!y && list3 == null) {
                throw new AssertionError();
            }
            if (list3.isEmpty()) {
                return true;
            }
            i.N(nYj2, NNNNGv.LEFT, false);
            for (NYj nYj4 : list3) {
                int n4 = nYj4.b_(nYj4.i()) - nYj4.i().c();
                n4 = Math.min(n4, n2);
                n2 -= n4;
                while (n4-- > 0) {
                    i.N(nYj4, NNNNGv.RIGHT, false);
                }
            }
            i.N(nYj2, NNNNGv.LEFT, false);
            return true;
        }
        int n5 = nYj2.b_(nQo) - nQo.c();
        n2 = Math.min(n2, n5);
        while (n2 > 0 && (nYj = NNNNGb.N(list, nYj2)) != null) {
            int n6 = nYj.i().c();
            if (i.N(nYj)) {
                if (n5 < n6) break;
                n2 = Math.min(n2 - 1, n5 -= n6);
                if (!nQo2.R() && !nYj2.N(nQo2)) break;
                i.N(nYj2, NNNNGv.LEFT, false);
                i.N(nYj, NNNNGv.LEFT, false);
                i.N(nYj2, NNNNGv.LEFT, false);
                continue;
            }
            int n7 = Math.min(n2, n6);
            n5 -= n7;
            n2 -= n7;
            if (!nQo2.R() && !nYj.N(nQo2)) break;
            i.N(nYj, NNNNGv.LEFT, false);
            if (n7 == n6) {
                i.N(nYj2, NNNNGv.LEFT, false);
            } else {
                for (int i = 0; i < n7; ++i) {
                    NNNNGb.i.N(nYj2, NNNNGv.RIGHT, false);
                }
            }
            i.N(nYj, NNNNGv.LEFT, false);
        }
        return true;
    }

    private static boolean N(NQo nQo, NQo nQo2) {
        return nQo.R() || nQo2.R() || NQo.y((NQo)nQo, (NQo)nQo2) && NQo.L((NQo)nQo, (NQo)nQo2);
    }

    private static NYj N(List<NYj> list, NYj nYj) {
        int n;
        int n2;
        if (NNNNGb.N.i == NNNNGl.FIRST_TO_LAST) {
            var2_2 = 0;
            n2 = list.size();
            n = 1;
        } else {
            var2_2 = list.size() - 1;
            n2 = -1;
            n = -1;
        }
        NQo nQo = nYj.i();
        boolean bl = nYj.L != ((NNNwS)NNNNGb.L.T[4]).method_31548();
        for (int i = var2_2; i != n2; i += n) {
            NQo nQo2;
            boolean bl2;
            NYj nYj2 = list.get(i);
            if (NNNNGb.i.y(nYj2)) continue;
            boolean bl3 = bl2 = nYj2.L == ((NNNwS)NNNNGb.L.T[4]).method_31548();
            if (bl != bl2 || (nQo2 = nYj2.i()).R() || !NNNNGb.N(nQo, nQo2)) continue;
            return nYj2;
        }
        return null;
    }

    private static List<NYj> N(List<NYj> list, NYj nYj, int n, boolean bl) {
        NYj nYj2;
        int n2;
        NQo nQo = nYj.i();
        boolean bl2 = nYj.L != ((NNNwS)NNNNGb.L.T[4]).method_31548();
        ArrayList<NYj> arrayList = new ArrayList<NYj>();
        ArrayList<NYj> arrayList2 = new ArrayList<NYj>();
        for (n2 = 0; n2 != list.size() && n > 0; ++n2) {
            boolean bl3;
            nYj2 = list.get(n2);
            if (i.y(nYj2)) continue;
            boolean bl4 = bl3 = nYj2.L == ((NNNwS)NNNNGb.L.T[4]).method_31548();
            if (bl2 != bl3 || i.N(nYj2)) continue;
            NQo nQo2 = nYj2.i();
            if (nQo2.R()) {
                if (!nYj2.N(nQo)) continue;
                arrayList2.add(nYj2);
                continue;
            }
            if (!NNNNGb.N(nQo, nQo2) || nQo2.c() >= nYj2.b_(nQo2)) continue;
            arrayList.add(nYj2);
            n -= Math.min(n, nYj2.b_(nQo2) - nQo2.c());
        }
        for (n2 = 0; n2 != arrayList2.size() && n > 0; n -= Math.min(n, nYj2.y()), ++n2) {
            nYj2 = (NYj)arrayList2.get(n2);
            arrayList.add(nYj2);
        }
        if (bl && n > 0) {
            return null;
        }
        return arrayList;
    }

    public static boolean N(NNYH nNYH, double d, double d2, NNNNGv nNNNGv) {
        NNNNGb.N(nNYH);
        if (i == null) {
            return false;
        }
        M = i.N(d, d2);
        NQo nQo = ((NkG)((NNNwS)NNNNGb.L.T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).M();
        if (nNNNGv == NNNNGv.LEFT) {
            if (nQo.R()) {
                Z = true;
            }
        } else if (nNNNGv == NNNNGv.RIGHT) {
            if (nQo.R()) {
                return false;
            }
            if (!NNNNGb.N.N) {
                return false;
            }
            z = true;
            U = false;
        }
        return false;
    }

    private static void N(NYj nYj, NQo nQo) {
        if (nYj == null) {
            return;
        }
        if (nQo.R()) {
            return;
        }
        if (i.y(nYj)) {
            return;
        }
        if (i.N(nYj)) {
            return;
        }
        if (!(nQo.B() instanceof NNfc)) {
            NQo nQo2 = nYj.i();
            if (!NNNNGb.N(nQo2, nQo)) {
                return;
            }
            if (nQo2.c() == nYj.b_(nQo2)) {
                return;
            }
        }
        i.N(nYj, NNNNGv.RIGHT, false);
    }

    private static void N(NNYH nNYH) {
        if (nNYH == u) {
            return;
        }
        u = nNYH;
        i = null;
        M = null;
        B = 0.0;
        Z = false;
        z = false;
        U = false;
        if (u != null) {
            NNNNGT.y("You have just opened a " + u.getClass().getName() + ".");
            N.N();
            i = NNNNGb.y(u);
            if (i == null) {
                NNNNGT.y("No valid handler found; Mouse Tweaks is disabled.");
            } else {
                boolean bl = i.N();
                R = i.y();
                NNNNGT.y("Handler: " + i.getClass().getSimpleName() + "; Mouse Tweaks is " + (bl ? "disabled" : "enabled") + "; wheel tweak is " + (R ? "disabled" : "enabled") + ".");
                if (bl) {
                    i = null;
                }
            }
        }
    }

    public static void N() {
        NNNNGT.N("Main.initialize()");
        if (E) {
            return;
        }
        L = NNuU.Nq();
        N = new NNNNGU(((File)NNNNGb.L.l[1]).getAbsolutePath() + File.separator + "config" + File.separator + "MouseTweaks.cfg");
        N.N();
        NNNNGT.N("Initialized.");
        E = true;
    }

    private static boolean N(NYj nYj, List<NYj> list) {
        boolean bl = nYj.L == ((NNNwS)NNNNGb.L.T[4]).method_31548();
        int n = 0;
        int n2 = 0;
        for (NYj nYj2 : list) {
            if (nYj2.L == ((NNNwS)NNNNGb.L.T[4]).method_31548() == bl) continue;
            if (nYj2.R < nYj.R) {
                ++n2;
                continue;
            }
            ++n;
        }
        return n2 > n;
    }
}
