/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNPg
 *  KDFzREm.NNYH
 *  KDFzREm.NNiz
 *  KDFzREm.NNuU
 *  KDFzREm.NNyx
 */
package KDFzREm;

import KDFzREm.NNPg;
import KDFzREm.NNYH;
import KDFzREm.NNiz;
import KDFzREm.NNuU;
import KDFzREm.NNyx;
import KDFzREm.PR;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ih;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.lv;
import KDFzREm.uA;
import KDFzREm.uF;
import KDFzREm.zI;
import KDFzREm.zJ;
import KDFzREm.zg;
import KDFzREm.zl;
import KDFzREm.zo;
import KDFzREm.zq;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="ScreenWalk", y=UR.MOVEMENT, N=Uz.BASE)
public class Pi
extends UM {
    private static byte[] u;
    private static short[] i;
    private static short[] R;
    public Object[] L;
    private static boolean[] M;
    private static short[] B;
    private static short[] Z;
    private static short[] z;
    private static String[] U;
    private static /* synthetic */ String IIsjm0Om;
    private static /* synthetic */ int[] oossj;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateRight(-Integer.rotateRight(Integer.rotateLeft(n, 22), 3), 20) ^ 0x14E2C9BC, 3);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-34, 97, -62, 5, -97, -70, 30, -79, 111, -48, -65, 46, 25, 125, 126, -22};
        int n = 0;
        int n2 = 218;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 153;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void P() {
        if (Pi.IImImjn("aevmf", 574258688, -714624665, -714624645, -714624667, 574258688, (Pi)this) == null) {
            Pi.IImImjn("vlnlfq", 574258689, -714624665, -714624645, -714624667, 574258689, (Pi)this, (Object[])new Object[Pi.IImImjn("calojzv", 574258694, -714624665, -714624648, -714624697, 574258694)[7]]);
            CallSite callSite = Pi.IImImjn("mzsl", 574258688, -714624665, -714624645, -714624667, 574258688, (Pi)this);
        }
    }

    private static void T() {
        i = new short[]{0, 0, 0, 0, 0};
        B = new short[]{0, 3, 0, 7};
        Z = new short[]{0, 7};
        R = new short[]{0, 7, 0};
        z = new short[]{7, 0, 7, 0, 7, 0};
    }

    public Pi() {
        Pi.IImImjn("lrgzheel", 574258690, -714624665, -714624699, -714624700, 574258690, (Pi)this);
        lv[] lvArray = new PR[Pi.IImImjn("gbapud", 574258694, -714624665, -714624656, -714624703, 574258694)[0]];
        lvArray[Pi.IImImjn("oxjias", 574258694, -714624665, -714624648, -714624697, 574258694)[0]] = new PR((String)((Object)Pi.IImImjn("ccrbi", 574258694, -714624665, -714624701, -714624702, 574258694)[1]), (boolean)Pi.IImImjn("anhwv", 574258694, -714624665, -714624648, -714624697, 574258694)[1], new zg());
        lvArray[Pi.IImImjn("mzsl", 574258694, -714624665, -714624648, -714624697, 574258694)[2]] = new PR((String)((Object)Pi.IImImjn("vlnlfq", 574258694, -714624665, -714624701, -714624702, 574258694)[2]), (boolean)Pi.IImImjn("mzsl", 574258694, -714624665, -714624648, -714624697, 574258694)[3], new zo());
        lvArray[Pi.IImImjn("lrgzheel", 574258694, -714624665, -714624656, -714624703, 574258694)[1]] = new PR((String)((Object)Pi.IImImjn("anhwv", 574258694, -714624665, -714624701, -714624702, 574258694)[3]), (boolean)Pi.IImImjn("lrgzheel", 574258694, -714624665, -714624648, -714624697, 574258694)[4], new zI());
        lvArray[Pi.IImImjn("aevmf", 574258694, -714624665, -714624656, -714624703, 574258694)[2]] = new PR((String)((Object)Pi.IImImjn("jnjgqn", 574258694, -714624665, -714624701, -714624702, 574258694)[4]), (boolean)Pi.IImImjn("ccrbi", 574258694, -714624665, -714624648, -714624697, 574258694)[5], new zq());
        lvArray[Pi.IImImjn("anhwv", 574258694, -714624665, -714624656, -714624703, 574258694)[3]] = new PR((String)((Object)Pi.IImImjn("ccrbi", 574258694, -714624665, -714624701, -714624702, 574258694)[5]), (boolean)Pi.IImImjn("calojzv", 574258694, -714624665, -714624648, -714624697, 574258694)[6], (zJ)((Object)Pi.IImImjn("cgztu", 574258694, -714624704, -714624666, -714624667, 574258694)[Pi.IImImjn("anhwv", 574258694, -714624665, -714624658, -714624669, 574258694)[0]]));
        ld ld2 = (ld)((Object)Pi.IImImjn("anhwv", 574258690, -714624691, -714624663, -714624692, 574258690, (ld)((Object)Pi.IImImjn("oxjias", 574258700, -714624689, -714624663, -714624690, 574258700, (lY)this, (String)((Object)Pi.IImImjn("gbapud", 574258694, -714624665, -714624701, -714624702, 574258694)[0]), (lv[])lvArray)), (lw2, pR) -> Pi.IImImjn("anhwv", 574258690, -714624665, -714624663, -714624698, -1630966323, (Pi)this, (PR)pR)));
        Pi.IImImjn("calojzv", 574258688, -714624665, -714624645, -714624667, 574258688, (Pi)this)[Pi.IImImjn("jnjgqn", 574258694, -714624665, -714624658, -714624669, 574258694)[1]] = ld2;
    }

    static {
        Pi.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{89, -110, 4, -61, -38, -47, 9, 115, 75, -95, -41, 8, -23, 112, 45, 104};
        int n = 0;
        int n2 = 30;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 11;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @Override
    public boolean Z() {
        Pi.IImImjn("tbvmlqrc", 574258690, -714624665, -714624699, -714624700, 574258690, (Pi)this);
        Pi.IImImjn("tbvmlqrc", 574258690, -714624704, -714624663, -714624682, 574258690, (zl)((Object)Pi.IImImjn("jnjgqn", 574258700, -714624693, -714624694, -714624695, 574258700)), (zJ)((zJ)((Object)Pi.IImImjn("cgztu", 574258688, -714624681, -714624663, -714624667, 574258688, (PR)((PR)((Object)Pi.IImImjn("calojzv", 574258690, -714624691, -714624658, -714624696, 574258690, (ld)((ld)((Object)Pi.IImImjn("gbapud", 574258688, -714624665, -714624645, -714624667, 574258688, (Pi)this)[Pi.IImImjn("oxjias", 574258694, -714624665, -714624658, -714624669, 574258694)[3]]))))))[Pi.IImImjn("mzsl", 574258694, -714624665, -714624658, -714624669, 574258694)[4]])));
        return (boolean)Pi.IImImjn("tbvmlqrc", 574258691, -714624683, -714624654, -714624657, 574258691, (UM)this);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-89, -74, 83, 47, 126, 41, 65, 7, 110, 47, 121, 95, 126, 42, -31, -6};
        int n = 0;
        int n2 = 255;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 225;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @Override
    public boolean i() {
        Pi.IImImjn("jnjgqn", 574258690, -714624704, -714624663, -714624682, -1630966323, (zl)((Object)Pi.IImImjn("calojzv", 574258700, -714624693, -714624694, -714624695, -1630966323)), (zJ)((zJ)((Object)Pi.IImImjn("anhwv", 574258694, -714624704, -714624666, -714624667, -1348414466)[Pi.IImImjn("vlnlfq", 574258694, -714624665, -714624658, -714624669, -1960306316)[2]])));
        return (boolean)Pi.IImImjn("tbvmlqrc", 574258691, -714624683, -714624658, -714624657, -1630966323, (UM)this);
    }

    private static void b() {
        U = new String[]{"mode", "ft", "matrix", "hw", "spooky", "vanilla"};
    }

    private static void s() {
        M = new boolean[]{false, false, true, false, false, false, true, true};
    }

    private static void m() {
        u = new byte[]{5, 2, 3, 4};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-95, -50, -68, -97, -30, 3, 37, 42, 36, -27, -62, -128, 64, -111, 90, 14};
        int n = 0;
        int n2 = 178;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 179;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateLeft((n ^ 0xC13393BE) + 1 ^ 0xDD883B66, 5) ^ 0x59C5AEEE, 4);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateRight((Integer.rotateRight(n, 29) ^ 0xD2379D01) + 1, 11), 7);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-60, -13, -40, -103, 56, 78, -97, -125, 53, 87, 32, 78, 23, -95, -6, 6};
        int n = 0;
        int n2 = 153;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 197;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n ^ 0x2142FD36, 2), 1), 11), 20) ^ 0x808AC248, 26);
    }

    private void N(PR pR) {
        if (Pi.IImImjn("vngcbwk", 574258690, -714624665, -714624701, -714624657, -1630966323, (Pi)this) != false) {
            Pi.IImImjn("anhwv", 574258690, -714624704, -714624663, -714624682, -1630966323, (zl)((Object)Pi.IImImjn("cgztu", 574258700, -714624693, -714624694, -714624695, -1630966323)), (zJ)((zJ)((Object)Pi.IImImjn("vlnlfq", 574258688, -714624681, -714624663, -714624667, 1338099909, (PR)pR)[Pi.IImImjn("cgztu", 574258694, -714624665, -714624643, -714624669, -1173159996)[5]])));
        }
    }

    @uF(y=uA.BEFORE)
    public void N(ih ih2) {
        if ((NNYH)Pi.IImImjn("mzsl", 574258688, -714624670, -714624671, -714624667, -2091730849, (NNuU)((NNuU)Pi.IImImjn("jnjgqn", 574258688, -714624665, -714624666, -714624667, -1842889469, (Pi)this)[Pi.IImImjn("gbapud", 574258694, -714624665, -714624668, -714624669, 857104583)[0]]))[Pi.IImImjn("anhwv", 574258694, -714624665, -714624668, -714624669, -563350724)[1]] == null || Pi.IImImjn("tbvmlqrc", 574258700, -714624672, -714624666, -714624657, -1630966323) != false) {
            return;
        }
        Pi.IImImjn("mzsl", 574258690, -714624652, -714624668, -714624653, -1630966323, (ih)ih2, (boolean)Pi.IImImjn("ccrbi", 574258700, -714624672, -714624663, -714624651, -1630966323, (int)Pi.IImImjn("vlnlfq", 574258690, -714624649, -714624666, -714624650, -1630966323, (NNPg)Pi.IImImjn("ccrbi", 574258688, -714624662, -714624663, -714624664, 1144531152, (NNyx)Pi.IImImjn("tbvmlqrc", 574258688, -714624659, -714624660, -714624661, 1254373636, (NNiz)((NNiz)Pi.IImImjn("cgztu", 574258688, -714624670, -714624658, -714624667, -1517205174, (NNuU)((NNuU)Pi.IImImjn("cgztu", 574258688, -714624665, -714624666, -714624667, 984007109, (Pi)this)[Pi.IImImjn("vngcbwk", 574258694, -714624665, -714624668, -714624669, 329133307)[2]]))[Pi.IImImjn("ccrbi", 574258694, -714624665, -714624668, -714624669, -245702227)[3]]))))));
        Pi.IImImjn("cgztu", 574258690, -714624652, -714624656, -714624653, -1630966323, (ih)ih2, (boolean)Pi.IImImjn("aevmf", 574258700, -714624672, -714624663, -714624651, -1630966323, (int)Pi.IImImjn("oxjias", 574258690, -714624649, -714624666, -714624650, -1630966323, (NNPg)Pi.IImImjn("tbvmlqrc", 574258688, -714624662, -714624663, -714624664, 778977241, (NNyx)Pi.IImImjn("calojzv", 574258688, -714624659, -714624655, -714624661, -1883874129, (NNiz)((NNiz)Pi.IImImjn("calojzv", 574258688, -714624670, -714624658, -714624667, 40698166, (NNuU)((NNuU)Pi.IImImjn("oxjias", 574258688, -714624665, -714624666, -714624667, -1754649032, (Pi)this)[Pi.IImImjn("anhwv", 574258694, -714624665, -714624654, -714624669, -1513679910)[0]]))[Pi.IImImjn("oxjias", 574258694, -714624665, -714624654, -714624669, -746422802)[1]]))))));
        Pi.IImImjn("cgztu", 574258690, -714624652, -714624641, -714624653, -1630966323, (ih)ih2, (boolean)Pi.IImImjn("lrgzheel", 574258700, -714624672, -714624663, -714624651, -1630966323, (int)Pi.IImImjn("gbapud", 574258690, -714624649, -714624666, -714624650, -1630966323, (NNPg)Pi.IImImjn("gbapud", 574258688, -714624662, -714624663, -714624664, 2115378771, (NNyx)Pi.IImImjn("vlnlfq", 574258688, -714624659, -714624642, -714624661, 1531094362, (NNiz)((NNiz)Pi.IImImjn("jnjgqn", 574258688, -714624670, -714624658, -714624667, -8509203, (NNuU)((NNuU)Pi.IImImjn("ccrbi", 574258688, -714624665, -714624666, -714624667, 331027764, (Pi)this)[Pi.IImImjn("vlnlfq", 574258694, -714624665, -714624641, -714624669, 935738880)[0]]))[Pi.IImImjn("aevmf", 574258694, -714624665, -714624641, -714624669, 1006581028)[1]]))))));
        Pi.IImImjn("tbvmlqrc", 574258690, -714624652, -714624645, -714624653, -1630966323, (ih)ih2, (boolean)Pi.IImImjn("mzsl", 574258700, -714624672, -714624663, -714624651, -1630966323, (int)Pi.IImImjn("jnjgqn", 574258690, -714624649, -714624666, -714624650, -1630966323, (NNPg)Pi.IImImjn("oxjias", 574258688, -714624662, -714624663, -714624664, -37150181, (NNyx)Pi.IImImjn("cgztu", 574258688, -714624659, -714624644, -714624661, -1785433448, (NNiz)((NNiz)Pi.IImImjn("vlnlfq", 574258688, -714624670, -714624658, -714624667, -787530940, (NNuU)((NNuU)Pi.IImImjn("tbvmlqrc", 574258688, -714624665, -714624666, -714624667, 1851161652, (Pi)this)[Pi.IImImjn("jnjgqn", 574258694, -714624665, -714624641, -714624669, 2016634621)[2]]))[Pi.IImImjn("jnjgqn", 574258694, -714624665, -714624643, -714624669, 438394985)[0]]))))));
        Pi.IImImjn("calojzv", 574258690, -714624652, -714624658, -714624653, -1630966323, (ih)ih2, (boolean)Pi.IImImjn("ccrbi", 574258700, -714624672, -714624663, -714624651, -1630966323, (int)Pi.IImImjn("tbvmlqrc", 574258690, -714624649, -714624666, -714624650, -1630966323, (NNPg)Pi.IImImjn("tbvmlqrc", 574258688, -714624662, -714624663, -714624664, -208344782, (NNyx)Pi.IImImjn("ccrbi", 574258688, -714624659, -714624646, -714624661, -235290003, (NNiz)((NNiz)Pi.IImImjn("ccrbi", 574258688, -714624670, -714624658, -714624667, 181562220, (NNuU)((NNuU)Pi.IImImjn("jnjgqn", 574258688, -714624665, -714624666, -714624667, 2048095968, (Pi)this)[Pi.IImImjn("gbapud", 574258694, -714624665, -714624643, -714624669, 2104867384)[1]]))[Pi.IImImjn("aevmf", 574258694, -714624665, -714624643, -714624669, -1393772027)[2]]))))));
        Pi.IImImjn("lrgzheel", 574258690, -714624652, -714624648, -714624653, -1630966323, (ih)ih2, (boolean)Pi.IImImjn("mzsl", 574258700, -714624672, -714624663, -714624651, -1630966323, (int)Pi.IImImjn("ccrbi", 574258690, -714624649, -714624666, -714624650, -1630966323, (NNPg)Pi.IImImjn("ccrbi", 574258688, -714624662, -714624663, -714624664, 1978873703, (NNyx)Pi.IImImjn("lrgzheel", 574258688, -714624659, -714624647, -714624661, -906822333, (NNiz)((NNiz)Pi.IImImjn("anhwv", 574258688, -714624670, -714624658, -714624667, 1965467672, (NNuU)((NNuU)Pi.IImImjn("oxjias", 574258688, -714624665, -714624666, -714624667, 1635278396, (Pi)this)[Pi.IImImjn("anhwv", 574258694, -714624665, -714624643, -714624669, 138995313)[3]]))[Pi.IImImjn("anhwv", 574258694, -714624665, -714624643, -714624669, -781309285)[4]]))))));
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{28, -8, 15, -97, 55, 8, 114, -48, -67, -75, 54, -83, -109, -53, -102, 102};
        int n = 0;
        int n2 = 168;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 137;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        IIsjm0Om = "\u0095S\u000b\u0013\u00f9\u00e9EW\u00f1\u00f1\u00a9-\u00ff\u0003\u001e\u00c7\u00fdzh\u009b\u00eb\u00d2\u00d3*\u00b6\u007fV\u00a9P\u0015|\u00cf\u00f0D|\u00a4\u00d4\u00b8\u00eeW\u00e4>;\u0091f\u0019\u00c8\u00ffF@\u008c\u00c3\u0090\u00ac\u0002\u00e1m\u00ff\u0003\u001e\u00c7\u00fdzh\u009b\u00eb\u00d2\u00f92\u00b6\u007fL\u0095\u0093\t/\u00d1\u00fem\u0015\u00a4\u00ea\u00c6\u00bd\u000b\u0013\u00f9\u00e9EW\u00f1\u00d3\u00b0\u008f\u0017\u00d4\u0015\u0016\u0003?\u00e2\u00cda\u0015\u00b2\u00e7\u0093\u00e4W\u00de\"r\u0081#(n\u0003\u00c9\u0003\u001e\u00c7\u00fdzh\u009b\u00eb\u00d2\u00ef\u001f\u00b6\u007fL2\u00a5\t/\u00d1\u00fem\u0015\u00b2\u00f1\u00c6\u00a8\u0004\u0011\u00c5\u00c1R\u007f\u00b3\u00a9\u00b3\u00cd(\u00eam\u00de\u0006|\u00d9yf\u000f`\nf\u0003\u00c4\u000b\u0013\u00f9\u00e9EW\u00f1\u00c8\u00b3\u00d3\u001fi\u000b\u0013\u00f9\u00e9EW\u00f1\u00ef\u0095\u00d2+\u0004\u0011\u00c5\u00c1R\u007f\u00b3\u00a9\u00b3\u00cd\u0001\u00f5mB\r\u00f7\u0006\u000b\u0013\u00f9\u00e9EW\u00f1\u00c8\u00b3\u00f6-\u0016o\u00ae\u00ad\u0003?\u00e2\u00cda\u0015\u00b2\u00e7\u0093\u00e4W\u00c24jJ\u0095;n,\u000b\u0013\u00f9\u00e9EW\u00f1\u00ff\u00da\u00eb\u000b\u0013\u00f9\u00e9EW\u00f1\u00ea\u0099+ilS\u000b\u0013\u00f9\u00e9EW\u00f1\u00fc\u0091\u00ccf\u0019\u00e9\u00dav[\u00f1\u00ea\u009c\u00ed\u001f\u00a2\u0019b\u00fc\u0081,!\u00b8#\u001c\u00c4\u000b\u0013\u00f9\u00e9EW\u00f1\u00d6\u00af\u00eb\u000b\u0013\u00f9\u00e9EW\u00f1\u00c8\u00b3\u00ea\u00020\u000b\u0013\u00f9\u00e9EW\u00f1\u00c8\u00b3\u00fa\u0000\u00a6(\u0003\u001e\u00c7\u00fdzh\u009b\u00eb\u00d2\u00ef!\u00b6\u001ajav.z\u00ef\u00dan]\u00f1\u00d5\u0089\u00f1\u0011\u00e31;[L\u0004\u0011\u00c5\u00c1R\u007f\u00b3\u00a9\u0091\u00f5C\u00a4\u001aKDF5\u0007\u00c6\u00d6/V\u00ba\u00bd\u001f\u001a\u000b\u0013\u00f9\u00e9EW\u00f1\u00ea\u0096m^\u00c4\u000b\u0013\u00f9\u00e9EW\u00f1\u00d6\u0094\u00fff\u001c";
        oossj = new int[]{26345482, 14548993, 14614547, 10747905, 19333122, 0xD0000C, 0xDD0001, 65546, 10551299, 0x1070001, 20119564, 6094849, 12517390, 20905996, 13565953, 9371662, 11010060, 27000835, 10289156, 11796490, 1835023, 6160385, 0x1910001, 0x1900001, 7602177, 0x1080001, 16449537, 1, 0x1060001, 25493505, 12451841, 0x1B0001, 6225922, 786447, 21692417, 10813443, 720897, 6357011, 13434882, 17367050, 25559050, 21758009, 16515082, 7667738, 15859721, 14417921, 2818062, 18022420, 19464202, 3735578, 5439498};
        Pi.T();
        Pi.m();
        Pi.s();
        Pi.b();
    }

    private static /* synthetic */ void oojtkq(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[51];
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
        IIsjm0Om = stringBuilder.toString();
        oossj = nArray;
    }

    private static /* synthetic */ String lOrttntp(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{29, -92, 5, 122, 80, -67, 63, 76, -54, 4, -7, 101, 102, -21, -4, -110};
        byte[] byArray3 = new byte[]{-103, -90, -22, 55, -23, -96, -80, 114, -25, 89, -35, -27, 89, 120, 0, -48};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite I1tIt0nij(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = oossj[n2 ^ 0xD567B167];
        int n10 = n9 >>> 16;
        String string2 = Pi.lOrttntp(IIsjm0Om.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0xD567B167);
        n9 = oossj[n3 ^ 0xD567B167];
        int n11 = n9 >>> 16;
        String string3 = Pi.lOrttntp(IIsjm0Om.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0xD567B167);
        n9 = oossj[n4 ^ 0xD567B167];
        int n12 = n9 >>> 16;
        String string4 = Pi.lOrttntp(IIsjm0Om.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0xD567B167);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x223A7EB4) + -178;
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

    private static /* synthetic */ CallSite llptj0p(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = oossj[n2 ^ 0xD567B167];
        int n7 = n6 >>> 16;
        String string2 = Pi.lOrttntp(IIsjm0Om.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xD567B167);
        n6 = oossj[n3 ^ 0xD567B167];
        int n8 = n6 >>> 16;
        String string3 = Pi.lOrttntp(IIsjm0Om.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xD567B167);
        n6 = oossj[n4 ^ 0xD567B167];
        int n9 = n6 >>> 16;
        String string4 = Pi.lOrttntp(IIsjm0Om.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xD567B167);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x223A7EB4) + -178;
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

    private static /* synthetic */ CallSite IImImjn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = oossj[n2 ^ 0xD567B167];
        int n7 = n6 >>> 16;
        String string2 = Pi.lOrttntp(IIsjm0Om.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xD567B167);
        n6 = oossj[n3 ^ 0xD567B167];
        int n8 = n6 >>> 16;
        String string3 = Pi.lOrttntp(IIsjm0Om.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xD567B167);
        n6 = oossj[n4 ^ 0xD567B167];
        int n9 = n6 >>> 16;
        String string4 = Pi.lOrttntp(IIsjm0Om.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xD567B167);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x223A7EB4) + -178;
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
