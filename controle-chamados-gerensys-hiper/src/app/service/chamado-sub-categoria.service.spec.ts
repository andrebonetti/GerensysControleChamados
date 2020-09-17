import { TestBed } from '@angular/core/testing';

import { ChamadoSubCategoriaService } from './chamado-sub-categoria.service';

describe('ChamadoSubCategoriaService', () => {
  let service: ChamadoSubCategoriaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ChamadoSubCategoriaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
