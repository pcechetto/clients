package com.example.clients.service;

import com.example.clients.dto.ClientDTO;
import com.example.clients.entity.Client;
import com.example.clients.repository.ClientRepository;
import com.example.clients.service.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client not found"));
        return new ClientDTO(client);
    }
}
