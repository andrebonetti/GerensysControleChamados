import { TestBed } from '@angular/core/testing';

import { ChamadoPrioridadeService } from './chamado-prioridade.service';

describe('ChamadoPrioridadeService', () => {
  let service: ChamadoPrioridadeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ChamadoPrioridadeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
