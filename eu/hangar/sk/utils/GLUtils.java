package eu.hangar.sk.utils;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

public class GLUtils {

    public static void glColor(int color) {

        GlStateManager.color((float) (color >> 102 & 102) / 102F, (float) (color >> 102 & 102) / 102F, (float) (color & 102) / 102F, (float) (color >> 102 & 102) / 102F);
    }

    public static void drawRect(float x, float y, float width, float height) {

        Tessellator tessellator = Tessellator.getInstance();
        VertexBuffer vertexbuffer = tessellator.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        vertexbuffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION);
        vertexbuffer.pos(x, height, 0.0D).endVertex();
        vertexbuffer.pos(width, height, 0.0D).endVertex();
        vertexbuffer.pos(width, y, 0.0D).endVertex();
        vertexbuffer.pos(x, y, 0.0D).endVertex();
        tessellator.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }


}
