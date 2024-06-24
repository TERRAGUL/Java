package net.ya.mptmod.item;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.LivingEntity;

public class AppleMultiToolItem extends Item {
    public AppleMultiToolItem(Properties properties) {
        super(properties);
    }

    public boolean canHarvestBlock(BlockState state) {
        return true;
    }


    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return 12.0f;
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof Player) {
            target.hurt(DamageSource.GENERIC, 1.0f);
            return true;
        }
        return false;
    }


    @Override
    public InteractionResult useOn(UseOnContext context) {

        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Player player = context.getPlayer();
        ItemStack stack = context.getItemInHand();

        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();


        if (block == Blocks.DIRT || block == Blocks.GRASS_BLOCK) {

            if (!world.isClientSide) {
                world.setBlockAndUpdate(pos, Blocks.FARMLAND.defaultBlockState());

                stack.hurtAndBreak(1, player, (p) -> {
                    p.broadcastBreakEvent(context.getHand());
                });
            }
            return InteractionResult.SUCCESS;
        } else {

            if (!canHarvestBlock(state)) {
                return InteractionResult.PASS;
            }

            ItemStack result = new ItemStack(block.asItem());

            if (!player.getInventory().add(result)) {
                Block.popResource(world, pos, result);
            }

            stack.hurtAndBreak(1, player, (p) -> {
                p.broadcastBreakEvent(context.getHand());
            });

            world.removeBlock(pos, false);

            return InteractionResult.SUCCESS;
        }
    }
}
