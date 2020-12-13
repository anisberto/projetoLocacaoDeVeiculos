package br.com.pi.util;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Imagem_util {

    public static BufferedImage setImagemDimensao(String caminhoImg, Integer imgLargura, Integer imgAltura) {
        Double novaImgLargura = null;
        Double novaImgAltura = null;
        Double imgProporcao = null;
        Graphics2D g2d = null;
        BufferedImage imagem = null, novaImagem = null;
        try {
            imagem = ImageIO.read(new File(caminhoImg));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(Imagem_util.class.getName()).log(Level.SEVERE, null, ex);
        }
        novaImgLargura = (double) imagem.getWidth();
        novaImgAltura = (double) imagem.getHeight();
        if (novaImgLargura >= imgLargura) {
            imgProporcao = (novaImgAltura / novaImgLargura);
            novaImgLargura = (double) imgLargura;
            novaImgAltura = (novaImgLargura * imgProporcao);
            while (novaImgAltura > imgAltura) {
                novaImgLargura = (double) (--imgLargura);
                novaImgAltura = (novaImgLargura * imgProporcao);
            }
        } else if (novaImgAltura >= imgAltura) {
            imgProporcao = (novaImgLargura / novaImgAltura);
            novaImgAltura = (double) imgAltura;
            while (novaImgLargura > imgLargura) {
                novaImgAltura = (double) (--imgAltura);
                novaImgLargura = (novaImgAltura * imgProporcao);
            }
        }
        novaImagem = new BufferedImage(novaImgLargura.intValue(), novaImgAltura.intValue(), BufferedImage.TYPE_INT_RGB);
        g2d = novaImagem.createGraphics();
        g2d.drawImage(imagem, 0, 0, novaImgLargura.intValue(), novaImgAltura.intValue(), null);
        return novaImagem;
    }
    public static BufferedImage setImagem(String caminhoImg, Integer imgLargura, Integer imgAltura) {
        Double novaImgLargura = null;
        Double novaImgAltura = null;
        Double imgProporcao = null;
        Graphics2D g2d = null;
        BufferedImage imagem = null, novaImagem = null;
        try {
            imagem = ImageIO.read(new File(caminhoImg));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(Imagem_util.class.getName()).log(Level.SEVERE, null, ex);
        }
        novaImgLargura = (double) imagem.getWidth();
        novaImgAltura = (double) imagem.getHeight();
        if (novaImgLargura >= imgLargura) {
            imgProporcao = (novaImgAltura / novaImgLargura);
            novaImgLargura = (double) imgLargura;
            novaImgAltura = (novaImgLargura * imgProporcao);
            while (novaImgAltura > imgAltura) {
                novaImgLargura = (double) (--imgLargura);
                novaImgAltura = (novaImgLargura * imgProporcao);
            }
        } else if (novaImgAltura >= imgAltura) {
            imgProporcao = (novaImgLargura / novaImgAltura);
            novaImgAltura = (double) imgAltura;
            while (novaImgLargura > imgLargura) {
                novaImgAltura = (double) (--imgAltura);
                novaImgLargura = (novaImgAltura * imgProporcao);
            }
        }
        novaImagem = new BufferedImage(novaImgLargura.intValue(), novaImgAltura.intValue(), BufferedImage.TYPE_INT_RGB);
        g2d = novaImagem.createGraphics();
        g2d.drawImage(imagem, 0, 0, novaImgLargura.intValue(), novaImgAltura.intValue(), null);
        return novaImagem;
    }

    public static byte[] getImgBytes(BufferedImage image) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "JPEG", baos);
        } catch (IOException ex) {
        }
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        return baos.toByteArray();
    }

    public static void exibiImagemLabel(byte[] minhaimagem, javax.swing.JLabel label) {
        if (minhaimagem != null) {
            InputStream input = new ByteArrayInputStream(minhaimagem);
            try {
                BufferedImage imagem = ImageIO.read(input);
                label.setIcon(new ImageIcon(imagem));
            } catch (IOException ex) {
            }
        } else {
            label.setIcon(null);
        }
    }
}
