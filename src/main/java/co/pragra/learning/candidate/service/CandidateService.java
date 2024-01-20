package co.pragra.learning.candidate.service;

import co.pragra.learning.candidate.entity.CandidateEntity;
import co.pragra.learning.candidate.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateService {
    @Autowired
    CandidateRepository candidateRepository;

    public List<CandidateEntity> getCandidates() {
        return candidateRepository.findAll();
    }

    public CandidateEntity addCandidate(CandidateEntity candidateEntity) {
        return candidateRepository.save(candidateEntity);
    }

    public Optional<CandidateEntity> getCandidateId(Long id) {
        return candidateRepository.findById(id);
    }
}
