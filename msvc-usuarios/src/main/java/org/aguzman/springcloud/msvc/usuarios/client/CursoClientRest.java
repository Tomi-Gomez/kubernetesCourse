package org.aguzman.springcloud.msvc.usuarios.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "msvc-cursos",url = "host.docker.internal:8002")
public interface CursoClientRest {

    @DeleteMapping("/eliminar-usuario-curso/{id}")
    void eliminarCursoUsuarioPorId(@PathVariable Long id);
}
