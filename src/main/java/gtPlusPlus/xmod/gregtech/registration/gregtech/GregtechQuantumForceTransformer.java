package gtPlusPlus.xmod.gregtech.registration.gregtech;

import gtPlusPlus.api.objects.Logger;
import gtPlusPlus.core.lib.CORE;
import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.production.GregtechMetaTileEntity_QuantumForceTransformer;

public class GregtechQuantumForceTransformer {

    public static void run() {
        if (gtPlusPlus.core.lib.LoadedMods.Gregtech) {
            Logger.INFO("Gregtech5u Content | Registering Quantum Force Transformer Multiblock.");
            if (CORE.ConfigSwitches.enableMultiblock_QuantumForceTransformer) {
                GregtechItemList.QuantumForceTransformer.set(new GregtechMetaTileEntity_QuantumForceTransformer(
                                31151, "quantumforcetransformer.controller.tier.single", "Quantum Force Transformer")
                        .getStackForm(1L));
            }
        }
    }
}
