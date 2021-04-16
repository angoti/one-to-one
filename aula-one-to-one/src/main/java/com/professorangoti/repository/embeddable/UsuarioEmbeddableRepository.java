package com.professorangoti.repository.embeddable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.professorangoti.domain.embeddable.UsuarioEmbeddable;

public interface UsuarioEmbeddableRepository extends JpaRepository<UsuarioEmbeddable, Integer> {

}
