package br.com.ifpe.apoo.estacionamento.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogOperacoes {

	private StringBuilder log = new StringBuilder();



	protected void log(String message) {
		String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		log.append(timeStamp).append(" - ").append(message).append("\n");
	}



	// Método para salvar o log em um arquivo
	private void saveLog() {
		try (FileWriter fileWriter = new FileWriter("game_log.txt", true);
				PrintWriter printWriter = new PrintWriter(fileWriter)) {
			printWriter.print(log.toString());
		} catch (IOException e) {
			System.err.println("Erro ao salvar o log: " + e.getMessage());
		}
	}

}
