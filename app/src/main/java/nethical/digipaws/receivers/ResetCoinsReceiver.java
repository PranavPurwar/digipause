package nethical.digipaws.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import nethical.digipaws.utils.CoinManager;
import nethical.digipaws.utils.DigiUtils;
import nethical.digipaws.R;

public class ResetCoinsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // in implementation
       // CoinManager.resetCoinCount(context);
        DigiUtils.sendNotification(context,"Aura Coin","Good Morning King, its time to collect Aura again!!",R.drawable.swords);
    }
}
