package logisticspipes.commands.commands;

import logisticspipes.commands.abstracts.ICommandHandler;
import logisticspipes.ticks.RoutingTableUpdateThread;
import net.minecraft.command.ICommandSender;

public class RoutingThreadCommand implements ICommandHandler {
	
	@Override
	public String[] getNames() {
		return new String[]{"routingthread", "rt"};
	}
	
	@Override
	public boolean isCommandUsableBy(ICommandSender sender) {
		return true;
	}
	
	@Override
	public String[] getDescription() {
		return new String[]{"Display Routing thread status information"};
	}
	
	@Override
	public void executeCommand(ICommandSender sender, String[] args) {
		sender.sendChatToPlayer("RoutingTableUpdateThread: Queued: " + RoutingTableUpdateThread.size());
	}
}
