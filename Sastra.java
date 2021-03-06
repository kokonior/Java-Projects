import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author sastr
 */
public class Kelompok extends javax.swing.JFrame {

    /**
     * Creates new form Kelompok
     *
     *
     */
    BufferedImage images_tomat1 = null;
    BufferedImage images_tomat2 = null;
    BufferedImage images_tomat3 = null;

    public Kelompok() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoad = new javax.swing.JButton();
        images_1 = new javax.swing.JLabel();
        images_2 = new javax.swing.JLabel();
        images_3 = new javax.swing.JLabel();
        A1 = new javax.swing.JPanel();
        A2 = new javax.swing.JPanel();
        A3 = new javax.swing.JPanel();
        B1 = new javax.swing.JPanel();
        B2 = new javax.swing.JPanel();
        B3 = new javax.swing.JPanel();
        C1 = new javax.swing.JPanel();
        C3 = new javax.swing.JPanel();
        C2 = new javax.swing.JPanel();
        btnHistoRGB = new javax.swing.JButton();
        btnHisIndeks = new javax.swing.JButton();
        btnHisReferensi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoad.setText("LOAD");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        images_1.setBackground(new java.awt.Color(255, 255, 153));
        images_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        images_2.setBackground(new java.awt.Color(255, 255, 153));
        images_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        images_3.setBackground(new java.awt.Color(255, 255, 153));
        images_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout A1Layout = new javax.swing.GroupLayout(A1);
        A1.setLayout(A1Layout);
        A1Layout.setHorizontalGroup(
            A1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );
        A1Layout.setVerticalGroup(
            A1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        A2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout A2Layout = new javax.swing.GroupLayout(A2);
        A2.setLayout(A2Layout);
        A2Layout.setHorizontalGroup(
            A2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );
        A2Layout.setVerticalGroup(
            A2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        A3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout A3Layout = new javax.swing.GroupLayout(A3);
        A3.setLayout(A3Layout);
        A3Layout.setHorizontalGroup(
            A3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );
        A3Layout.setVerticalGroup(
            A3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout B1Layout = new javax.swing.GroupLayout(B1);
        B1.setLayout(B1Layout);
        B1Layout.setHorizontalGroup(
            B1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        B1Layout.setVerticalGroup(
            B1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout B2Layout = new javax.swing.GroupLayout(B2);
        B2.setLayout(B2Layout);
        B2Layout.setHorizontalGroup(
            B2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        B2Layout.setVerticalGroup(
            B2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout B3Layout = new javax.swing.GroupLayout(B3);
        B3.setLayout(B3Layout);
        B3Layout.setHorizontalGroup(
            B3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        B3Layout.setVerticalGroup(
            B3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout C1Layout = new javax.swing.GroupLayout(C1);
        C1.setLayout(C1Layout);
        C1Layout.setHorizontalGroup(
            C1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        C1Layout.setVerticalGroup(
            C1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout C3Layout = new javax.swing.GroupLayout(C3);
        C3.setLayout(C3Layout);
        C3Layout.setHorizontalGroup(
            C3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        C3Layout.setVerticalGroup(
            C3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout C2Layout = new javax.swing.GroupLayout(C2);
        C2.setLayout(C2Layout);
        C2Layout.setHorizontalGroup(
            C2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        C2Layout.setVerticalGroup(
            C2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        btnHistoRGB.setText("Histogram RGB");
        btnHistoRGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoRGBActionPerformed(evt);
            }
        });

        btnHisIndeks.setText("Histogram Indeks");
        btnHisIndeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHisIndeksActionPerformed(evt);
            }
        });

        btnHisReferensi.setText("Histogram Referensi");
        btnHisReferensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHisReferensiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(images_3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(images_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(images_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLoad)
                        .addGap(41, 41, 41)
                        .addComponent(btnHistoRGB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnHisIndeks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHisReferensi)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(A3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(C3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoad)
                    .addComponent(btnHistoRGB)
                    .addComponent(btnHisIndeks)
                    .addComponent(btnHisReferensi))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(images_1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(images_2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(images_3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed

        try {
            String tomat1 = "1.bmp";
            String tomat2 = "102.bmp";
            String tomat3 = "150.bmp";
            File input1 = new File(tomat1);
            File input2 = new File(tomat2);
            File input3 = new File(tomat3);

            images_tomat1 = ImageIO.read(input1);
            images_tomat2 = ImageIO.read(input2);
            images_tomat3 = ImageIO.read(input3);
        } catch (IOException ex) {
            Logger.getLogger(Kelompok.class.getName()).log(Level.SEVERE, null, ex);

        }
        Image scaled_image = images_tomat1.getScaledInstance(images_1.getWidth(), images_1.getHeight(), Image.SCALE_REPLICATE);
        ImageIcon ikonbarucomb = new ImageIcon(scaled_image);
        images_1.setIcon(ikonbarucomb);

        Image scaled_image2 = images_tomat2.getScaledInstance(images_2.getWidth(), images_2.getHeight(), Image.SCALE_REPLICATE);
        ImageIcon ikonbarucomb2 = new ImageIcon(scaled_image2);
        images_2.setIcon(ikonbarucomb2);

        Image scaled_image3 = images_tomat3.getScaledInstance(images_3.getWidth(), images_3.getHeight(), Image.SCALE_REPLICATE);
        ImageIcon ikonbarucomb3 = new ImageIcon(scaled_image3);
        images_3.setIcon(ikonbarucomb3);
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnHistoRGBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoRGBActionPerformed
        int[] hist_1 = histogramRGB(images_tomat1);
        int[] hist_2 = histogramRGB(images_tomat2);
        int[] hist_3 = histogramRGB(images_tomat3);
        gambarHistogram(hist_1, A1, false);
        gambarHistogram(hist_2, B1, false);
        gambarHistogram(hist_3, C1, false);
    }//GEN-LAST:event_btnHistoRGBActionPerformed

    private void btnHisIndeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHisIndeksActionPerformed
        int index = 4;
        int[] hist_1 = histogram_indeks(images_tomat1, index);
        int[] hist_2 = histogram_indeks(images_tomat2, index);
        int[] hist_3 = histogram_indeks(images_tomat3, index);
        gambarHistogram(hist_1, A2, false);
        gambarHistogram(hist_2, B2, false);
        gambarHistogram(hist_3, C2, false);
    }//GEN-LAST:event_btnHisIndeksActionPerformed

    private void btnHisReferensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHisReferensiActionPerformed
        int[] hist_1 = histogramReferensi(images_tomat1, colRef.length);
        int[] hist_2 = histogramReferensi(images_tomat2, colRef.length);
        int[] hist_3 = histogramReferensi(images_tomat3, colRef.length);
        gambarHistogram(hist_1, A3, true);
        gambarHistogram(hist_2, B3, true);
        gambarHistogram(hist_3, C3, true);
    }//GEN-LAST:event_btnHisReferensiActionPerformed

    Color[] colRef = {
        new Color(204, 255, 204),
        new Color(153, 255, 153),
        new Color(102, 255, 102),
        new Color(255, 0, 51),
        new Color(255, 51, 51),
        new Color(255, 51, 102),
        new Color(255, 204, 0),
        new Color(255, 153, 51),
        new Color(255, 255, 102),
        new Color(255, 255, 255)
    };

    int[] histogramReferensi(BufferedImage imagenya, int jumlah_warna) {
        int panjang = imagenya.getHeight();
        int lebar = imagenya.getWidth();

        int[] hist = new int[jumlah_warna];
        for (int i = 0; i < jumlah_warna; i++) {
            hist[i] = 0;
        }
        int max = 0;
        for (int x = 0; x < lebar; x++) {
            for (int y = 0; y < panjang; y++) {
                Color rgb = new Color(imagenya.getRGB(x, y));
                int red = (int) (rgb.getRed());
                int green = (int) (rgb.getGreen());
                int blue = (int) (rgb.getBlue());

                int indeks = hitungSelisih(rgb, colRef);
                hist[indeks]++;
                if (hist[indeks] > max) {
                    max = hist[indeks];
                }
            }
        }
        for (int i = 0; i < hist.length; i++) {
            hist[i] = hist[i] * 100 / max;
        }
        return hist;
    }

    int hitungSelisih(Color asal, Color[] referensi) {
        int r_asal = (int) asal.getRed();
        int g_asal = (int) asal.getGreen();
        int b_asal = (int) asal.getBlue();
        double min = 10000;
        int indeks = 0;

        for (int i = 0; i < referensi.length; i++) {
            int r_target = (int) referensi[i].getRed();
            int g_target = (int) referensi[i].getGreen();
            int b_target = (int) referensi[i].getBlue();

            int d_r = r_asal - r_target;
            int d_g = g_asal - g_target;
            int d_b = b_asal - b_target;

            double d_warna = Math.sqrt((d_r * d_r) + (d_g * d_g) + (d_b * d_b));
            if (d_warna < min) {
                min = d_warna;
                indeks = i;
            }
        }

        return indeks;
    }

    int[] histogram_indeks(BufferedImage imagenya, int indeks) {
        int panjang = imagenya.getHeight();
        int lebar = imagenya.getWidth();

        int pembagi = 256 / indeks;
        int[] hist = new int[(int) Math.pow(indeks, 3)];

        for (int i = 0; i < indeks * indeks * indeks; i++) {
            hist[i] = 0;
        }
        int max = 0;
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {

                Color rgb = new Color(imagenya.getRGB(i, j));
                int red = (int) (rgb.getRed());
                int green = (int) (rgb.getGreen());
                int blue = (int) (rgb.getBlue());

                int i_r = red / pembagi;
                int i_g = green / pembagi;
                int i_b = blue / pembagi;
                hist[(indeks * indeks * i_r) + (indeks * i_g) + i_b]++;
                if (hist[(indeks * indeks * i_r) + (indeks * i_g) + i_b] > max) {
                    max = hist[(indeks * indeks * i_r) + (indeks * i_g) + i_b];
                }
            }
        }
        for (int i = 0; i < hist.length; i++) {
            hist[i] = hist[i] * 100 / max;
        }
        return hist;
    }

    int[] histogramRGB(BufferedImage imagenya) {
        int lebar = imagenya.getWidth();
        int panjang = imagenya.getHeight();
        int[] hist = new int[256 * 3];
        int[] h_red = new int[256];
        int[] h_green = new int[256];
        int[] h_blue = new int[256];

        for (int i = 0; i < h_red.length; i++) {
            h_red[i] = h_green[i] = h_blue[i] = 0;
        }
        int max = 0;
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {

                Color rgb = new Color(imagenya.getRGB(i, j));
                int red = (int) (rgb.getRed());
                int green = (int) (rgb.getGreen());
                int blue = (int) (rgb.getBlue());

                h_red[red]++;
                h_green[green]++;
                h_blue[blue]++;

                hist[red] = h_red[red];
                hist[255 + green] = h_green[green];
                hist[255 + 255 + blue] = h_blue[blue];

                if (h_red[red] > max) {
                    max = h_red[red];
                }
                if (h_green[green] > max) {
                    max = h_green[green];
                }
                if (h_blue[blue] > max) {
                    max = h_blue[blue];
                }
            }

        }
        for (int i = 0; i < hist.length; i++) {
            hist[i] = hist[i] * 100 / max;
        }

        return hist;
    }

    void gambarHistogram(int[] hist, JPanel panelnya, boolean setColor) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < hist.length; i++) {
            dataset.addValue(hist[i], i + "", "");
        }
        JFreeChart chart = ChartFactory.createBarChart("", "", "", dataset, PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        BarRenderer barRenderer = new BarRenderer();
        if (setColor) {
            for (int i = 0; i < hist.length; i++) {
                barRenderer.setSeriesPaint(i, colRef[i]);
            }
            categoryPlot.setBackgroundPaint(new Color(128, 128, 128));
        } else {
            for (int i = 0; i < hist.length; i++) {
                barRenderer.setSeriesPaint(i, new Color(0, 0, 255));
            }
            categoryPlot.setBackgroundPaint(new Color(255, 255, 255));
        }
        categoryPlot.setRenderer(barRenderer);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setMouseWheelEnabled(true);
        panelnya.setLayout(new java.awt.BorderLayout());
        panelnya.add(chartPanel, BorderLayout.CENTER);
        panelnya.validate();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kelompok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kelompok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kelompok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kelompok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kelompok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel A1;
    private javax.swing.JPanel A2;
    private javax.swing.JPanel A3;
    private javax.swing.JPanel B1;
    private javax.swing.JPanel B2;
    private javax.swing.JPanel B3;
    private javax.swing.JPanel C1;
    private javax.swing.JPanel C2;
    private javax.swing.JPanel C3;
    private javax.swing.JButton btnHisIndeks;
    private javax.swing.JButton btnHisReferensi;
    private javax.swing.JButton btnHistoRGB;
    private javax.swing.JButton btnLoad;
    private javax.swing.JLabel images_1;
    private javax.swing.JLabel images_2;
    private javax.swing.JLabel images_3;
    // End of variables declaration//GEN-END:variables
}
