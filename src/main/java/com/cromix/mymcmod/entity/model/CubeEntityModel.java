package com.cromix.mymcmod.entity.model;

import com.cromix.mymcmod.entity.CubeEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class CubeEntityModel extends EntityModel<CubeEntity>
{
    private final ModelPart base;

    public CubeEntityModel()
    {
        this.textureHeight = 64;
        this.textureWidth = 64;
        base = new ModelPart(this, 0, 0);
        base.addCuboid(-6, -6, -6, 12, 12, 12);
    }

    @Override
    public void setAngles(CubeEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch)
    {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha)
    {
        // translate model down
        matrices.translate(0, 1.125, 0);

        // render cube
        base.render(matrices, vertices, light, overlay);
    }

    @NotNull
    @Override
    public Consumer<ModelPart> andThen(@NotNull Consumer<? super ModelPart> after)
    {
        return super.andThen(after);
    }

}
