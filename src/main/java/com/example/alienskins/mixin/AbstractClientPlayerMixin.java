package com.example.alienskins.mixin;

import com.example.alienskins.AlienSkinsClient;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.entity.player.PlayerModelType;
import net.minecraft.world.entity.player.PlayerSkin;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayer.class)
public abstract class AbstractClientPlayerMixin {

    @Inject(method = "getSkin", at = @At("RETURN"), cancellable = true)
    private void alienskins$makeAlien(CallbackInfoReturnable<PlayerSkin> cir) {
        PlayerSkin original = cir.getReturnValue();
        cir.setReturnValue(new PlayerSkin(
                AlienSkinsClient.ALIEN_SKIN,
                original.cape(),
                original.elytra(),
                PlayerModelType.WIDE,
                original.secure()
        ));
    }
}
