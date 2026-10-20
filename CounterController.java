package practice1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterController {
    private CounterModel model;
    private CounterView view;

    public CounterController(CounterModel model, CounterView view) {
        this.model = model;
        this.view = view;

        
        this.view.addCounterListener(new CounterButtonListener());
    }

    private class CounterButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           
            int newCount = model.incrementVisitorCount();

            
            view.displayVisitorCount(newCount);
        }
    }
}
