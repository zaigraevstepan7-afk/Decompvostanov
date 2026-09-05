/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNYH
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents
 */
package KDFzREm;

import KDFzREm.NNNNGb;
import KDFzREm.NNNNGv;
import KDFzREm.NNYH;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents;

public class NNNNGY
implements ClientModInitializer {
    public void onInitializeClient() {
        NNNNGb.N();
        ScreenEvents.BEFORE_INIT.register((nNuU, nNYH, n, n2) -> {
            ScreenMouseEvents.allowMouseClick((NNYH)nNYH).register((nNYH2, nRX) -> {
                NNNNGv nNNNGv = NNNNGv.N(nRX.v());
                if (nNNNGv != null) {
                    return !NNNNGb.N(nNYH, nRX.n(), nRX.t(), nNNNGv);
                }
                return true;
            });
            ScreenMouseEvents.allowMouseRelease((NNYH)nNYH).register((nNYH2, nRX) -> {
                NNNNGv nNNNGv = NNNNGv.N(nRX.v());
                if (nNNNGv != null) {
                    return !NNNNGb.y(nNYH, nRX.n(), nRX.t(), nNNNGv);
                }
                return true;
            });
            ScreenMouseEvents.afterMouseScroll((NNYH)nNYH).register((nNYH2, d, d2, d3, d4, bl) -> NNNNGb.N(nNYH, d, d2, d4));
        });
    }
}
