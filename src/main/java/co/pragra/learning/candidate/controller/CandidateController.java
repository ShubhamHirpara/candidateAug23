package co.pragra.learning.candidate.controller;

import co.pragra.learning.candidate.entity.CandidateEntity;
import co.pragra.learning.candidate.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("candidate")
public class CandidateController {

    @Autowired
    CandidateService candidateService;
    @GetMapping
    public List<CandidateEntity> getAllCandidates() {
        return candidateService.getCandidates();
    }

    @PostMapping
    public CandidateEntity addCandidate(@RequestBody CandidateEntity candidateEntity) {
        return candidateService.addCandidate(candidateEntity);
    }

    /*@GetMapping("/{id}")
    public Optional<CandidateEntity> getCandidateById(@PathVariable Long id) {
        return Optional.of(candidateService.getCandidateId(id));
    }*/
}
