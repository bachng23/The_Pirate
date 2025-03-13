package src.main;

import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Window extends JFrame {

    public Window(GamePanel gamePanel) {
        // Thiết lập tiêu đề cho cửa sổ (tùy chọn)
        setTitle("Game Window");

        // Thiết lập hành động khi đóng cửa sổ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Thêm game panel vào cửa sổ
        add(gamePanel);

        // Cố định kích thước cửa sổ
        setResizable(false);

        // Đặt kích thước cửa sổ vừa với các thành phần bên trong
        pack();

        // Đặt cửa sổ ở giữa màn hình
        setLocationRelativeTo(null);

        // Thêm listener để xử lý khi cửa sổ mất focus
        addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                // Có vẻ như logic ở đây bị đảo ngược
                // Thông thường, bạn sẽ gọi windowFocusLost khi cửa sổ mất focus
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                gamePanel.getGame().windowFocusLost();
            }
        });

        // Hiển thị cửa sổ
        setVisible(true);
    }

}
