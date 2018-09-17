package scott.harwood.sleep.resetter;
import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class SleepListener implements Listener {
    @EventHandler
    public void PlayerBedEnterEvent(PlayerBedEnterEvent event)
    {
        Player p = event.getPlayer();
        p.setStatistic(Statistic.TIME_SINCE_DEATH,0);
        p.sendMessage(ChatColor.GREEN.toString() + "[Phantoms B-Gone] " + p.getDisplayName() + " The Phantoms R-Gone");
    }

}