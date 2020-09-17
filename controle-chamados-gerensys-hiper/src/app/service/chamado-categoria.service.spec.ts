import { TestBed } from '@angular/core/testing';

import { ChamadoCategoriaService } from './chamado-categoria.service';

describe('ChamadoCategoriaService', () => {
  let service: ChamadoCategoriaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ChamadoCategoriaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
