package me.stetchy.servertitle;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class BroadcastTask implements Runnable {
	private String statement;

	public BroadcastTask(String statement) {

		this.statement = statement;
	}

	@Override
	public void run() {
		try {
			for (Player p : Bukkit.getOnlinePlayers())
				TitleUtil.sendActionBar(p, statement);
		} catch (Exception e) {

			for (Player p : Bukkit.getOnlinePlayers())

				p.sendMessage(ChatColor.translateAlternateColorCodes('&',
						statement));
		}
	}
}
