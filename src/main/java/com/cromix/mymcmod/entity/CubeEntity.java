package com.cromix.mymcmod.entity;

import net.minecraft.world.World;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;

public class CubeEntity extends PathAwareEntity
{
    public CubeEntity(EntityType<? extends PathAwareEntity> entityType, World world)
    {
        super(entityType, world);
    }

    @Override
    protected void initGoals()
    {
        targetSelector.add(1, new FollowTargetGoal<>(this, PlayerEntity.class, true));
        goalSelector.add(1, new SwimGoal(this));
        goalSelector.add(5, new WanderAroundFarGoal(this, 0.8D));
        goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        goalSelector.add(6, new LookAroundGoal(this));
    }
}
