package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	public GameRepository gameRepository; 
		
	public List<GameMinDTO>  findAll (){
		List<Game> listGame = gameRepository.findAll(); 		
		return	listGame.stream().map(x -> new GameMinDTO(x)).toList();
	}
	

}
